package FlightAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.RestUtils;


import java.util.HashMap;


public class createNewAirline {

    @Test
    public void createNewAirline(){
        String path = "https://api.instantwebtools.net/v1/airlines";
        String requestPayload = "{\n" +
                "    \"id\": 12712121,\n" +
                "    \"name\": \"Akasa Air\",\n" +
                "    \"country\": \"India\",\n" +
                "    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\n" +
                "    \"slogan\": \"Fly with Akasa air\",\n" +
                "    \"head_quaters\": \"Bengaluru, India\",\n" +
                "    \"website\": \"www.akasaair.com\",\n" +
                "    \"established\": \"2021\"\n" +
                "}";
       Response resp = RestUtils.postMethods(path,requestPayload, new HashMap<>());
        Assert.assertEquals(resp.statusCode(),200);

    }

    @Test
    public void createNewAirlineNew1(){
        String endpoint = "https://api.instantwebtools.net/v1/airlines";
        String reqPayload = payloads.requestPayloadAsString("1234121",
                "Hainan Air","China","https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png",
                "Fly with China","Hainan - China","https://hainanair.cn","1992");
        Response resp = RestUtils.postMethods(endpoint,reqPayload, new HashMap<>());
        Assert.assertEquals(resp.statusCode(),200);
    }
}
