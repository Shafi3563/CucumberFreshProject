package com.fresh.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseFresh {
	
	public static Properties prop;
	public static WebDriver driver;

	public TestBaseFresh() {

		try {
			FileInputStream flss = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\java\\com\\fresh\\config\\Configure.properties");
			prop = new Properties();
			prop.load(flss);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void initilize() {
		String Browsername = prop.getProperty("browserr");
		if (Browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		} else if (Browsername.equals("IE")) {
			System.out.println("This is IE browser");
		} else
			System.out.println("Browser not found");

	}

	public static void launch(String URL) {
		driver.get(prop.getProperty("URL_QA"));
	}
}


