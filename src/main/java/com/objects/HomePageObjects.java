package com.objects;


	import java.util.Random;

import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HomePageObjects extends BasePage{
		

		@FindBy(xpath="//div[@id=\"block_top_menu\"]/ul/li/a")
		private WebElement Women; 
		
		
		@FindBy(xpath="//div[@id=\"block_top_menu\"]/ul/li[2]/a")
		private WebElement Dresses;

		
		@FindBy(xpath="//div[@id=\"block_top_menu\"]/ul/li[3]/a")
		private WebElement Tshirts;
		
		@FindBy (xpath="//div[@class=\"cat_desc\"]/span")
		private WebElement WomenTabNavigation;
		
		@FindBy (xpath="//div[@class=\"cat_desc\"]/span")
		private WebElement DressTabNavigation;
		
		@FindBy (xpath="//div[@class=\"cat_desc\"]/span")
		private WebElement TshirtTabNavigation;
		
		@FindBy (xpath="//div[@class=\"form-group\"]/input")
		private WebElement Newsletter;
		
		@FindBy (xpath="//button[@name=\"submitNewsletter\"]")
		private WebElement SubmitNewsletter;
		
		@FindBy (xpath="//div[@id=\"columns\"]/p")
		private WebElement NewsletterAlertMsg;
		
		public HomePageObjects() {
			PageFactory.initElements(driver, this);
			
		}
		 public boolean getWomenText() {
	     return elementFound(Women);
		 }
		 public boolean getDressText(){
			 return elementFound(Dresses);
		 }
		 public boolean getTshirt(){
			 return elementFound(Tshirts);
		 }
		 public void ClickWomenTab(){
			 Women.click();
		 }
		 public void ClickDressTab(){
			Dresses.click();
			 }
		 public void ClickTshirtTab(){
			 Tshirts.click();
		 }
		 public void ClickSubmit() {
			 SubmitNewsletter.click();
		 }
		 
		 public boolean getWomenNavigationText(){
			 return isElementVisible(WomenTabNavigation);
		 }
		 
		 public boolean getDressNavigationText(){
			 return isElementVisible(DressTabNavigation);
		 }
		 public boolean getTshirtNavigationText(){
			 return isElementVisible(TshirtTabNavigation);
		 }
		 public String getEmail(){
			 int random =new Random().nextInt(50000);
			 String name="kdurga2091" + random + "@gmail.com";
			 return setText(Newsletter, name);
		 }
		 public boolean checkMsg()
			{
			 String Text=NewsletterAlertMsg.getText();
			return Text.contains("Newsletter");
					
			}
	}