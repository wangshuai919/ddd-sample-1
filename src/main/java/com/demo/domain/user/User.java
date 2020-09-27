package com.demo.domain.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String id;
    private String password;
    private String phoneNo;
    private String realName;
    private String idType;
    private String idCode;
}
