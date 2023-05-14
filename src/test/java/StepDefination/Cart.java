package StepDefination;

import java.util.List;

import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;
import PageLayer.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cart extends BaseClass{
	private CartPage catrpage;
	@When("user clicks on first item")
	public void user_clicks_on_first_item() {
	    catrpage=new CartPage();
	    catrpage.clickOnFirstProduct();
	}
	@Then("add item to cart")
	public void add_item_to_cart() {
		catrpage.addtocart();
	}
	@Then("click on checkout")
	public void click_on_checkout() {
		catrpage.checkout();
	}
	
	@Then("enter guest emailID as {string}")
	public void enter_guest_email_id_as(String email) {
		catrpage.guestEmailId(email);
	}
	@Then("click on continue")
	public void click_on_continue() {
		catrpage.clickOnContinue();
	}
	
	
	@Then("fill address {string} , {string} , {string} , {string} , {string} , {string} , {string} ,{string}")
	public void fill_address(String one, String two, String three, String four, String fove, String six, String seven, String string8) {
		catrpage.enterName(one);
		catrpage.enterLastName(two);
		catrpage.enterAddress(three);
		catrpage.enterCity(four);
		Select selcon=catrpage.country();
		selcon.selectByVisibleText(fove);
		Select statedd=catrpage.state();
		statedd.selectByVisibleText(six);
		catrpage.enterZip(seven);
		catrpage.enterPhone(string8); 
	}

	@Then("click on save and continue")
	public void click_on_save_and_continue() {
		catrpage.saveAndCon();
	}

}
