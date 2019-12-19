package com.komanrudden.springbootlombok;

import com.komanrudden.springbootlombok.examples.ClassWithLombok;
import com.komanrudden.springbootlombok.examples.ClassWithoutLombok;

public class SpringBootLombokApplication {
	public static void main(String[] args) {
		SpringBootLombokApplication sbla = new SpringBootLombokApplication();
		sbla.print();
	}

	public void print() {
		ClassWithoutLombok withoutLombok = new ClassWithoutLombok("Koman", "Rudden");
		ClassWithLombok withLombok = new ClassWithLombok("Koman", "Rudden");
		ClassWithLombok withLombokBuilder = ClassWithLombok.builder().firstName("Koman").surname("Rudden").build();

		System.out.println("Calling standard toString()");
		System.out.println("----------------------------------------------------");
		System.out.println(withoutLombok.toString());
		System.out.println("----------------------------------------------------\n");
		System.out.println("Calling Lombok-created toString() using @Data");
		System.out.println("----------------------------------------------------");
		System.out.println(withLombok.toString());
		System.out.println("----------------------------------------------------\n");
		System.out.println("Demoing logging with standard java.util.logging & @SLF4j");
		System.out.println("----------------------------------------------------");
		withoutLombok.letsDemoLogging();
		withLombok.letsDemoLogging();
		System.out.println("----------------------------------------------------\n");
		System.out.println("Created object using Lombok @Builder and calling toString()");
		System.out.println("----------------------------------------------------");
		System.out.println(withLombokBuilder.toString());
		System.out.println("----------------------------------------------------");
	}
}
