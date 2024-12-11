package com.pbs.laptops;

import org.springframework.stereotype.Component;

@Component
public class LenovoLaptop implements Laptop {

	@Override
	public void display() {
		System.out.println("Lenovo laptop");
	}

}
