package com.wolken.wolkenapp.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Util {
	public static void main(String[] args) {
		ApplicationContext applicationcontect=new ClassPathXmlApplicationContext("context.xml");
		RoadsBean bean1=applicationcontect.getBean(RoadsBean.class);
		bean1.walk();
		System.out.println(bean1.getRoadName());
		
		System.out.println(bean1.getType());
		PotholesBean bean2=applicationcontect.getBean(PotholesBean.class);
		bean2.ruinBack();
		System.out.println(bean2.getNoOfHoles());
		System.out.println(bean2.getArea());
		
		
		
		 
	}

}
