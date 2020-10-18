package com.mall.customer.service;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;

@Builder
@Getter
public class Address {

    @Id
    private Long id;
    private String streetName;
    private String streetNumber;
    private String postCode;
    private String postalCity;
}
