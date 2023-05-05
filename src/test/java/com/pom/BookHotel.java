package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookHotel extends BaseClass {
	
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public void setTxtFirstName(WebElement txtFirstName) {
		this.txtFirstName = txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public void setTxtLastName(WebElement txtLastName) {
		this.txtLastName = txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public void setTxtAddress(WebElement txtAddress) {
		this.txtAddress = txtAddress;
	}

	public WebElement getTxtCreditNo() {
		return txtCreditNo;
	}

	public void setTxtCreditNo(WebElement txtCreditNo) {
		this.txtCreditNo = txtCreditNo;
	}

	public WebElement getSelectCreditType() {
		return selectCreditType;
	}

	public void setSelectCreditType(WebElement selectCreditType) {
		this.selectCreditType = selectCreditType;
	}

	public WebElement getSelectExpMonth() {
		return selectExpMonth;
	}

	public void setSelectExpMonth(WebElement selectExpMonth) {
		this.selectExpMonth = selectExpMonth;
	}

	public WebElement getSelectExpYear() {
		return selectExpYear;
	}

	public void setSelectExpYear(WebElement selectExpYear) {
		this.selectExpYear = selectExpYear;
	}

	public WebElement getTxtCvvNum() {
		return txtCvvNum;
	}

	public void setTxtCvvNum(WebElement txtCvvNum) {
		this.txtCvvNum = txtCvvNum;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public void setBtnBookNow(WebElement btnBookNow) {
		this.btnBookNow = btnBookNow;
	}

	@FindBy(id = "first_name")
	private WebElement txtFirstName;
	
	@FindBy(id = "last_name")
	private WebElement txtLastName;
	
	@FindBy(id = "address")
	private WebElement txtAddress;
	
	@FindBy(id = "cc_num")
	private WebElement txtCreditNo;
	
	@FindBy(id = "cc_type")
	private WebElement selectCreditType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement selectExpMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement selectExpYear;
	
	public WebElement getTxtOrderId() {
		return txtOrderId;
	}

	public void setTxtOrderId(WebElement txtOrderId) {
		this.txtOrderId = txtOrderId;
	}

	@FindBy(id = "cc_cvv")
	private WebElement txtCvvNum;
	
	@FindBy(id = "book_now")
	private WebElement btnBookNow;
	
	@FindBy(id = "order_no")
	private WebElement txtOrderId;
	
}
