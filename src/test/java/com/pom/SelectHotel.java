package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotel extends BaseClass{
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "radiobutton_0")
	private WebElement btnSelectHotel;
	
	@FindBy(id="continue")
	private WebElement btnSubmit;

	public WebElement getBtnSelectHotel() {
		return btnSelectHotel;
	}

	public void setBtnSelectHotel(WebElement btnSelectHotel) {
		this.btnSelectHotel = btnSelectHotel;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public void setBtnSubmit(WebElement btnSubmit) {
		this.btnSubmit = btnSubmit;
	}
	
	
	

}
