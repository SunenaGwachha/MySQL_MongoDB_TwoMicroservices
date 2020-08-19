package com.example.execute.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.execute.api.model.Address;
import com.example.execute.api.repository.Addressrepository;
import com.example.execute.api.service.AddressService;

@Service
public class AddressServcieImpl implements AddressService {

	
	 @Autowired
	    private Addressrepository addressRepository;

	@Override
	public Address addAddress(Address address) {
				return addressRepository.save(address);
	}

	@Override
	public List<Address> getAddress() {
		
		return addressRepository.findAll();
	}

}
