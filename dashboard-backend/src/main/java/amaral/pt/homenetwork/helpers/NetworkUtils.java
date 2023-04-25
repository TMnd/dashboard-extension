package amaral.pt.homenetwork.helpers;

import amaral.pt.homenetwork.HomenetworkResource;
import org.jboss.logging.Logger;

import java.net.InetAddress;

public class NetworkUtils {

    private static final Logger logger = Logger.getLogger(NetworkUtils.class);

    public static Boolean isOnline(String machineIP){
        try{
            InetAddress address = InetAddress.getByName(machineIP);

            return address.isReachable(10000);
        } catch (Exception e){
            logger.error(e.getMessage());
        }

        return false;
    }
}
