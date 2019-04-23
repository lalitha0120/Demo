package com.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageObjects extends BasePage {
	
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div/div[3]/p[7]/button[1]")
	private WebElement TweetButton;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div/div[3]/p[7]/button[2]")
	private WebElement ShareButton;
	
	@FindBy(xpath="//div[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement Dresses;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
	private WebElement sampledress;
	
	@FindBy(xpath="//div[@id=\"short_description_block\"]")
	private WebElement ProductDesc;
	
		
	public ProductPageObjects() {
		PageFactory.initElements(driver, this);
	}
	public void ClickDressTab(){
		Dresses.click();
		 }
	public void ClicksampleDress() {
		sampledress.click();
		}
	
	public boolean GetTweetText()
	{
	 String Text=TweetButton.getText();
	return Text.contains("Tweet");
	}
	public boolean GetShareButton()
	{
	 String Text=ShareButton.getText();
	return Text.contains("Share");
	}
	public int GetProductDesc() {
		String Text=ProductDesc.getText();
		return Text.length();
	}
	}
