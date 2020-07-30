package com.demo.controller.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class UserRequest {
    @NonNull
    private String type;
    @NonNull
    private String companyName;
    @NonNull
    private String companyCode;
    @NonNull
    private String name;
    @NonNull
    private String idType;
    @NonNull
    private String idCode;

}

