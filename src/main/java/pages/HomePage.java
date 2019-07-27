package pages;

import org.openqa.selenium.support.PageFactory;


import wdMethods.ProjectMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;

public class HomePage extends ProjectMethods {
	
	public HomePage() {		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//*[text()='Log In']")
	private WebElement button_login;

	
	@FindBy(how=How.XPATH,using="//*[@type='email']")
	private WebElement field_email;
	
	@FindBy(how=How.XPATH,using="//*[@type='password']")
	private WebElement field_password;
	
	@FindBy(how=How.XPATH,using="//*[text()='Personal Boards']")
	private WebElement text_loginConfirmation;
	
	@FindBy(how=How.XPATH,using="//*[@value='Log In']")
	private WebElement button_clickSubmit;
	
	
	
	
	public HomePage clickLoginButton() {
		
		click(button_login);
		return this;
	}
	
	public HomePage enterEmailandPassword(String email,String password) {
		

		
		type(field_email,email);
		type(field_password,password);
		return this;
		
	}
	
	

	public HomePage logintoUserProfile() {
		
		click(button_clickSubmit);
		return this;
	}
	
public BoardsPage verifyLogin() {
		
		verifyDisplayed(text_loginConfirmation);
		return new BoardsPage();
	}
	
	
	
	
}
