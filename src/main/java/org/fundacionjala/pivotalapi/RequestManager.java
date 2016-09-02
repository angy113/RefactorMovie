package org.fundacionjala.pivotalapi;

import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * Created by AngelaValdez on 8/31/2016.
 */
public final class RequestManager {

    public static final RequestSpecification REQUEST_SPECIFICATION = Connection.getInstance().getRequestSpecification();

    private RequestManager(){

    }
    public static Response get(String endPoint) {
        return Connection.getInstance().getRequestSpecification()
                .when()
                .get(endPoint);
    }

    public static Response post(String endPoint, String body) {
        return RestAssured.given().spec(REQUEST_SPECIFICATION)
                .header("Content-Type","application/json")
                .body(body)
                .when()
                .post(endPoint);
    }

    public static Response post(String endPoint, Map<String, Object> body) {
        return RestAssured.given().spec(REQUEST_SPECIFICATION)
                .params(body)
                .when()
                .post(endPoint);
    }

    public static Response put(String endPoint, String body) {
        return null;
    }

    public static Response put(String endPoint, Map<String, Object> body) {
        return null;
    }

    public static Response delete(String endPoint) {
        return null;
    }

}
