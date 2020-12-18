package com.stepDefinitions;

import java.io.IOException;

import com.baseClasses.Library;
import com.pages.SpicejetFlightPage;
import com.reusablefunctions.SeleniumUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SpicejetFlightSteps extends Library {
	SpicejetFlightPage firstpage;
	SeleniumUtilities selUtil;
	Library lib = new Library();

	@Given("Open browser and Go to Url")
	public void open_browser_and_Go_to_Url() throws IOException {
		browserSetUp();
		logger.info("**Browser has launched****");
		System.out.println("Launch the Browser");
	}

	@When("verify the title")
	public void verify_the_title() {
		selUtil = new SeleniumUtilities(driver);
		selUtil.getTitle();
		System.out.println("Title Verified");

	}

	@Then("Clicking on Flights")
	public void clicking_on_Flights() {
		firstpage = new SpicejetFlightPage(driver);
		// Thread.sleep(3000);
		firstpage.bookingFlights(driver);

	}

	@Then("Click Round Trip")
	public void click_Round_Trip() {
		firstpage = new SpicejetFlightPage(driver);
		// Thread.sleep(3000);
		firstpage.click_Round_Trip(driver);

	}
	
	@Then("Click From Departure City Dropdown")
	public void click_From_Departure_City_Dropdown() {
		firstpage = new SpicejetFlightPage(driver);
		firstpage.click_From_Depart_City_Dropdown(driver);
	}

	@Then("Select Departure City")
	public void select_Departure_City() {
		firstpage = new SpicejetFlightPage(driver);
		firstpage.click_Depart_City(driver);
	}

//
//	@Then("Click To Arrival City Dropdown")
//	public void click_To_Arrival_City_Dropdown() {
//		firstpage= new SpicejetFlightPage(driver);
//		firstpage.click_To_Arrival_City_Dropdown(driver);
//
//	}

	@Then("Select Arrival City")
	public void select_Arrival_City() {
		firstpage = new SpicejetFlightPage(driver);
		firstpage.click_Arrival_City(driver);
	}
	

	@Then("Click Depart Date")
	public void click_on_Depart_Date() {
		firstpage = new SpicejetFlightPage(driver);
		firstpage.click_Depart_Date(driver);
	}

	@Then("close window wrong returndate")
	public void close_window_wrong_returndate() {
		firstpage = new SpicejetFlightPage(driver);
		firstpage.close_window_wrong_returndate(driver);
	}
	
//	// @Then("Click on Depart Date next month January selected")
	@Then("select next month")
		public void select_next_month() {
			firstpage= new SpicejetFlightPage(driver);
			firstpage.select_next_month(driver);
	}

	@Then("click Return Date Calendar")
	public void click_Return_Date_Calendar() {
			firstpage= new SpicejetFlightPage(driver);
			firstpage.click_Return_Date_Calendar(driver);
					
		}

	@Then("Click Return Date")
	public void click_Return_Date() {
		firstpage = new SpicejetFlightPage(driver);
		firstpage.click_Return_Date(driver);
	}

	@Then("Click Passengers Dropdown")
	public void click_Passengers_Dropdown() {
		firstpage = new SpicejetFlightPage(driver);
		firstpage.click_Passengers_Dropdown(driver);
	}

	@Then("Select number of Adults")
	public void click_Adult() {
		firstpage = new SpicejetFlightPage(driver);
		firstpage.click_Adult(driver);

	}

//	@Then("Select number of Child")
//	public void select_number_of_Child() {
//		firstpage= new SpicejetFlightPage(driver);
//		firstpage.clicking_Passengers_Dropdown(driver);
//	}
//
//	@Then("Select number of Infant")
//	public void select_number_of_Infant() {
//		firstpage= new SpicejetFlightPage(driver);
//		firstpage.clicking_Passengers_Dropdown(driver);
//	}

	@Then("Click on Currency Dropdown")
	public void Click_Currency_Dropdown() {
		firstpage = new SpicejetFlightPage(driver);
		firstpage.Click_Currency_Dropdown(driver);

	}

	@Then("Select Currency")
	public void select_Currency() {
		firstpage = new SpicejetFlightPage(driver);
		firstpage.select_Currency(driver);

	}

	@Then("Click Search")
	public void click_Search() {
		firstpage = new SpicejetFlightPage(driver);
		firstpage.click_Search(driver);
	}

	@Then("Verify Fare Details")
	public void click_Verifying_Fare_Details() {
		firstpage = new SpicejetFlightPage(driver);
		firstpage.click_Verifying_Fare_Details(driver);

	}

	@Then("Click Continue button")
	public void Click_Continue_button() {
		firstpage = new SpicejetFlightPage(driver);
		firstpage.Click_Continue_button(driver);

	}

	@Then("Take Screenshot")
	public void take_Screenshot() {
		// selUtil.to_take_screenshot("src/test/resources/ScreenShots/spicejet.png");
	}

	@Then("Close the Browser")
	public void close_the_Browser() {
		lib.tearDown();
		// driver.quit();
	}
}