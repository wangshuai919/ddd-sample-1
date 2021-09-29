package com.demo.domain.user;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class User {
    private String id;
    private String password;
    private String phoneNo;
    private String realName;
    private String idType;
    private String idCode;
    private List<Role> roles;

    public void registry() {
        if (!validate(idType, idCode)) {
            throw new IdentityException();
        }
        initRoles();
    }

    private boolean validate(String idType, String idCode) {
        // do some valid
        return true;
    }

    private void initRoles() {
        Role defaultRole = new Role();
        defaultRole.setName("普通用户");
        defaultRole.setCode("G01");
        roles.add(defaultRole);
    }
}
