package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//img[@alt='Spree 50']")
	WebElement logo;
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement homebtn;
	
	@FindBy(id="keywords")
	WebElement searchBox;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement searchbtn;
	
	@FindBy(xpath="//a[@class='cart-info empty']")
	WebElement cartbtn;
	
	@FindBy(xpath="//a[@class='cart-info empty']")
	WebElement empty;
	
	@FindBy(xpath="//a[text()='Next ›']/preceding::a[1]")
	WebElement lastPage;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean logo() {
		return UtilsClass.isImageDisplayed(logo);
	}
	
	public boolean homebtn()
	{
		return homebtn.isDisplayed();
	}
	
	public boolean searchBoxfield()
	{
		return searchBox.isDisplayed();
	}
	
	public boolean searchBtn()
	{
		return searchbtn.isDisplayed();
	}
	
	public boolean cartBtn()
	{
		return cartbtn.isDisplayed();
	}
	
	public String empty()
	{
		return empty.getText();
	}
	
	public String lastPage()
	{
		return lastPage.getText();
	}
}
