package com.test;

	import org.testng.annotations.Test;

import com.objects.BasePage;
import com.objects.HomePageObjects;

import org.testng.AssertJUnit;
	import org.testng.annotations.Test;
	import org.testng.annotations.Test;
	import org.testng.AssertJUnit;
	import org.testng.annotations.Test;
	import org.testng.annotations.Test;
	import org.testng.AssertJUnit;
	import org.testng.annotations.Test;
	import org.testng.AssertJUnit;
	import org.testng.annotations.Test;
	import org.testng.AssertJUnit;
	import org.testng.Assert;
	import org.testng.annotations.Test;


	public class HomePageTest extends HomePageObjects{

		HomePageObjects home;
		BasePage Base;

		public HomePageTest() {
			home = new HomePageObjects();
			Base = new BasePage();
		}
	@Test
		public void VerifyTabs() {
		Assert.assertTrue(home.getWomenText(),
								"Failed : The Women tab is not displayed");
		Assert.assertTrue(home.getDressText(),
			 				"Failed : The Dresses tab is not displayed");
		Assert.assertTrue(home.getTshirt(),
			 				"Failed : The Tshirt tab is not displayed");
			
			}
	
	@Test
	public void VerifyNavigatedTabs() {
		home.ClickWomenTab();
		Assert.assertTrue(home.getWomenNavigationText(), 
				"Failed : The Selected Tab is not navigated correctly");
		home.ClickDressTab();
		Assert.assertTrue(home.getDressNavigationText(), 
				"Failed : The Selected Tab is not navigated correctly");
		home.ClickTshirtTab();
		Assert.assertTrue(home.getTshirtNavigationText(), 
				"Failed : The Selected Tab is not navigated correctly");
		
	}
	
	@Test
	public void VerifyNewsletter() {
		home.getEmail();
		home.ClickSubmit();
		Assert.assertTrue(home.checkMsg(), "Failed: Tab is not navigated correctly");
	}
	
	}
