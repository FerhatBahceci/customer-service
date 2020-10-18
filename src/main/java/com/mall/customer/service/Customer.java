package com.mall.customer.service;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import java.time.LocalDate;

@Getter
@Builder
public class Customer {

    private Address address;

    @Id
    private Long id;

    private String firstName;
    private String lastName;
    private String phoneNo;
    private String email;
    private LocalDate dateOfBirth;
    private String ssn;
}
