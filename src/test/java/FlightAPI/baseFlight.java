package FlightAPI;

import utils.jsonUtils;

import java.io.IOException;
import java.util.Map;

public class baseFlight {
    public static Map<String, Object> datafromJSON;

    static {
        String env = System.getProperty("env") == null ? "qa" : System.getProperty("env");
        try {
            datafromJSON = jsonUtils.getJsonDataasMap("airlines/" + env + "/newAirlineCreationAPIData.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
