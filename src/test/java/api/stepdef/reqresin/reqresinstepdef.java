package api.stepdef.reqresin;

import api.service.reqresin.Reqresin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class reqresinstepdef {

    Reqresin reqresin = new Reqresin();
    @When("user send GET Single User with id {int}")
    public void userSendGETSingleUserWithId(int id) {
        Reqresin.userid =  id;
        reqresin.getSingleUser();
    }

    @Then("response status code should be {int}")
    public void responseStatusCodeShouldBe(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

    @And("response body json schema is {string}")
    public void responseBodyJsonSchemaIs(String data) {
        String path = String.format("schema/%s", data);
        restAssuredThat(response -> response.assertThat().body(matchesJsonSchemaInClasspath(path)));
    }

    @Given("user id is {int}")
    public void userIdIs(int id) {
        Reqresin.userid = id;
    }

    @When("user send POST {string} to reqresin with body json {string}")
    public void userSendPOSTToReqresinWithBodyJson(String arg0, String dataObj) {
        String path = "src/test/resources/payload/" + dataObj;
        File file = new File(String.format(path));
        reqresin.postLogin(file);
        reqresin.postRegister(file);
        reqresin.putUpdate(file);
    }

    @When("user send DELETE to reqresin with user id is {int}")
    public void userSendDELETEToReqresinWithUserIdIs(int id) {
        Reqresin.userid = id;
        reqresin.deleteUser();
    }
}
