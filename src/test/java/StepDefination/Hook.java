package StepDefination;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hook extends BaseClass {
	
	public static String curruntdatetime() {
		SimpleDateFormat date=new SimpleDateFormat("_ddMMyyyy_HHmmss");
		return date.format(new Date());
		}


	@AfterStep
	public void takeScreenshot(Scenario sc)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		String scenarioName=sc.getName();
		
		int num=sc.getLine();
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dist=new File(System.getProperty("user.dir")+"/Screenshot/"+scenarioName+"_"+num+Hook.curruntdatetime()+".jpeg");

		try {
			FileUtils.copyFile(src, dist);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Screenshot captured by name "+scenarioName+"_"+num);

	}


	@After
	public void tearDown()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
