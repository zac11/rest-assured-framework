package FlightAPI;

import io.restassured.response.Response;
import restUtils.RestUtils;

import java.util.HashMap;
import java.util.Map;

public class AirlineAPIs {

    public Response createANewAirline(Map<String,Object> createAirlinePayload){
        String endpoint = (String) baseFlight.datafromJSON.get("createAirlineEndpoint");
        return RestUtils.postMethods(endpoint, createAirlinePayload, new HashMap<>());
    }
}
