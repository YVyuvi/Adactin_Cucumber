package com.Adactin.Runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;

import Property_File.File_Reader_Manager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//Adactin//Feature", glue = "com.Adactin.Stepdefinition", plugin = {
		"html:Report/C_R", "pretty", "json:Report/J_R.json" }, monochrome = true)
public class Runner_Class {

	public static WebDriver driver;

	@BeforeClass
	public static void Open_Browser() throws IOException {
		String browser = File_Reader_Manager.getInstance().getInstanceCR().get_Browser();
		driver = Base_Class.getBrowser(browser);
	}

	@AfterClass
	public static void close_Browser() {
		Base_Class.close();
	}
}
