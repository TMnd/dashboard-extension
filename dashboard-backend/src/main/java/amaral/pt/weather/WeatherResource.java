package amaral.pt.weather;

import amaral.pt.weather.model.openmeteo.Weather;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/weather")
public class WeatherResource {

    @Inject
    @RestClient
    WeatherService weatherService;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getWeather() {
        Weather teste = this.weatherService.teste(
                52.52,
                13.41,
                true,
                "weathercode,temperature_2m_max,temperature_2m_min",
                "auto"
                );

        ObjectMapper Obj = new ObjectMapper();
        try {
            // Converting the Java object into a JSON string
            String jsonStr = Obj.writeValueAsString(teste);
            // Displaying Java object into a JSON string
            System.out.println(jsonStr);

            return jsonStr;
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    public static class Result {
    }
}
