package com.demo.persistent;

import com.demo.domain.model.LegalPerson;
import com.demo.domain.repository.LegalPersonRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class LegalPersonRepositoryImpl implements LegalPersonRepository{
    private List<LegalPerson> legalPersonList = new ArrayList<>();

    @Override
    public LegalPerson save(LegalPerson legalPerson) {
        legalPerson.setId(UUID.randomUUID().toString());
        legalPersonList.add(legalPerson);
        return legalPerson;
    }
}
