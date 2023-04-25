package amaral.pt.weather;

import amaral.pt.weather.model.openmeteo.Weather;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.time.ZoneId;

@Path("/v1")
@RegisterRestClient
public interface WeatherService {
    @GET
    @Path("/forecast")
    Weather getForecast(
            @QueryParam("latitude") Double latitude,
            @QueryParam("longitude") Double longitude,
            @QueryParam("current_weather") Boolean getCurretnWeather,
            @QueryParam("daily") String dailyInformationList,
            @QueryParam("timezone") ZoneId timezone
            );
}
