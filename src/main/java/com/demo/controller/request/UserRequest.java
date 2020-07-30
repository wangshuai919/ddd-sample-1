package com.demo.controller.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

@Data
@NoArgsConstructor
public class UserRequest {
    @NonNull
    private String phoneNo;
    @NonNull
    private String password;
    @NonNull
    private String realName;
    @NonNull
    private String idType;
    @NonNull
    private String idCode;

}

