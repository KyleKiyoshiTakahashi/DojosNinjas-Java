package com.codingdojo.DojosNinjas.services;



import org.springframework.stereotype.Service;

import com.codingdojo.DojosNinjas.models.Ninja;
import com.codingdojo.DojosNinjas.repositories.NinjaRepo;

@Service
public class NinjaService {
	private final NinjaRepo nr;
	
	public NinjaService(NinjaRepo nr) {
		this.nr = nr;
	}
	public Ninja createNinja(Ninja ninja) {
		return nr.save(ninja);
	}
	
}
