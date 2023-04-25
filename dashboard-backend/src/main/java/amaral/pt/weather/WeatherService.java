package amaral.pt.weather;

import amaral.pt.weather.model.openmeteo.Weather;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/v1")
@RegisterRestClient
public interface WeatherService {
    @GET
    @Path("/forecast")
    Weather teste(
            @QueryParam("latitude") Double latitude,
            @QueryParam("longitude") Double longitude,
            @QueryParam("current_weather") Boolean getCurretnWeather,
            @QueryParam("daily") String dailyInformationList,
            @QueryParam("timezone") String timezone
            );

//   {"temperature":8.4,"windspeed":13.1,"winddirection":254.0,"weathercode":2,"is_day":0,"time":"2023-04-24T23:00"}}
//   curl "https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current_weather=true&daily=weathercode,temperature_2m_max,temperature_2m_min&timezone=auto"

//  resposta:
//  {"latitude":52.52,"longitude":13.419998,"generationtime_ms":0.7510185241699219,"utc_offset_seconds":7200,"timezone":"Europe/Berlin","timezone_abbreviation":"CEST","elevation":38.0,"current_weather":{"temperature":8.4,"windspeed":13.1,"winddirection":254.0,"weathercode":2,"is_day":0,"time":"2023-04-25T01:00"},"daily_units":{"time":"iso8601","weathercode":"wmo code","temperature_2m_max":"°C","temperature_2m_min":"°C"},"daily":{"time":["2023-04-25","2023-04-26","2023-04-27","2023-04-28","2023-04-29","2023-04-30","2023-05-01"],"weathercode":[80,61,3,61,3,2,80],"temperature_2m_max":[10.5,10.5,11.9,11.2,15.1,18.6,19.6],"temperature_2m_min":[5.5,2.6,3.7,6.7,6.3,5.5,9.5]}}

//WMO Weather interpretation codes (WW)
//Code	Description
//0	Clear sky
//1, 2, 3	Mainly clear, partly cloudy, and overcast
//45, 48	Fog and depositing rime fog
//51, 53, 55	Drizzle: Light, moderate, and dense intensity
//56, 57	Freezing Drizzle: Light and dense intensity
//61, 63, 65	Rain: Slight, moderate and heavy intensity
//66, 67	Freezing Rain: Light and heavy intensity
//71, 73, 75	Snow fall: Slight, moderate, and heavy intensity
//77	Snow grains
//80, 81, 82	Rain showers: Slight, moderate, and violent
//85, 86	Snow showers slight and heavy
//95 *	Thunderstorm: Slight or moderate
//96, 99 *	Thunderstorm with slight and heavy hail
}
