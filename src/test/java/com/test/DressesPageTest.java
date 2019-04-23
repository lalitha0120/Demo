package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.objects.BasePage;
import com.objects.DressesPageObjects;

public class DressesPageTest {
	
	DressesPageObjects dress;
	BasePage base;
	
	public DressesPageTest() {
		dress=new DressesPageObjects();
		base=new BasePage();
		
	}
	
	@Test
	public void VerifyDressesSize() {
		dress.ClickDressTab();
		dress.ClicksampleDress();
	Assert.assertTrue(dress.DropDownSizeS(),"Small size is not showing");
	Assert.assertTrue(dress.DropDownSizeM(),"Medium size is not showing");
	Assert.assertTrue(dress.DropDownSizeL(),"Large size is not showing");
	}

	@Test
	public void VerifyProductCount() {
	dress.ClickDressTab();
	Assert.assertTrue(dress.getcountfromHeader()==dress.getProductCount(), 
			"Failed: Both count is not matching");
	}
	@Test
	public void VerifyCart() throws InterruptedException {
		dress.ClickDressTab();
		dress.ClicksampleDress();
		dress.ClickAddtoCartButton();
		dress.LoadingCart();
		dress.ClickCloseTab();
		dress.ClickCartButton();
		Assert.assertTrue(dress.checkCartDescription(), "Failed: Item is not added to Cart");
	}
	
}
