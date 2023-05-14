package StepDefination;



import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.ShopByCatagiryPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopByCatagiryTest extends BaseClass {
	
	protected BaseClass base;
	
	protected ShopByCatagiryPage catagiry;
	
	String actual_title=null;
	
	@When("user clicks on Bags")
	public void user_clicks_on_bags() {
	    catagiry=new ShopByCatagiryPage();
	    catagiry.clickOnBags();
	    actual_title=driver.getTitle();
		System.out.println(actual_title);
//	    try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	    driver.navigate().back();
	    
	}
	@Then("validate title {string}")
	public void validate_title(String title) {

			Assert.assertEquals(actual_title, title);
		
	    
	}
	@Then("validate number of iteams shows {int}")
	public void validate_number_of_iteams_shows(Integer four) {
	    int num=catagiry.productQuantity();
	    if(num==4)
	    {
	    	Assert.assertEquals(num, four);
	    }
	    else if(num==14)
	    {
	    	Assert.assertEquals(num, four);
	    }
	    
	}
	@Then("user click on Mugs")
	public void user_click_on_mugs() {
		catagiry.clickOnMugs();
		actual_title=driver.getTitle();
		System.out.println(actual_title);
//	    try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
	    driver.navigate().back();
	}
	@Then("user click on clothing")
	public void user_click_on_clothing() {
		catagiry.clickOnClothing();
		actual_title=driver.getTitle();
		System.out.println(actual_title);
//	    try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
	    driver.navigate().back();
	}

}
