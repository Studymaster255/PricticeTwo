package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class CartPage extends BaseClass{
	
	@FindBy(xpath="(//div[@class='product-image']/following::a)[1]")
	WebElement firstProducttitle;
	
	@FindBy(xpath="//button[@id='add-to-cart-button']")
	WebElement addToCart;
	
	@FindBy(xpath="//button[@id='checkout-link']")
	WebElement checkoutbtn;
	
	@FindBy(id="order_bill_address_attributes_firstname")
	WebElement name;

	@FindBy(id="order_bill_address_attributes_lastname")
	WebElement lastname;
	
	@FindBy(id="order_bill_address_attributes_address1")
	WebElement address;
	
	@FindBy(id="order_bill_address_attributes_city")
	WebElement city;
	
	@FindBy(id="order_bill_address_attributes_country_id")
	WebElement countrydd;
	
	@FindBy(id="order_bill_address_attributes_state_id")
	WebElement statedd;
	
	@FindBy(id="order_bill_address_attributes_zipcode")
	WebElement zip;
	
	@FindBy(id="order_bill_address_attributes_phone")
	WebElement phone;
	
	@FindBy(xpath="//input[@class='continue button primary']")
	WebElement saveAnd;
	
	@FindBy(xpath="//input[@id='order_email']")
	WebElement guestEmail;
	
	@FindBy(xpath="(//input[@name='commit'])[2]")
	WebElement continuebtn;
	
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnFirstProduct()
	{
		UtilsClass.clickOnElement(firstProducttitle);
	}
	
	public void addtocart()
	{
		UtilsClass.clickOnElement(addToCart);
	}
	
	public void checkout() {
		UtilsClass.clickOnElement(checkoutbtn);
	}
	
	public void enterName(String namee)
	{
		UtilsClass.sendData(namee, name);
	}
	
	public void enterLastName(String lastName)
	{
		UtilsClass.sendData(lastName, lastname);
	}
	
	public void enterAddress(String addresss)
	{
		UtilsClass.sendData(addresss, address);
	}
	
	public void enterCity(String cityy)
	{
		UtilsClass.sendData(cityy, city);
	}
	
	
	public Select country()
	{
		return new Select(countrydd);
	}
	
	public Select state()
	{
		return new Select(statedd);
	}
	
	public void enterZip(String zipcode)
	{
		UtilsClass.sendData(zipcode, zip);
	}
	
	public void enterPhone(String phonee)
	{
		UtilsClass.sendData(phonee, phone);
	}
	
	public void saveAndCon()
	{
		UtilsClass.clickOnElement(saveAnd);
	}
	
	public void guestEmailId(String email)
	{
		UtilsClass.sendData(email, guestEmail);
	}
	
	public void clickOnContinue()
	{
		UtilsClass.clickOnElement(continuebtn);
	}
	
}
