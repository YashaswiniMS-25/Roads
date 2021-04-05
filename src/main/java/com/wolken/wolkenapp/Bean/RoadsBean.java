package com.wolken.wolkenapp.Bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RoadsBean {
	private String roadName;
	private String type;
	private PotholesBean potholes;
	public void walk() {
		System.out.println("walking......");
	}
	

}
