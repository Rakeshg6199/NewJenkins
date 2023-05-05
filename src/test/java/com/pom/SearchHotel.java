package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotel extends BaseClass {
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "location")
	private WebElement selectLocation;
	
	@FindBy(id = "hotels")
	private WebElement selectHotel;
	
	@FindBy(id = "room_type")
	private WebElement selectRoomType;
	
	@FindBy(id = "room_nos")
	private WebElement selectRoomNos;
	
	@FindBy(id = "datepick_in")
	private WebElement txtDateCheckIn;
	
	@FindBy(id = "datepick_out")
	private WebElement txtDateCheckOut;
	
	@FindBy(id = "adult_room")
	private WebElement selectAdultRoom;
	
	@FindBy(id="child_room")
	private WebElement selectChildRoom;
	
	@FindBy(id = "Submit")
	private WebElement btnSubmit;

	public WebElement getSelectLocation() {
		return selectLocation;
	}

	public void setSelectLocation(WebElement selectLocation) {
		this.selectLocation = selectLocation;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public void setSelectHotel(WebElement selectHotel) {
		this.selectHotel = selectHotel;
	}

	public WebElement getSelectRoomType() {
		return selectRoomType;
	}

	public void setSelectRoomType(WebElement selectRoomType) {
		this.selectRoomType = selectRoomType;
	}

	public WebElement getSelectRoomNos() {
		return selectRoomNos;
	}

	public void setSelectRoomNos(WebElement selectRoomNos) {
		this.selectRoomNos = selectRoomNos;
	}

	public WebElement getTxtDateCheckIn() {
		return txtDateCheckIn;
	}

	public void setTxtDateCheckIn(WebElement txtDateCheckIn) {
		this.txtDateCheckIn = txtDateCheckIn;
	}

	public WebElement getTxtDateCheckOut() {
		return txtDateCheckOut;
	}

	public void setTxtDateCheckOut(WebElement txtDateCheckOut) {
		this.txtDateCheckOut = txtDateCheckOut;
	}

	public WebElement getSelectAdultRoom() {
		return selectAdultRoom;
	}

	public void setSelectAdultRoom(WebElement selectAdultRoom) {
		this.selectAdultRoom = selectAdultRoom;
	}

	public WebElement getSelectChildRoom() {
		return selectChildRoom;
	}

	public void setSelectChildRoom(WebElement selectChildRoom) {
		this.selectChildRoom = selectChildRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public void setBtnSubmit(WebElement btnSubmit) {
		this.btnSubmit = btnSubmit;
	}
	
	
	

	}
