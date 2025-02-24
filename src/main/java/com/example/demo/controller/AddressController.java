package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Address;
import com.example.demo.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/all")
	public List<Address> getAll(){
		return addressService.findAll();
	}
	
	@GetMapping("/byid/{id}")
	public Address getAddressById(@PathVariable int id) {
		return addressService.findById(id);
	}
}
