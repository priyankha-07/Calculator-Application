package com.intern_pentafox.Maven_project_calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class MavenProjectCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenProjectCalculatorApplication.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.println("1.ADD\n2.SUB\n3.MULTIPLY\n.4.Divide ");
		System.out.println("please make a choice");
		int choice=sc.nextInt();
		System.out.println("Enter the number1");
		double number1=sc.nextDouble();
		System.out.println("Enter the number2");
		double number2= sc.nextDouble();
		double result=0;
		switch(choice) {
			case 1:
				result=number1+number2;
				break;
			case 2:
				result=number1-number2;
				break;

			case 3:
				result=number1*number2;
				break;
			case 4:
				result=number1/number2;
				break;
			default : System.out.println("invalid choice");
		}
		System.out.println(result);
	}

}
