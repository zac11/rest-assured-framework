package utils;

import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestUtils {
    public static Response postMethods(String path, String requestPayload, Map<String,String> headers){
        return RestAssured.given().log().all()
                .baseUri(path)
                .headers(headers)
                .contentType(ContentType.JSON)
                .body(requestPayload)
                .post()
                .then().log().all().extract().response();
    }
}
