package com.step;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;
import com.pom.BookHotel;
import com.pom.LoginPage;
import com.pom.SearchHotel;
import com.pom.SelectHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends BaseClass {

	LoginPage loginPage;
	SearchHotel hotel;
	SelectHotel selectHotel;
	BookHotel bookHotel;
	
	@Given("User is on Adactin login page")
	public void user_is_on_adactin_login_page() {
		launchUrl("https://adactinhotelapp.com/");
		
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		loginPage = new LoginPage();
		WebElement txtUser = loginPage.getTxtUser();
		enterText(txtUser, string);
		WebElement txtPass = loginPage.getTxtPass();
		enterText(txtPass, string2);
		
	}
	@When("User Clicks on login button")
	public void user_clicks_on_login_button() {
		WebElement btnLogin = loginPage.getBtnLogin();
		click(btnLogin);
	}
	@Then("User sees Search Hotel page")
	public void user_sees_search_hotel_page() {
		System.out.println("Launched");
	}
	
	@Given("User is on search page")
	public void user_is_on_search_page() {
		System.out.println("Search page");
	}
	
	@When("User selects {string} location")
	public void user_selects_location(String string) {
		hotel = new SearchHotel();
		WebElement selectLocation = hotel.getSelectLocation();
		selectByText(selectLocation, string);
		
	}
	@When("User selects {string} hotels")
	public void user_selects_hotels(String string) {
		WebElement selectHotel = hotel.getSelectHotel();
		selectByText(selectHotel, string);
		
	}
	@When("User selects {string} room type")
	public void user_selects_room_type(String string) {
		WebElement selectRoomType = hotel.getSelectRoomType();
		selectByText(selectRoomType, string);
		
	}
	@When("User selects {string} of rooms")
	public void user_selects_of_rooms(String string) {
		WebElement selectRoomNos = hotel.getSelectRoomNos();
		selectByText(selectRoomNos, string);
	}
	@When("User enters {string} check-In and {string} Check-out date")
	public void user_enters_check_in_and_check_out_date(String string, String string2) {
		WebElement txtDateCheckIn = hotel.getTxtDateCheckIn();
		txtDateCheckIn.clear();
		enterText(txtDateCheckIn, string);
		
		WebElement txtDateCheckOut = hotel.getTxtDateCheckOut();
		txtDateCheckOut.clear();
		enterText(txtDateCheckOut, string2);
	}
	@When("User selects {string} adults and children {string} per room")
	public void user_selects_adults_and_children_per_room(String string, String string2) {
		WebElement selectAdultRoom = hotel.getSelectAdultRoom();
		selectByText(selectAdultRoom, string);
		
		WebElement selectChildRoom = hotel.getSelectChildRoom();
		selectByText(selectChildRoom, string2);
	}
	
	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
		WebElement btnSubmit = hotel.getBtnSubmit();
		click(btnSubmit);
	}
	@Then("User should see select hotel page")
	public void user_should_see_select_hotel_page() {
		System.out.println("USer sees select hotel page");
	}
	
	@Given("User is on select page")
	public void user_is_on_select_page() {
		System.out.println("User is on select page");
	}
	
	@When("User click on select hotel checkbox")
	public void user_click_on_select_hotel_checkbox() {
		selectHotel = new SelectHotel();
		WebElement btnSelectHotel = selectHotel.getBtnSelectHotel();
		click(btnSelectHotel);
	}
	@When("User clicks continue button")
	public void user_clicks_continue_button() {
		WebElement btnSubmit = selectHotel.getBtnSubmit();
		click(btnSubmit);
		
	}
	
	@Then("User sees book a hotel")
	public void user_sees_book_a_hotel() {
		System.out.println("User is on book a  hotel page");
	}
	@Given("User is on book hotel page")
	public void user_is_on_book_hotel_page() {
		System.out.println("User is on book hotel page");
	}
	@When("User Enters {string} first name")
	public void user_enters_first_name(String string) {
		bookHotel = new BookHotel();
		WebElement txtFirstName = bookHotel.getTxtFirstName();
		enterText(txtFirstName, string);
	}
	@When("User Enters {string} last name")
	public void user_enters_last_name(String string) {
		WebElement txtLastName = bookHotel.getTxtLastName();
		enterText(txtLastName, string);
		
	}
	@When("User Enters {string} address")
	public void user_enters_address(String string) {
		WebElement txtAddress = bookHotel.getTxtAddress();
		enterText(txtAddress, string);
		
	}
	@When("User Enters Credit card {string} number")
	public void user_enters_credit_card_number(String string) {
		WebElement txtCreditNo = bookHotel.getTxtCreditNo();
		enterText(txtCreditNo, string);
		
	}
	@When("User selects credit card {string} type")
	public void user_selects_credit_card_type(String string) {
		WebElement selectCreditType = bookHotel.getSelectCreditType();
		selectByText(selectCreditType, string);
		
	}
	@When("User select expiry {string} and {string}")
	public void user_select_expiry_and(String string, String string2) {
		WebElement selectExpMonth = bookHotel.getSelectExpMonth();
		selectByText(selectExpMonth, string);
		
		WebElement selectExpYear = bookHotel.getSelectExpYear();
		selectByText(selectExpYear, string2);
	}
	@When("User enters CVV {string} Number")
	public void user_enters_cvv_number(String string) {
		WebElement txtCvvNum = bookHotel.getTxtCvvNum();
		enterText(txtCvvNum, string);
	}
	@When("User clicks book now button")
	public void user_clicks_book_now_button() {
		WebElement btnBookNow = bookHotel.getBtnBookNow();
		click(btnBookNow);
	}
	@Then("User gets the order id")
	public void user_gets_the_order_id() throws InterruptedException {
		Thread.sleep(7000);
		WebElement txtOrderId = bookHotel.getTxtOrderId();
		String text = txtOrderId.getAttribute("value");
		System.out.println(text);
	}

	}
