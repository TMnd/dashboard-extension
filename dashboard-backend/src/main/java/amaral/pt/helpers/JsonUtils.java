package amaral.pt.helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.jboss.logging.Logger;

public class JsonUtils {

    private static final Logger logger = Logger.getLogger(JsonUtils.class);

    public static String serialize(Object inputData) throws JsonProcessingException {

        logger.info("Serialize to JSON");

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());

        String jsonStr = mapper.writeValueAsString(inputData);

        return jsonStr;
    }
}
