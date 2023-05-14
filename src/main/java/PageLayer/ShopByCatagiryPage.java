package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class ShopByCatagiryPage extends BaseClass {
	
	@FindBy(xpath="//div[@class='product-image']")
	List<WebElement> productImg;
	
	@FindBy(xpath="//a[text()='Bags']")
	WebElement bags;
	
	@FindBy(xpath="//a[text()='Mugs']")
	WebElement mugs;
	
	@FindBy(xpath="//a[text()='Clothing']")
	WebElement clothing;
	
	@FindBy(xpath="")
	WebElement e;
	
	@FindBy(xpath="")
	WebElement f;
	
	@FindBy(xpath="")
	WebElement g;
	
	
	public ShopByCatagiryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public int productQuantity()
	{
		return productImg.size();
	}
	
	public void clickOnBags()
	{
		UtilsClass.clickOnElement(bags);
	}
	public void clickOnMugs()
	{
		UtilsClass.clickOnElement(mugs);
	}
	public void clickOnClothing()
	{
		UtilsClass.clickOnElement(clothing);
	}

}
