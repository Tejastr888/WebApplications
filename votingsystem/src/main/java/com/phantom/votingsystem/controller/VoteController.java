package com.phantom.votingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.phantom.votingsystem.entity.Candidates;
import com.phantom.votingsystem.entity.Citizen;
import com.phantom.votingsystem.repositories.CandidateRepo;
import com.phantom.votingsystem.repositories.CitizenRepo;

@Controller
public class VoteController {
	
	@Autowired
	CitizenRepo citizenrepo;
	@Autowired
	CandidateRepo candidaterepo;
	@RequestMapping("/")
	public String goToVote() {
		return "vote.html";
	}
	@RequestMapping("/doLogin")
	public String doLogin(@RequestParam String name,Model model) {
		Citizen citizen=citizenrepo.findByName(name);
		System.out.println(citizen.getHasVoted());
		if(!citizen.getHasVoted()) {
			List <Candidates> candidate=candidaterepo.findAll();
			model.addAttribute("candidate",candidate);
			return "/performvoting.html";
		}else {
			return "/alreadyvoted.html";
		}
		
	}
	@RequestMapping("/voteFor")
	public String voteFor(@RequestParam int id) {
		Candidates c=candidaterepo.findById(id);
		candidaterepo.save(c);
		c.setNumberOfVotes(c.getNumberOfVotes()+1);
		System.out.println(c.getNumberOfVotes());
		candidaterepo.save(c);
		return "/vote.html";
	}
	

}
