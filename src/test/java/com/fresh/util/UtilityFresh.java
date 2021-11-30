package com.fresh.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityFresh {
	
	public static long implicitlyWait_wait = 40;
	public static long pageLoadTimeout_wait = 40;

	public static String Cellphone = "iphone";
	public static String TV = "samsung";

	public static void takescreenshot(WebDriver driver, String screenshot) {

		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String correntdir = System.getProperty("user.dir");

		try {
			FileUtils.copyFile(srcfile, new File(correntdir + "/ScreenShots/" + screenshot + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
	
	
	
	


