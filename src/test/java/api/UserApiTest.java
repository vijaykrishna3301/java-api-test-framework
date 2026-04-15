package api;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserApiTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void testGetUserStatus200() {
        given()
                .when()
                .get("/users/1")
                .then()
                .statusCode(200);
    }

    @Test
    public void testGetUserHasName() {
        given()
                .when()
                .get("/users/1")
                .then()
                .body("name", equalTo("Leanne Graham"));
    }
}