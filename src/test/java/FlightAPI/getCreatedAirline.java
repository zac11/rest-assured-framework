package FlightAPI;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
public class getCreatedAirline {
    @Test
    public void getAirline(){
        Response resp = RestAssured.given().log().all()
                .baseUri("https://api.instantwebtools.net/v1/airlines/120012031")
                .contentType(ContentType.JSON)
                .get()
                .then().log().all().extract().response();

        Assert.assertEquals(resp.statusCode(),200);
    }




}
