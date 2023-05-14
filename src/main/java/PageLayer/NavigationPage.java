package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class NavigationPage extends BaseClass {
	
	@FindBy(xpath="(//div[@class='product-image']/following::a)[1]")
	WebElement firstProducttitle;
	
	@FindBy(xpath="((//div[@class='product-image']/following::a)[1]/following::span)[1]")
	WebElement priceOfProduct;
	
	@FindBy(xpath="//h1[@class='product-title']")
	WebElement titleOnDescriptionPage;
	
	@FindBy(xpath="//span[@itemprop='price']")
	WebElement priceOnDescriptionPage;
	
	public NavigationPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String captureTitleOfFirstProduct()
	{
		return firstProducttitle.getAttribute("title");
	}
	
	public String priceOffirstProduct()
	{
		return priceOfProduct.getText();
	}
	public void clickOnFirstProduct()
	{
		 UtilsClass.clickOnElement(firstProducttitle);
	}
	
	public String titleOndescriptionpage()
	{
		return titleOnDescriptionPage.getText();
	}
	public String priceOnproductpage()
	{
		return priceOnDescriptionPage.getText();
	}
}
