package FlightAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class createNewAirline {

    @Test
    public void createNewAirline(){
        Response resp = RestAssured.given().log().all()
                .baseUri("https://api.instantwebtools.net/v1/airlines")
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"id\": 120012031,\n" +
                        "    \"name\": \"Akasa Air\",\n" +
                        "    \"country\": \"India\",\n" +
                        "    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\n" +
                        "    \"slogan\": \"Fly with Akasa\",\n" +
                        "    \"head_quaters\": \"Bengaluru, India\",\n" +
                        "    \"website\": \"www.akasaair.com\",\n" +
                        "    \"established\": \"2021\"\n" +
                        "}")
                .post()
                        .then().log().all().extract().response();
        Assert.assertEquals(resp.statusCode(),200);

    }
}
