package com.demo.interfaces.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
public class UserRequest {
    @NotNull
    private String phoneNo;
    @NotNull
    private String password;
    @NotNull
    private String realName;
    @NotNull
    private String idType;
    @NotNull
    private String idCode;
}
