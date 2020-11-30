package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.flows.LoginLogoutFlow;
import com.generic.BaseTest;
import com.pageFactory.MyProfilePage;

public class LoginTest extends BaseTest{
	
	private LoginLogoutFlow objLoginLogoutFlow;
	private MyProfilePage objMyProfilePage;
	
	public void initializeWebPages() {
		
		objLoginLogoutFlow= new LoginLogoutFlow(this);
		objMyProfilePage =new MyProfilePage(this);
	}

	@BeforeClass
	public void initializeWebEnvironmentAndTestDataSetup() {
		this.initializeWebPages();
		this.initializeWebEnvironment("excelFiles/SRS");
	}

	@Test(priority = 1, enabled = true)
	public void TCID_101_VerifyLogin() {
		
		this.loadTestData("TCID_101_VerifyLogin");
		objLoginLogoutFlow.doLogin();
		objMyProfilePage.verifyLogoutLinkDisplayed();
	}

	@AfterClass
	public void tearDownEnvironment() {
		this.getDriver().close();
	}

}

	
	


