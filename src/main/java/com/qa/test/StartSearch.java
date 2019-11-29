package com.qa.test;

public class StartSearch {

	public class startSearch{
		public String startSearch(String input) {
		if (input.equals("pasta")) {
			return "Italian";}
		else if (input.equals("burger") || input.equals("burgers")) {
			return "American";}
		else if (input.equals("tacos")) {
			return "Mexican";}
		else if (input.equals("curry")) {
			return "Indian";}
		else {
			return null;}	
}}}
