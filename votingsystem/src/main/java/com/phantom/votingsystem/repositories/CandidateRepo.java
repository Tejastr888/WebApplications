package com.phantom.votingsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phantom.votingsystem.entity.Candidates;
@Repository
public interface CandidateRepo extends JpaRepository<Candidates,Integer> {
	public Candidates findById(int id);
}

