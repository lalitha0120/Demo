package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.objects.BasePage;
import com.objects.ProductPageObjects;

public class ProductPageTest {
	
	ProductPageObjects product;
	BasePage base;
	
public ProductPageTest() {
	product=new ProductPageObjects();
	base=new BasePage();
}

@Test
public void VerifyTweetandShareTabs() {
	product.ClickDressTab();
	product.ClicksampleDress();
	Assert.assertTrue(product.GetTweetText(),"Tweet Tab is not displayed");
	Assert.assertTrue(product.GetShareButton(),"Share Tab is not displayed");
}

@Test
public void VerifyProductDescription() {
	product.ClickDressTab();
	product.ClicksampleDress();
	Assert.assertTrue(product.GetProductDesc()<=200, "Text are more than 10 Characters");
}
}
