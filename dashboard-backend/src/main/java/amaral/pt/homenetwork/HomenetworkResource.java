package amaral.pt.homenetwork;

import amaral.pt.helpers.JsonUtils;
import amaral.pt.helpers.NetworkUtils;
import amaral.pt.homenetwork.model.NetworkMachine;
import org.jboss.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Path("/homenetwork")
public class HomenetworkResource {

    private static final Logger logger = Logger.getLogger(HomenetworkResource.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHomenetworkInfo() {

        //GET IPS from databese
        List<String> networkMachineList = new ArrayList<>();
        networkMachineList.add("10.10.0.222"); //Exists
        networkMachineList.add("10.10.0.221"); //Does not exits

        if(networkMachineList.isEmpty()) {
            return Response.noContent().build();
        }

        List<NetworkMachine> result = new ArrayList<>();

        for(String networkMachine: networkMachineList) {
            Boolean getStatus = NetworkUtils.isOnline(networkMachine);
            result.add(new NetworkMachine(networkMachine, getStatus));
        }

        try {
            String homeNetwork = JsonUtils.serialize(result);

            logger.info("Homenetwork Result: " + homeNetwork);

            return Response.ok(homeNetwork).build();
        } catch (IOException e) {
            logger.error(e.getMessage());

            return Response.status(500, e.getMessage()).build();
        }
    }

    @GET
    @Path("/backups")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBackup() {
        return Response.ok().build();
    }

}
