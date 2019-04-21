package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;


public class FindLeadsPage extends Annotations{

	public FindLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Email")  WebElement eleEmailTab;
	@FindBy(how=How.LINK_TEXT, using="Name and ID")  WebElement eleNameAndIDTab;
	@FindBy(how=How.XPATH, using="//input[@name='emailAddress']")  WebElement eleEmailField;
	@FindBy(how=How.XPATH, using="//input[@name='id']") WebElement eleIDField;
	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']") WebElement eleFindLeadButton;
	@FindBy(how=How.XPATH, using="//span[text()='Lead List']/following::a[@class='linktext'][1]") WebElement eleFirstRecord;



	public FindLeadsPage findByEmail() {
		click(eleEmailTab);
		return this;
	}
	public FindLeadsPage findByNameOrID() {
		click(eleNameAndIDTab);
		return this;
	}
	
	public FindLeadsPage enterEmail(String email) {
		clearAndType(eleEmailField, email);
		return this;
	}
	
	public FindLeadsPage enterID(String id) {
		clearAndType(eleIDField, id);
		return this;
	}
	
	public FindLeadsPage clickFindLead() {
		click(eleFindLeadButton);
		return this;
	}
	
	public ViewLeadPage clickFirstRecord() {
		click(eleFirstRecord);
		return new ViewLeadPage();
	}
}