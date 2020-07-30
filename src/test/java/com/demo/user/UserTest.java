package com.demo.user;

import com.demo.BaseTest;
import org.junit.jupiter.api.Test;

import static com.demo.BaseRequestBody.body;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class UserTest extends BaseTest {
    @Test
    void should_return_user_when_register_given_correct_info() {
        given().contentType("application/json")
                .body(body()
                        .put("phoneNo", "13800138000")
                        .put("password", "password")
                        .put("realName", "张建国")
                        .put("idType", 1)
                        .put("idCode", "11111111111111111")
                        .build())
                .when().post("/api/user/register")
                .then().log().body()
                .body("id", notNullValue())
                .body("password", equalTo("password"))
                .statusCode(200);

    }
}
