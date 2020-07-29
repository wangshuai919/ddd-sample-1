package com.demo.domain.service;

import com.demo.BaseTest;
import com.demo.controller.request.LegalPersonRequest;
import com.demo.domain.model.LegalPerson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class LegalPersonServiceTest extends BaseTest {
    @Autowired
    LegalPersonService legalPersonService;

    @Test()
    void should_return_LegalPerson_when_register_given_legalPersonInfo() throws Exception {
        LegalPersonRequest request = new LegalPersonRequest();
        request.setType("1");
        request.setCompanyName("BaiDu Inc");
        request.setCompanyCode("JLCC999999999999");
        request.setName("李彦宏");
        request.setIdType("1");
        request.setIdCode("111111111111111111");

        LegalPerson legalPerson = legalPersonService.register(request);
        assertTrue(legalPerson.getId().length() > 0);

    }

    @Test()
    void name() throws Exception {
        LegalPersonRequest request = new LegalPersonRequest();
        request.setType("1");
        request.setCompanyName("BaiDu Inc");
        request.setCompanyCode("JLCC999999999999");
        request.setName("李彦宏");
        request.setIdType("1");
        request.setIdCode("111111111111111111");
        legalPersonService.register(request);

        LegalPersonRequest requestNew = new LegalPersonRequest();
        requestNew.setType("1");
        requestNew.setCompanyName("BaiDu Inc");
        requestNew.setCompanyCode("JLCC999999999999");
        requestNew.setName("李彦宏");
        requestNew.setIdType("1");
        requestNew.setIdCode("111111111111111111");
//        LegalPerson legalPerson = legalPersonService.register(requestNew);

        Exception thrown =
            assertThrows(Exception.class,
                    () -> legalPersonService.register(requestNew),
                    "当前企业已注册");

    }
}