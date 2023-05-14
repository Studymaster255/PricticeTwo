package StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageTest extends BaseClass {
	private BaseClass base;
	protected HomePage homepage;
	
	@Given("user is on {string}")
	public void user_is_on(String url) {
		base=new BaseClass();
		base.initilization();
	   Assert.assertEquals("http://spree.shiftedtech.com", url);
	}

	@When("user is on homepage")
	public void user_is_on_homepage() {
		//Assert.assertEquals("http://spree.shiftedtech.com/", driver.getCurrentUrl());
		//System.out.println(driver.getCurrentUrl());

	}

	@Then("validate title is {string}")
	public void validate_title_is(String title) {
	    Assert.assertEquals(title, driver.getTitle());
	}

	@Then("validate logo image")
	public void validate_logo_image() {
		homepage=new HomePage();
	    boolean logo_status=homepage.logo();
	    Assert.assertEquals(logo_status, true);
	}

	@Then("validate HOME button is avalaible")
	public void validate_home_button_is_avalaible() {
	    boolean homebtnn=homepage.homebtn();
	    Assert.assertEquals(homebtnn, true);
	}

	@Then("validate search box is available")
	public void validate_search_box_is_available() {
	   boolean searchbox=homepage.searchBoxfield();
	   Assert.assertTrue(searchbox);
	}

	@Then("validate search button is available")
	public void validate_search_button_is_available() {
	    boolean searchbtn=homepage.searchBtn();
	    Assert.assertTrue(searchbtn);
	}

	@Then("validate shop by catagies contains {int} link")
	public void validate_shop_by_catagies_contains_link(Integer three) {
	    List<WebElement> shopByCatagiry=driver.findElements(By.xpath("(//nav[@class='sidebar-item']//following::ul[@class='taxons-list'])[1]//a"));
	    int catagary_num=shopByCatagiry.size();
	    Assert.assertEquals(catagary_num, three);
	}

	@Then("validate shop by brand contains {int} links")
	public void validate_shop_by_brand_contains_links(Integer four) {
		List<WebElement> shopByCatagiry=driver.findElements(By.xpath("(//nav[@class='sidebar-item']//following::ul[@class='taxons-list'])[2]//a"));
	    int brand_num=shopByCatagiry.size();
	    Assert.assertEquals(brand_num, four);
	}

	@Then("validate dropdown content")
	public void validate_dropdown_content() {
	   WebElement dd=driver.findElement(By.id("taxon"));
	   Select sel=new Select(dd);
	   int num=sel.getOptions().size();
	   String a=String.valueOf(num);
	 //  Assert.assertEquals(a, 3);
	}

	@Then("validate cart button is available")
	public void validate_cart_button_is_available() {
	    Assert.assertTrue(homepage.cartBtn());
	}

	@Then("validate cart shows {string}")
	public void validate_cart_shows(String empty) {
	    String bb=homepage.empty().toString();
	   // System.out.println("---------------"+bb);
	    
	    Assert.assertTrue(bb.contains(empty));
	}

	@Then("validate page number should be {int}")
	public void validate_page_number_should_be(Integer num) {
		int aa=Integer.parseInt(homepage.lastPage());
	    Assert.assertEquals(aa, num);
	}

}
