package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class TestClass extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		BaseClass base=new BaseClass();
		base.initilization();
		WebElement wb1=driver.findElement(By.xpath("(//div[@class='product-image']/following::a)[1]"));
		System.out.println(wb1.getAttribute("title"));
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
