package com.phantom.votingsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phantom.votingsystem.entity.Citizen;

@Repository
public interface CitizenRepo extends JpaRepository<Citizen,Integer> {

	public Citizen findByName(String name);
	
}
