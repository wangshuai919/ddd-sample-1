package com.demo.domain.user;

public class IdentityException extends RuntimeException {
    public IdentityException() {
        super("身份验证失败！");
    }
}
