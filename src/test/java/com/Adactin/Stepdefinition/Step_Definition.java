package com.Adactin.Stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Adactin.Runner.Runner_Class;
import com.baseclass.Base_Class;
import com.po_manager.Page_Object_Manager_Hotel;

import Property_File.File_Reader_Manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class {

	public static WebDriver driver = Runner_Class.driver;
	public static Page_Object_Manager_Hotel pom = new Page_Object_Manager_Hotel(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().get_Url();
		getUrl(url);
		Thread.sleep(5000);
	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_Username_In_Username_Field(String username) throws Throwable {
		sendKeyElement(pom.getLp().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_Password_In_Password_Field(String password) throws Throwable {
		sendKeyElement(pom.getLp().getPassword(), password);
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		clickOnElement(pom.getLp().getLogin());
	}

	@When("^user Select The Location In Location Option$")
	public void user_Select_The_Location_In_Location_Option() throws Throwable {
		dropDown(pom.getSp().getLocation(), "value", "London");
	}

	@When("^user Select The Hotel In Hotels Option$")
	public void user_Select_The_Hotel_In_Hotels_Option() throws Throwable {
		dropDown(pom.getSp().getHotels(), "value", "Hotel Cornice");
	}

	@When("^user Select The Room Type In Room Type Option$")
	public void user_Select_The_Room_Type_In_Room_Type_Option() throws Throwable {
		dropDown(pom.getSp().getRoom_type(), "value", "Deluxe");
	}

	@When("^user Select Number Of Rooms In Number Of Rooms Option$")
	public void user_Select_Number_Of_Rooms_In_Number_Of_Rooms_Option() throws Throwable {
		dropDown(pom.getSp().getRoom_nos(), "value", "2");
	}

	@When("^user Enter The Check In Date In Check In Date Field$")
	public void user_Enter_The_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
		sendKeyElement(pom.getSp().getDatepick_in(), "01/08/2022");
	}

	@When("^user Enter The Check Out Date In Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
		sendKeyElement(pom.getSp().getDatepick_out(), "31/08/2022");
	}

	@When("^user Select Number Of Adults In Adults Per Room Option$")
	public void user_Select_Number_Of_Adults_In_Adults_Per_Room_Option() throws Throwable {
		dropDown(pom.getSp().getAdult_room(), "value", "2");
	}

	@When("^user Select Number Of Children In Children Per Room Option$")
	public void user_Select_Number_Of_Children_In_Children_Per_Room_Option() throws Throwable {
		dropDown(pom.getSp().getChild_room(), "value", "0");
	}

	@Then("^user Click The Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
		clickOnElement(pom.getSp().getSubmit());
	}

	@When("^user Select The Hotel In Select Option$")
	public void user_Select_The_Hotel_In_Select_Option() throws Throwable {
		radioButton(pom.getSp1().getRadiobutton_0());
	}

	@Then("^user Click The Continue Button And It Navigates To Book Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_Book_Hotel_Page() throws Throwable {
		clickOnElement(pom.getSp1().getContinue1());
	}

	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
		sendKeyElement(pom.getPp().getLast_name(), "Raja");
	}

	@When("^user Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
		sendKeyElement(pom.getPp().getFirst_name(), "Rani");
	}

	@When("^user Enter The Billing Address In Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
		sendKeyElement(pom.getPp().getAddress(), "#420, Govinda Street, Abase Nagar, Chennai.");
	}

	@When("^user Enter The Credit Card Number In Credit Card No Field$")
	public void user_Enter_The_Credit_Card_Number_In_Credit_Card_No_Field() throws Throwable {
		sendKeyElement(pom.getPp().getCc_num(), "0123456789987654");
	}

	@When("^user Select The Credit Card Type In Credit Card Type Option$")
	public void user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Option() throws Throwable {
		dropDown(pom.getPp().getCc_type(), "value", "VISA");
	}

	@When("^user Select The Expiry Month In Select Month Option$")
	public void user_Select_The_Expiry_Month_In_Select_Month_Option() throws Throwable {
		dropDown(pom.getPp().getCc_exp_month(), "value", "12");
	}

	@When("^user Select The Expiry Year In Expiry Year Option$")
	public void user_Select_The_Expiry_Year_In_Expiry_Year_Option() throws Throwable {
		dropDown(pom.getPp().getCc_exp_year(), "value", "2022");
	}

	@When("^user Enter The CVV Number In CVV Number Field$")
	public void user_Enter_The_CVV_Number_In_CVV_Number_Field() throws Throwable {
		sendKeyElement(pom.getPp().getCc_cvv(), "0007");
	}

	@Then("^user Click The Book Now Button And It Navigates To Logout Page$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_Logout_Page() throws Throwable {
		clickOnElement(pom.getPp().getBook_now());
		Thread.sleep(5000);
	}

	@Then("^user Click The Logout Button And It Logged Out The Web Applicaton$")
	public void user_Click_The_Logout_Button_And_It_Logged_Out_The_Web_Applicaton() throws Throwable {
		clickOnElement(pom.getLo().getLogout());
		Thread.sleep(5000);
	}

	@Then("^user Click The Logout Button And It Logged Out The 2nd Web Applicaton$")
	public void user_Click_The_Logout_Button_And_It_Logged_Out_The_2nd_Web_Applicaton() throws Throwable {
		clickOnElement(pom.getLo().getLogout());
	}
}
