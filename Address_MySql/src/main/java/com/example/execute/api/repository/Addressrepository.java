package com.example.execute.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.execute.api.model.Address;

@Repository
public interface Addressrepository extends JpaRepository<Address, String>{

}
