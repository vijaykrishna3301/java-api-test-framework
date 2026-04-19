package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import models.Post;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostApiTest extends BaseTest{

    @Test
    public void testCreatePost() {
        String requestBody = "{"
                + "\"title\": \"My First Post\","
                + "\"body\": \"This is a test post\","
                + "\"userId\": 1"
                + "}";

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .statusCode(201)                          // 201 = Created
                .body("title", equalTo("My First Post"))
                .body("userId", equalTo(1))
                .body("id", notNullValue());              // server assigns id
    }

    @Test
    public void testUpdatePost() {
        String requestBody = "{"
                + "\"title\": \"Updated Title\","
                + "\"body\": \"Updated body\","
                + "\"userId\": 1,"
                + "\"id\": 1"
                + "}";

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .put("/posts/1")
                .then()
                .statusCode(200)
                .body("title", equalTo("Updated Title"));
    }

    @Test
    public void testDeletePost() {
        given()
                .when()
                .delete("/posts/1")
                .then()
                .statusCode(200); // JSONPlaceholder returns 200 for delete
    }
    @Test
    public void testCreatePostWithPojo() {
        Post newPost = new Post("My First Post", "This is a test post", 1);

        given()
                .contentType(ContentType.JSON)
                .body(newPost)
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .body("title", equalTo(newPost.getTitle()))
                .body("userId", equalTo(newPost.getUserId()))
                .body("id", notNullValue());
    }
    @Test
    public void testGetUserAsPojoAndAssert() {
        User user = given()
                .when()
                .get("/users/1")
                .then()
                .statusCode(200)
                .extract()
                .as(User.class);

        Assert.assertEquals(user.getName(), "Leanne Graham");
        Assert.assertNotNull(user.getEmail());
        Assert.assertEquals(user.getId(), 1);
    }
    @Test
    public void testUpdatePostWithPojo() {
        Post updatedPost = new Post("Updated Title", "Updated body", 1);
        updatedPost.setId(1);

        given()
                .contentType(ContentType.JSON)
                .body(updatedPost)
                .when()
                .put("/posts/1")
                .then()
                .statusCode(200)
                .body("title", equalTo("Updated Title"));
    }
}
