package api.stepdef.reqresin;

import api.service.reqresin.Reqresin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.Assert;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.MatcherAssert.assertThat;

public class reqresinstepdef {

    Reqresin reqresin = new Reqresin();
    @When("user send POST login request to reqresin with body json {string}")
    public void userSendPOSTLoginRequestToReqresinWithBodyJson(String jsonPath) {
        reqresin.postLoginWithParam(jsonPath);
    }

    @Then("response status code should be {int}")
    public void responseStatusCodeShouldBe(int expectedStatus) {
//        Assert.assertEquals(expectedStatus, Reqresin.response.getStatusCode());
        restAssuredThat(response -> response.statusCode(expectedStatus));
    }

    @And("response body with jsonPath {string} should have type String")
    public void responseBodyWithJsonPathShouldHaveTypeString(String jsonPath) {

        assert Reqresin.response.body().jsonPath().get(jsonPath) instanceof String;
    }

    @When("user send GET Users request to reqresin")
    public void userSendGETUsersRequestToReqresin() {
        reqresin.getSingleUser();
    }

    @And("response body {string} should be {int}")
    public void responseBodyShouldBe(String id, int expected) {
        int output = Reqresin.response.jsonPath().get(id);
        Assert.assertEquals(expected, output);
    }

    @And("response body {string} should be {string}")
    public void responseBodyShouldBe(String email, String expectedEmail) {
        String outputEmail = Reqresin.response.jsonPath().get(email);
        Assert.assertEquals(expectedEmail, outputEmail);
    }

    @And("response body json schema is {string}")
    public void responseBodyJsonSchemaIs(String data) {
        String path = String.format("schema/%s", data);
        restAssuredThat(response -> response.assertThat().body(matchesJsonSchemaInClasspath(path)));
    }

    @When("user send POST Register request to reqresin")
    public void userSendPOSTRegisterRequestToReqresin() {
        reqresin.postRegister();
    }

    @And("response body {string} should have type String")
    public void responseBodyShouldHaveTypeString(String jsonPath) {
        assert Reqresin.response.body().jsonPath().get(jsonPath) instanceof String;
    }


}