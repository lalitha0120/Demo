package com.objects;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressesPageObjects extends BasePage {
	
	@FindBy(xpath="//div[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement Dresses;
	
	@FindBy (xpath="//*[@id=\"group_1\"]")
	private WebElement DropDownbox;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
	private WebElement sampledress;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/h1/span[2]")
	private WebElement txtproductcount;
	
	@FindBys(@FindBy(xpath="//ul[@class=\"product_list grid row\"]/li"))
	private List<WebElement> totalProducts;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	private WebElement AddToCartButton;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
	private WebElement CartButton;
	
	@FindBy(xpath="//*[@id=\"product_3_13_0_0\"]/td[2]/p/a")
	private WebElement CartDescription;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[1]/span")
	private WebElement closetab;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[1]/h2/text()")
	private WebElement CompleteLoading;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[1]/h2/text()")
	private WebElement TextFromPopUp;
	
	public DressesPageObjects() {
			PageFactory.initElements(driver, this);
	}
	public void ClickDressTab(){
		Dresses.click();
		 }
	public void ClickAddtoCartButton() {
		AddToCartButton.click();
	}
	
	public void ClickCartButton() {
		CartButton.click();
	}
	
	public void ClickCloseTab() {
		closetab.click();
	}
	
	public void ClicksampleDress() {
		sampledress.click();
		}
	
	public boolean DropDownSizeM()
	{
		String mediumSize="M";
		return selectFromDropDown(DropDownbox, mediumSize) != null;
	}
	public boolean DropDownSizeS()
	{
		String SmallSize="S";
		return selectFromDropDown(DropDownbox, SmallSize) != null;
	}
	
	
	public boolean DropDownSizeL()
	{
		String LargeSize="L";
		return selectFromDropDown(DropDownbox, LargeSize) != null;
	}
	public int getProductCount() {
		return totalProducts.size();
	}
	public boolean LoadingCart() {
		return isElementVisible(TextFromPopUp);
	}
	
	public int getcountfromHeader() {
		return Integer.parseInt(txtproductcount.getText().split(" ")[2]);
	}
	public boolean checkCartDescription()
	{
	 String Text=CartDescription.getText();
	return Text.contains("Printed Dress");
	}
	
	}