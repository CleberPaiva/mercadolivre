package com.cleberpaiva.mercadolivre.controller

import com.cleberpaiva.mercadolivre.controller.request.PostCustomerRequest
import com.cleberpaiva.mercadolivre.model.CustomerModel
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("customer")
class CustomerController {

    @GetMapping
    fun getCustomer(): CustomerModel {
        return CustomerModel("1","Cleber", "paivadeap@gmail.com")
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody customer: PostCustomerRequest){
        println(customer)
    }
}