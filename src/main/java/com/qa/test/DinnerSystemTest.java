package com.qa.test;

import java.util.Scanner;

import org.junit.Test;

import junit.framework.Assert;


public class DinnerSystemTest {

	@Test
	public void testPasta() {
		FoodInput food = new FoodInput();
		DinnerMethod method = new DinnerMethod();
		FinalAnswer response = new FinalAnswer();
		
		String response1 ="";
		while((response1 != "pasta") || (response1 != "burgers") || (response1 != "burger") || (response1 != "curry") || (response1 != "tacos")) {
		response1 = food.foodInput();
		}
		String choice = method.getDinner(response1);
		Boolean what = response.finalAnswer();
		
		
		/*System.out.println(response);*/
		/*Assert.assertEquals("pasta", response);*/
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Test
	public void testSearch() {
		FoodInput food2 = new FoodInput();
		String tester1 = food2.foodInput();
		String tester2 = food2.foodInput();
		String tester3= food2.foodInput();
		String tester4 = food2.foodInput();
		
		StartSearch search = new StartSearch();
		String sayPasta = search.startSearch(tester1);
		String sayBurger = search.startSearch(tester2);
		String sayTacos = search.startSearch(tester3);
		String sayCurry = search.startSearch(tester4);
		
		Assert.assertEquals("Italian", sayPasta);
		Assert.assertEquals("American", sayBurger);
		Assert.assertEquals("Mexican", sayTacos);
		Assert.assertEquals("Indian", sayCurry);
	}*/
	
}
