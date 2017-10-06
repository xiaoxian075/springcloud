package com.forezp.feign.service;

import org.springframework.stereotype.Component;

import com.forezp.feign.inter.SchedualServiceHi;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}

}
