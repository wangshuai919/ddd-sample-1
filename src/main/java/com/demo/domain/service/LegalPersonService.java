package com.demo.domain.service;

import com.demo.controller.request.LegalPersonRequest;
import com.demo.domain.model.LegalPerson;
import com.demo.domain.repository.LegalPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LegalPersonService {
    @Autowired
    LegalPersonRepository legalPersonRepository;

    public LegalPerson register(LegalPersonRequest request) throws Exception {
        LegalPerson legalPerson = transfer(request);
        return legalPersonRepository.save(legalPerson);
    }

    private LegalPerson transfer(LegalPersonRequest request) {
        return LegalPerson.builder()
                    .type(request.getType())
                    .companyName(request.getCompanyName())
                    .companyCode(request.getCompanyCode())
                    .name(request.getName())
                    .idType(request.getIdType())
                    .idCode(request.getIdCode())
                    .build();
    }
}
