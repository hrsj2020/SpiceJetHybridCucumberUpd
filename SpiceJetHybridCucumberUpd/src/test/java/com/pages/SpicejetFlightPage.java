package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;

public class SpicejetFlightPage {
	WebDriver driver;
	
	By BookFlight = By.xpath("//*[@id=\"content-change\"]/div[2]");//Click on Flights Icon
    By clickingflights = By.xpath("//*[@id=\"buttons\"]/div/div/ul/li[1]/a");
 	By clickRoundTrip =By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']");////input[@id='ctl00_mainContent_rbtnl_Trip_1'];
	By clickFromDepartCityDropdown = By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']");
	By clickDepartCity = By.xpath("//a[contains(text(),'Bengaluru (BLR)')]");
	By clickArrivalCity = By.xpath("//body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[3]/div[1]/div[1]/ul[3]/li[9]/a[1]");
	By clickDepartDate = By.xpath("//body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[5]/a[1]");
	By closewindowwrongreturndate = By.xpath("//span[@id='spclearDate']");
	By clickReturnDateCalendar=By.cssSelector("#ctl00_mainContent_view_date2"); //By.xpath("//input[@id='date_picker_id_2']");
	By selectnextmonth = By.xpath("//span[contains(text(),'January')]");	
	By clickReturnDate = By.linkText("12");
	By clickPassengersDropdown = By.cssSelector("#divpaxinfo");//By.xpath("/html[1]/body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[6]/div[2]']");
	By clickAdult = By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']");
	//By selectChild = //select[@id='ctl00_mainContent_ddl_Child']
	//By selectInfant = //select[@id='ctl00_mainContent_ddl_Infant']
	By ClickCurrencyDropdown = By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']");
	By selectCurrency = By.xpath("//option[contains(text(),'INR')]");
	By clickSearch = By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']");
	By clickVerifyingFareDetails = By.xpath("//body/div[15]/form[1]/div[4]/div[1]/div[2]/div[1]/div[1]/span[2]");
	By ClickContinuebutton = By.xpath("//*[@id=\"continue-to-contact-page\"]");
 	
	public SpicejetFlightPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);		
	}
		
	public void bookingFlights(WebDriver driver) {
		driver.findElement(clickingflights).click();
	}
	public void click_Round_Trip(WebDriver driver) {
		driver.findElement(clickRoundTrip).click();
	}
	public void click_From_Depart_City_Dropdown(WebDriver driver) {
		driver.findElement(clickFromDepartCityDropdown).click();
	}
	public void click_Depart_City(WebDriver driver) {
		driver.findElement(clickDepartCity).click();
	}
//	public void click_To_Arrival_City_Dropdown(WebDriver driver) {
//		driver.findElement(clickToArrivalCityDropdown).click();
//	}
	public void click_Arrival_City(WebDriver driver) {
		driver.findElement(clickArrivalCity).click();
	}
	
	public void click_Depart_Date(WebDriver driver) {
		driver.findElement(clickDepartDate).click();
		
	}
	public void select_next_month(WebDriver driver) {
		driver.findElement(selectnextmonth).click();
	}
	public void click_Return_Date(WebDriver driver) {
		driver.findElement(clickReturnDate).click();
	}
	public void click_Return_Date_Calendar(WebDriver driver) {
		driver.findElement(clickReturnDateCalendar).click();
	}
	public void close_window_wrong_returndate(WebDriver driver) {
		driver.findElement(closewindowwrongreturndate).click();
	}
	
	
	public void click_Passengers_Dropdown(WebDriver driver) {
		driver.findElement(clickPassengersDropdown).click();
	}
	public void click_Adult(WebDriver driver) {
		driver.findElement(clickAdult).click();
	}
	public void Click_Currency_Dropdown(WebDriver driver) {
		driver.findElement(ClickCurrencyDropdown).click();
	}
	public void select_Currency(WebDriver driver) {
		driver.findElement(selectCurrency).click();
	}
	public void click_Search(WebDriver driver) {
		driver.findElement(clickSearch).click();
	}
	public void click_Verifying_Fare_Details(WebDriver driver) {
		driver.findElement(clickVerifyingFareDetails).click();
	}
	public void Click_Continue_button(WebDriver driver) {
		driver.findElement(ClickContinuebutton).click();
	
	}
	
//	//public void close_the_browser(WebDriver driver) {
//	public void close_the_browser() {
//		tearDown();
//	//	driver.quit();
//	}
}
