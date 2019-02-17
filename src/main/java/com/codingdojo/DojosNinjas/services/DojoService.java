package com.codingdojo.DojosNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.DojosNinjas.models.Dojo;
import com.codingdojo.DojosNinjas.repositories.DojoRepo;

@Service
public class DojoService {
	private final DojoRepo dr;
	
	public DojoService(DojoRepo dr) {
		this.dr = dr;
	}
	public Dojo createDojo(Dojo dojo) {
		return dr.save(dojo);
	}
	public Dojo findDojo(Long dojoId) {
		Optional<Dojo> optionalDojo = dr.findById(dojoId);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}
	public List<Dojo> findAllDojos(){
		return dr.findAll();
	}
}
