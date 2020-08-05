package com.demo.user;

import io.restassured.response.Response;
import lombok.Builder;

import java.util.function.Consumer;

import static com.demo.BaseRequestBody.body;
import static io.restassured.RestAssured.given;

@Builder
public class UserScenario {
    private String phoneNo;
    private String password;
    private String realName;
    private String idType;
    private String idCode;

    public void register(Consumer<Response> assertion) {
        Response response = given()
                .contentType("application/json")
                .body(body()
                        .put("phoneNo", phoneNo)
                        .put("password", password)
                        .put("realName", realName)
                        .put("idType", idType)
                        .put("idCode", idCode)
                .build())
        .when().post("/api/user/register");

        assertion.accept(response);
    }
}
