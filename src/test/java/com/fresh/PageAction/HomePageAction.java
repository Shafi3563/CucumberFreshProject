package com.fresh.PageAction;

import org.testng.Assert;

import com.fresh.PageLocator.HomePageLocator;
import com.fresh.util.TestBaseFresh;
import com.fresh.util.UtilityFresh;

public class HomePageAction extends TestBaseFresh {
	
	HomePageLocator homePageLocator = new HomePageLocator();

	public void Searchbyiphone() {
		homePageLocator.Productsearchbyiphone.sendKeys(UtilityFresh.Cellphone);
	}

	public void clicksearch() {
		homePageLocator.clickonsearchbutton.click();

	}

	public void Verifyuserdisplay() {
		boolean result = homePageLocator.Verifyuseronsearchresultdisplay.isDisplayed();
		Assert.assertTrue(result);
	}
}


