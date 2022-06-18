package api.service.reqresin;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

import java.io.File;

public class Reqresin {

    private static final String REQRESIN_BASEURL = "https://reqres.in";

    private String setBodyJson() {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email", "eve.holt@reqres.in");
        bodyJson.put("password", "pistol");

        return bodyJson.toString();
    }
    public static Response response;

    public void postLogin() {
        SerenityRest.given()
                .header("Content-type", "app/json")
                .body(setBodyJson())
                .post(REQRESIN_BASEURL + "api/login");
    }

    public void getSingleUser() {
        SerenityRest.given()
                .get(REQRESIN_BASEURL + "/api/users/2");
    }

    public void postLoginWithParam(String jsonPath) {
        File bodyJson = new File(String.format("src/test/resources/payload/%s", jsonPath));

        SerenityRest.given()
                .header("Content-type", "app/json")
                .body(bodyJson)
                .post(REQRESIN_BASEURL + "/api/login");
    }

    public void postRegister() {
        SerenityRest.given()
                .header("Content-type", "app/json")
                .body(setBodyJson())
                .post(REQRESIN_BASEURL + "/api/register");
    }
}
