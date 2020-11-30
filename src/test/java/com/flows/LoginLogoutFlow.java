package com.flows;

import com.generic.Pojo;
import com.pageFactory.HomePage;
import com.pageFactory.LoginPage;

public class LoginLogoutFlow {
	
	
	private Pojo objPojo;
	private String testData="";
	private HomePage objHomePage;
	private LoginPage  objLoginPage;
	
	
	public LoginLogoutFlow(Pojo pojo){
		this.objPojo=pojo;
		objHomePage= new HomePage(objPojo);
		objLoginPage = new LoginPage(objPojo);
		
	}
	
	
	
	
	
	
	
	
	
	
	public void doLogin(){
		
		objHomePage.clickLinkLogin();
		objLoginPage.verifyLoginPageHeader();
		testData=objPojo.getObjUtilities().dpString("strUserName");
		if(!testData.equals(""))
			objLoginPage.setUSerID(testData);
		testData = objPojo.getObjUtilities().dpString("strPassword");
		if(!testData.equals(""))
			objLoginPage.setPassword(testData);
		objLoginPage.clickLogin();
		
	}
	
	
	
	
	
	

}
