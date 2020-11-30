package com.pageFactory;

import org.openqa.selenium.By;

import com.generic.Pojo;

public class DummyPage {

	private Pojo objPojo;
	
	By loc_HomeflicLogo = By.xpath("");
	By loc_Link_Homeflic_Login = By.linkText("Login");
	By loc_inp_UserName =By.xpath("//input[@name='email'][@placeholder='Username or Email']");																								//By.xpath("//input[contains(@class,'form-control email-input')]");			
	
	By loc_inp_Password =By.xpath("//input[@name='password']");																				//By.xpath("//input[contains(@class,'form-control password-input')]");        												
	By loc_btn_Login = By.xpath("//button[text()='Log In']");
	
	public DummyPage(Pojo pojo){
		
		this.objPojo = pojo;
	}
	
	public void printTestDataBean(){
		
		/*System.out.println("FullName :  " + objPojo.getObjTestDataBean().getStrFullName());
		System.out.println("FullName :  " + objPojo.getObjTestDataBean().getStrFirstName());
		System.out.println("FullName :  " + objPojo.getObjTestDataBean().getStrLastName());
		System.out.println("FullName :  " + objPojo.getObjTestDataBean().getStrAddress());*/
		
		objPojo.getObjUtilities().logReporter("Display Full Name : " + objPojo.getObjTestDataBean().getStrFullName(), true);
		objPojo.getObjUtilities().logReporter("Display First Name : " + objPojo.getObjTestDataBean().getStrFirstName(), true);
		objPojo.getObjUtilities().logReporter("Display Last Name : " + objPojo.getObjTestDataBean().getStrLastName(), true);
		objPojo.getObjUtilities().logReporter("Display Address : " + objPojo.getObjTestDataBean().getStrAddress(), true);
	}

	public void checkHomeflicLogo(){
		objPojo.getObjWrapperSeleniumFunctions().checkElementDisplayed(loc_HomeflicLogo);
		//use assertion 
	}
	
	public void clickLinkLogin(){
		objPojo.getObjUtilities().logReporter("Click Login Link on Homeflic Home Page ", objPojo.getObjWrapperSeleniumFunctions().click(loc_Link_Homeflic_Login));
	}
	
	public void setUSerID(String strUserName){
		objPojo.getObjWrapperSeleniumFunctions().waitFor(10);
		objPojo.getObjUtilities().logReporter("Set USer ID : " + strUserName ,objPojo.getObjWrapperSeleniumFunctions().setText(loc_inp_UserName, strUserName));
	}
	
	public void setPassword(String strPassword){
		objPojo.getObjUtilities().logReporter("Set Password : " + strPassword,objPojo.getObjWrapperSeleniumFunctions().setText(loc_inp_Password, strPassword));
	}
	
	public void clickLogin(){
		objPojo.getObjUtilities().logReporter("Click Login : " ,objPojo.getObjWrapperSeleniumFunctions().click(loc_btn_Login));
	}
	
	public void getRandomString(){
		objPojo.getObjUtilities().logReporter("Generate Random String : "  + objPojo.getObjUtilities().getRandomString(6), true);
	}
	
}

