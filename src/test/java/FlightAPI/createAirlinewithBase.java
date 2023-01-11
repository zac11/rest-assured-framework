package FlightAPI;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import restUtils.RestUtils;
import utils.jsonUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class createAirlinewithBase extends AirlineAPIs{

    @Test
    public void createAirlineWBaseClass() throws IOException {

        Map<String, Object> payload = payloads.requestPayloadAsMap("3411241221", "Air Vistara India", "India", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png", "Come fly with us", "Mumbai", "https://airvistara.in", "2010");
        Response resp = createANewAirline(payload);
        Assert.assertEquals(resp.statusCode(), 200);
    }


}
