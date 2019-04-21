package com.selbot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selbot.pages.LoginPage;
import com.selbot.testng.api.base.Annotations;

public class TC002_DuplicateLead extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC002_DuplicateLead";
		testcaseDec = "Login, Duplicate Lead and Verify";
		author = "Daniel";
		category = "smoke";
		excelFileName = "TC002";
	} 

	@Test(dataProvider="fetchData") 
	public void duplicateLead(String uName, String pwd, String email) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd) 
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.findByEmail()
		.enterEmail(email)
		.clickFindLead()
		.clickFirstRecord()
		.clickDuplicate()
		.clickCreateLead();
	}
	
}
