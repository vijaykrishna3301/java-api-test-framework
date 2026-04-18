package api;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserApiTest extends BaseTest{

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
    @Test
    public void testGetUserEmailAndPhone() {
        given()
                .when()
                .get("/users/1")
                .then()
                .statusCode(200)
                .body("email", equalTo("Sincere@april.biz"))
                .body("phone", notNullValue())
                .body("address.city", equalTo("Gwenborough")); // nested field!
    }

    @Test
    public void testGetAllUsersReturns10() {
        given()
                .when()
                .get("/users")
                .then()
                .statusCode(200)
                .body("size()", equalTo(10)); // validates list size
    }
}