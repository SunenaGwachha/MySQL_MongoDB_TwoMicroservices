package com.example.execute.api.service;

import java.util.List;

import com.example.execute.api.model.Address;

public interface AddressService {

	Address addAddress(Address address);

	List<Address> getAddress();

}
