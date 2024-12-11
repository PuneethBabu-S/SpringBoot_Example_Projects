package com.pbs.laptops;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DellLaptop implements Laptop {

	@Override
	public void display() {
		System.out.println("Dell laptop");
	}

}
