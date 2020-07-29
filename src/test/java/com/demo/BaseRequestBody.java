package com.demo;

import java.util.HashMap;
import java.util.Map;

public class BaseRequestBody {

    private Map<String, Object> body = new HashMap<>();

    public static BaseRequestBody body() {
        return new BaseRequestBody();
    }

    public BaseRequestBody put(String key, Object value) {
        this.body.put(key, value);
        return this;
    }

    public Map<String, Object> build() {
        return this.body;
    }
}

