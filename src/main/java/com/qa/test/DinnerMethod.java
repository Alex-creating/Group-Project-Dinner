package com.qa.test;


public class DinnerMethod {
	public String getDinner(String userInput) {
		String output = "";
		int j = 0;
		while(j == 0) {
		switch (userInput) {
		case "Italian":
			output = "Is your favourite food Italian?";
			System.out.println(output);
			j = 1;
		case "American":
			output = "Is your favourite food American?";
			System.out.println(output);
			j = 2;
		case "Mexican":
			output = "Is your favourite food Mexican?";
			System.out.println(output);
		   j = 3;
		case "Indian":
			output = "Is your favourite food Indian?";
			System.out.println(output);
			j = 4;
		default:
			output = "There is no recommendation for you currently in our DB. Would you like to enter another food?";
			System.out.println(output);
			break;
		}}
		if(j==1) {output = "Is your favourite food Italian?";}
		if(j==2) {output = "Is your favourite food American?";}
		if(j==3) {output = "Is your favourite food Mexican?";}
		if(j==4) {output = "Is your favourite food Indian?";}
		
		return output;
	}
}