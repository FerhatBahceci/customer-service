package com.mall.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerGateway customerGateway;

    public CustomerServiceImpl(CustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }

    @Override
    public Mono<Customer> getCustomer(Long id) {
        return customerGateway.getCustomerById(id);
    }

    //TODO 1. ON POST Customer, do regExp on for instance email address, street address etc with outher words validate input
    // 2. Also, once we have fully constructed customer-service, lets publish a message that we have created a Customer so that this message
    // will be consumed by a consumer in another micro-service responsible for instance sending Welcome Email to the customer! This another
    // micro-service could also be responsible for sending reset password emails etc.
}
