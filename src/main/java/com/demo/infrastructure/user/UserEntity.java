package com.demo.infrastructure.user;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@Data
@Builder
@Table(name = "user")
@NoArgsConstructor
public class UserEntity {
    private String id;
    private String password;
    private String phoneNo;
    private String realName;
    private String idType;
    private String idCode;
}
