package com.demo.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LegalPerson {
    private String type;
    private String companyName;
    private String companyCode;
    private String name;
    private String idType;
    private String idCode;
    private String id;
}
