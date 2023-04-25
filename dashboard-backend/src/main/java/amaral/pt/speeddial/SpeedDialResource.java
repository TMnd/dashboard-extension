package amaral.pt.speeddial;

import amaral.pt.helpers.JsonUtils;
import amaral.pt.speeddial.model.Dial;
import amaral.pt.speeddial.model.Result;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.jboss.logging.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/speeddial")
public class SpeedDialResource {

    private static final Logger logger = Logger.getLogger(SpeedDialResource.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDials() {

        //GET IPS from databese
        List<Dial> dialList = new ArrayList<>();
        dialList.add(new Dial("Sapo","http://www.sapo.pt","url"));
        dialList.add(new Dial("Facebook","http://www.facebook.com","url"));
        dialList.add(new Dial("Youtube","http://www.youtube.com","url"));

        if(dialList.isEmpty()) {
            return Response.noContent().build();
        }

        Result result = new Result(dialList);

        try {
            String speedDials = JsonUtils.serialize(result);

            logger.info("Speeddials Result: " + speedDials);

            return Response.ok(speedDials).build();
        } catch (JsonProcessingException e) {
            logger.error(e.getMessage());

            return Response.status(500, e.getMessage()).build();
        }
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response createDial() {
        return Response.created(null).build();
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response removeDial() {
        return Response.ok().build();
    }

    @PATCH
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateDial() {
        return Response.ok().build();
    }


}
