package com.pageFactory;

import org.openqa.selenium.By;

import com.generic.Pojo;

public class HomePage {

private Pojo objPojo;
	
//	By loc_HomeflicLogo = By.xpath("");
	By loc_Link_Homeflic_Login = By.xpath("//a[text()='Register']/preceding::li[1]/a[text()='Login']");
	
	
	public HomePage(Pojo pojo){
		
		this.objPojo = pojo;
	}
	
	
	/*public void checkHomeflicLogo(){
		objPojo.getObjWrapperSeleniumFunctions().checkElementDisplayed(loc_HomeflicLogo);
		//use assertion 
	}*/
	
	public void clickLinkLogin(){
		objPojo.getObjUtilities().logReporter("Click Login Link on Homeflic Home Page ", objPojo.getObjWrapperSeleniumFunctions().click(loc_Link_Homeflic_Login));
	}
	
	
	
}

