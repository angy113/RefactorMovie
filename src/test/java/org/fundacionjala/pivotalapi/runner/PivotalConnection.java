package org.fundacionjala.pivotalapi.runner;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import io.restassured.response.Response;
import org.fundacionjala.pivotalapi.Connection;

import static org.junit.Assert.assertEquals;

/**
 * Created by AngelaValdez on 9/1/2016.
 */
public class PivotalConnection {
    @Given("^I have set a connection to pivotal_tracker API service$")
    public void i_have_set_a_connection_to_pivotal_tracker_API_service(){
        Response response = Connection.getInstance().getRequestSpecification()
                .when().get("/projects");
        assertEquals(response.getStatusCode(),200);

    }
}
