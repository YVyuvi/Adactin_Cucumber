package com.po_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pomclass_Hotel.Login_Page;
import com.pomclass_Hotel.Logout_Page;
import com.pomclass_Hotel.Pay_Page;
import com.pomclass_Hotel.Search_Page;
import com.pomclass_Hotel.Select_Page;

public class Page_Object_Manager_Hotel {
	public WebDriver driver;
	private Login_Page lp;
	private Search_Page sp;
	private Select_Page sp1;
	private Pay_Page pp;
	private Logout_Page lo;

	public Page_Object_Manager_Hotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public Login_Page getLp() {
		lp = new Login_Page(driver);
		return lp;
	}

	public Search_Page getSp() {
		sp = new Search_Page(driver);
		return sp;
	}

	public Select_Page getSp1() {
		sp1 = new Select_Page(driver);
		return sp1;
	}

	public Pay_Page getPp() {
		pp = new Pay_Page(driver);
		return pp;
	}

	public Logout_Page getLo() {
		lo = new Logout_Page(driver);
		return lo;
	}
}
