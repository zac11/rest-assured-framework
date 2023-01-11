package FlightAPI;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import restUtils.RestUtils;
import utils.jsonUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class createNewAirlineObjectMapper {
    @Test
    public void createAirLineNew() throws IOException {
        System.out.println(System.getProperty("env")+ "Env value");
        String env = System.getProperty("env") == null ? "qa" : System.getProperty("env");
        Map<String, Object> data = jsonUtils.getJsonDataasMap("airlines/" + env + "/newAirlineCreationAPIData.json");
        String endpoint = "https://api.instantwebtools.net/v1/airlines";
        Map<String, Object> payload = payloads.requestPayloadAsMap("12012310212", "Air Vistara India", "India", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png", "Come fly with us", "Mumbai", "https://airvistara.in", "2010");
        Response resp = RestUtils.postMethods(endpoint, payload, new HashMap<>());
        Assert.assertEquals(resp.statusCode(), 200);
    }


}
