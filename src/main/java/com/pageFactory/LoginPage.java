package com.pageFactory;

import org.openqa.selenium.By;

import com.generic.Pojo;

public class LoginPage {
	
	private Pojo objPojo;
	By loc_Link_Homeflic_Login = By.linkText("Login");
	By loc_inp_UserName =By.xpath("//input[@name='email'][@placeholder='Username or Email']");																								//By.xpath("//input[contains(@class,'form-control email-input')]");			
	
	By loc_inp_Password =By.xpath("//input[@name='password'][@placeholder='Password']");																				//By.xpath("//input[contains(@class,'form-control password-input')]");        												
	By loc_btn_Login = By.xpath("//button[text()='Log In']");
	
	By loc_hdr_LoginPage=By.xpath("//h4[text()='Login']");
	
	
	
	
	public LoginPage(Pojo pojo){
		
		this.objPojo = pojo;
	}
	
	
	public void verifyLoginPageHeader(){
		
		objPojo.getObjWrapperSeleniumFunctions().waitFor(5);
		objPojo.getObjUtilities().logReporter("Verify login page is displayed.", objPojo.getObjWrapperSeleniumFunctions().checkElementDisplayed(loc_hdr_LoginPage));
		
		
	}
	
	
	public void setUSerID(String strUserName){
		objPojo.getObjWrapperSeleniumFunctions().waitFor(5);
		objPojo.getObjUtilities().logReporter("Set USer ID : " + strUserName ,objPojo.getObjWrapperSeleniumFunctions().setText(loc_inp_UserName, strUserName));
	}
	
	public void setPassword(String strPassword){
		objPojo.getObjWrapperSeleniumFunctions().waitFor(5);
		objPojo.getObjUtilities().logReporter("Set Password : " + strPassword,objPojo.getObjWrapperSeleniumFunctions().setText(loc_inp_Password, strPassword));
	}
	
	public void clickLogin(){
		objPojo.getObjWrapperSeleniumFunctions().waitFor(5);
		objPojo.getObjUtilities().logReporter("Click Login : " ,objPojo.getObjWrapperSeleniumFunctions().click(loc_btn_Login));
	}
	
	
}

