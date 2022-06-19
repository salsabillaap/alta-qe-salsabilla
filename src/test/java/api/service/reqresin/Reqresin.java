package api.service.reqresin;

import net.serenitybdd.rest.SerenityRest;

import java.io.File;

public class Reqresin {

    public static int userid;
    private static final String REQRESIN_BASEURL = "https://reqres.in/";

    public void getSingleUser() {
        SerenityRest.get( REQRESIN_BASEURL + "api/users/" + userid);
    }

    public void postLogin(File data) {
        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(data)
                .post(REQRESIN_BASEURL + "api/login");
    }

    public void postRegister(File data) {
        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(data)
                .post(REQRESIN_BASEURL + "api/register");
    }

    public void putUpdate(File data) {
        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(data)
                .put(REQRESIN_BASEURL + "api/users/" + userid);
    }

    public void deleteUser() {
        SerenityRest.delete(REQRESIN_BASEURL + "api/users/" + userid);
    }
}