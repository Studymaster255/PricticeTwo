package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{
	
	public static void sendData(String value, WebElement wb)
	{
		if(wb.isEnabled() && wb.isDisplayed())
		{
			wb.sendKeys(value);
		}
	}
	
	public static void clickOnElement(WebElement wb)
	{
		if(wb.isEnabled() && wb.isDisplayed())
		{
			wb.click();
		}
	}
	
	public static boolean isImageDisplayed(WebElement wb)
	{
		Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", wb);
        return ImagePresent;
	}

}
