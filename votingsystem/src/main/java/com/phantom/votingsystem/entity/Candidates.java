package com.phantom.votingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="candidates")
@Entity
public class Candidates {

	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="numberofvotes")
	private int numberOfVotes;
	@Column(name = "candidate_name")
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Candidates() {
		super();
	}

	public Candidates(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getNumberOfVotes() {
		return numberOfVotes;
	}

	public void setNumberOfVotes(int numberOfVotes) {
		this.numberOfVotes = numberOfVotes;
	}

	public Candidates(Integer id, String name, int numberOfVotes) {
		super();
		this.id = id;
		this.name = name;
		this.numberOfVotes = numberOfVotes;
	}
	
	

}
