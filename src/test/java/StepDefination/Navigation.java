package StepDefination;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.NavigationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Navigation extends BaseClass {
	String titleOfFirstProduct;
	String priceOffirstproduct;
	NavigationPage navigationPage;
	BaseClass base=new BaseClass();
	@When("user captures name of first product")
	public void user_captures_name_of_first_product() {
		navigationPage=new NavigationPage();
		titleOfFirstProduct=navigationPage.captureTitleOfFirstProduct();
		System.out.println(titleOfFirstProduct);
	}
	@When("captures price of product")
	public void captures_price_of_product() {
		priceOffirstproduct=navigationPage.priceOffirstProduct();
		System.out.println(priceOffirstproduct);
		
	}
	@Then("user click on first product image")
	public void user_click_on_first_product_image() {
		navigationPage.clickOnFirstProduct();
	}
	@Then("vaalidate title of product with captured on homepage")
	public void vaalidate_title_of_product_with_captured_on_homepage() {
	    String titleproductpage=navigationPage.titleOndescriptionpage();
	    Assert.assertEquals(titleOfFirstProduct, titleproductpage);
	}
	@Then("validate price with captured")
	public void validate_price_with_captured() {
	    String price=navigationPage.priceOnproductpage();
	    Assert.assertEquals(priceOffirstproduct, price);
	}

}
