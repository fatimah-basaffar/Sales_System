package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Address;

public interface AddressService {
	List<Address> findAll();
	
	Address findById(int id);
}
