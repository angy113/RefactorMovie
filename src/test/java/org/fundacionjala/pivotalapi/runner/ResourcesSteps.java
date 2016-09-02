package org.fundacionjala.pivotalapi.runner;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.fundacionjala.pivotalapi.Connection;
import org.fundacionjala.pivotalapi.RequestManager;
import org.mortbay.util.ajax.JSON;

import static org.junit.Assert.assertEquals;

public class ResourcesSteps {
    Response response;


    @Then("^I expect Status code (\\d+)$")
    public void iExpectStatusCode(int statusCode) {
        response = Connection.getInstance().getRequestSpecification()
                .when()
                .get("/projects");
        assertEquals(statusCode, response.getStatusCode());
    }

    @When("^I send a (.*) GET request$")
    public void i_send_a_project_GET_request(String endPoint) {
        response = RequestManager.get(endPoint);
    }

    @When("^I send a (.*) POST with the json$")
    public void i_send_a_POST_with_the_json2(String endPoint, String body) {
        response = RequestManager.post(endPoint,body);
        System.out.println(response.body().asString());
        //this.project=response.body().asString();
    }

    @When("^I send a (.*) PUT with the json$")
    public void i_send_a_PUT_request_to_ProjectRequest_with_json(String endPoint, String body) {
        System.out.println("hello");System.out.println(response.getBody().asString());
        System.out.println("baby");
        JsonPath jsonPath = new JsonPath(project);
        int project_id = jsonPath.getInt("id");
        System.out.println(project_id);
//        StringBuilder stringBuilder = new StringBuilder(endPoint);
//        stringBuilder.replace(stringBuilder.indexOf("["),stringBuilder.indexOf("]"),project_id+"");
//        response = RequestManager.put(endPoint,body);
    }
    private String project;
    @And("^I store as a (.*)$")
    public void iStoreAsAProject(String project) {
       //this.project=response.body().asString();
    }

//    @When("^I send a (.*) DELETE request$")
//    public void i_send_a_delete_request() {
//    }
}

