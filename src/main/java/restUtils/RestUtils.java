package restUtils;

import java.util.Map;
import java.util.Objects;

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
    public static Response postMethods(String path, Map<String, Object> requestPayload, Map<String,String> headers){
        return RestAssured.given().log().all()
                .baseUri(path)
                .headers(headers)
                .contentType(ContentType.JSON)
                .body(requestPayload)
                .post()
                .then().log().all().extract().response();
    }
}
