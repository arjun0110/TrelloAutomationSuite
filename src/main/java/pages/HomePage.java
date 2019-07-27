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
	
	@FindBy(how=How.XPATH,using="//*[text()='Recently Viewed']")
	private WebElement text_loginConfirmation;
	
	
	public void clickLoginButton() {
		
		click(button_login);
	}
	
	public void enterEmailandPassword(String email, String password) {
		
		type(field_email,email);
		type(field_password,password);
		
	}
	
	public void verifyLogin() {
		
		verifyDisplayed(text_loginConfirmation);
	}

}
