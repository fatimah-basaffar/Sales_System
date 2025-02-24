package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Address;
import com.example.demo.repository.AddressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImp implements AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public List<Address> findAll() {
		return addressRepository.findAll();
	}

	@Override
	public Address findById(int id) {
		return addressRepository.findById(id).orElse(null);
	}
	
}
