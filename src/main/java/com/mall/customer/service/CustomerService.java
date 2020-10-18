package com.mall.customer.service;

import reactor.core.publisher.Mono;

public interface CustomerService {

    Mono<Customer> getCustomer(Long id);
}
