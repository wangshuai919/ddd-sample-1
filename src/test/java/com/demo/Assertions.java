package com.demo;

import io.restassured.response.Response;

import java.util.function.Consumer;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.core.Is.is;

public class Assertions {

    public static Consumer<Response> assertCode(String code) {
        return (response) -> response.then().log().body()
                .body("code", is(code));
    }

    public static Consumer<Response> assertStatus(int code) {
        return (response) -> response.then().log().body()
                .statusCode(code);
    }

    public static Consumer<Response> assertMessage(String message) {
        return (response) -> response.then().body("message", is(message));
    }

    public static Consumer<Response> assertBooleanData(boolean data) {
        return (response) -> response.then().body("data", is(data));
    }

    public static Consumer<Response> assertDataEqualTo(String jsonPath, String value) {
        return (response) -> response.then().body(jsonPath, equalTo(value));
    }

    public static Consumer<Response> assertDataItems(String jsonPath, String... multiValue) {
        return (response) -> response.then().body(jsonPath, hasItems(multiValue));
    }

    public static Consumer<Response> assertArrayData(String valueFilter, String verifyField, String verifyValue) {
        return (response) -> response.then().body("data.findAll{ it." + valueFilter + " }." + verifyField, hasItems(verifyValue));
    }
}

