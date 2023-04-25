package amaral.pt.weather;

import amaral.pt.generalhelper.JsonUtils;
import amaral.pt.weather.helpers.DateUtils;
import amaral.pt.weather.model.Forecast;
import amaral.pt.weather.model.Result;
import amaral.pt.weather.model.openmeteo.Weather;
import amaral.pt.weather.model.openmeteo.WeatherCodeEnum;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

@Path("/weather")
public class WeatherResource {

    private Integer FORECAST_NUMBER_OF_DAYS = 7;
    private static final Logger logger = Logger.getLogger(WeatherResource.class);

    @Inject
    @RestClient
    WeatherService weatherService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getWeather() {
        Weather openMeteoForecast = this.weatherService.getForecast(
                52.52,
                13.41,
                true,
                "weathercode,temperature_2m_max,temperature_2m_min",
                ZoneId.systemDefault()
                );

        Double temperature = openMeteoForecast.getCurrentWeather().getTemperature();
        Double windspeed = openMeteoForecast.getCurrentWeather().getWindspeed();
        Double windDirection = openMeteoForecast.getCurrentWeather().getWindDirection();
        Long weatherCode = openMeteoForecast.getCurrentWeather().getWeathercode();
        Boolean isDay = openMeteoForecast.getCurrentWeather().getIsDay();
        String getRequestTime = openMeteoForecast.getCurrentWeather().getTime();
        List<String> timeList = openMeteoForecast.getDaily().getTime();
        List<Long> weathercodeList = openMeteoForecast.getDaily().getWeathercode();
        List<Integer> temperature2mMaxList = openMeteoForecast.getDaily().getTemperature_2m_max();
        List<Integer> temperature2mMinList = openMeteoForecast.getDaily().getTemperature_2m_min();

        List<Forecast> forecastList = new ArrayList<>();

        for(int i = 0; i < FORECAST_NUMBER_OF_DAYS; i++) {
            String weekDay = DateUtils.getWeekDayByDate(timeList.get(i));
            Forecast forecast = new Forecast(
                    weekDay,
                    WeatherCodeEnum.getWeatherKey(weathercodeList.get(i)),
                    temperature2mMaxList.get(i),
                    temperature2mMinList.get(i)
            );
            forecastList.add(forecast);
        }

        String weatherKey = WeatherCodeEnum.getWeatherKey(weatherCode);
        String formatDateFormRequestTime = getRequestTime.replace("T", " ");

        Result result = new Result(
                temperature,
                windspeed,
                windDirection,
                weatherKey,
                isDay,
                formatDateFormRequestTime,
                forecastList
        );

        try {
            String watherData = JsonUtils.serialize(result);

            logger.info("Weather Result: " + watherData);

            return Response.ok(watherData).build();
        } catch (IOException e) {
            logger.error(e.getMessage());

            return Response.status(500, e.getMessage()).build();
        }
    }
}
