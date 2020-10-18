package com.mall.customer.service;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface CustomerGateway extends ReactiveCrudRepository<Customer, Long> {

    Mono<Customer> getCustomerById(Long id);
}
