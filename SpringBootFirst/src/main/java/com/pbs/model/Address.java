package com.pbs.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("${state}")
	private String state;
	@Value("${city}")
	private String city;
	@Value("${zip}")
	private String zip;
	
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", zip=" + zip + "]";
	}
	
	
}
