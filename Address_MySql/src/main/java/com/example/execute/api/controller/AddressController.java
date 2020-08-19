package com.example.execute.api.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.execute.api.model.Address;
import com.example.execute.api.service.AddressService;


@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping(value = "/addAddress")
    public Address addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }


    @GetMapping(value = "/getAddress")
    public List<Address> getAddress(){
        return addressService.getAddress();
    }




}