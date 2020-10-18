package com.mall.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/customer-service")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("/{id}")
    @ResponseBody
    public Mono<Customer> getCustomer(@PathVariable("id") Long id) {
        return customerService.getCustomer(id);
    }

    //TODO add POST, DELETE, UPDATE customer, getCustomers etc.
}
