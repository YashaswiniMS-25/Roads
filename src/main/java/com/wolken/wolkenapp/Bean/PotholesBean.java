package com.wolken.wolkenapp.Bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PotholesBean {
	
	private int noOfHoles;
	private String area;
	
	public void ruinBack() {
		System.out.println("injury");
	}
	

}
