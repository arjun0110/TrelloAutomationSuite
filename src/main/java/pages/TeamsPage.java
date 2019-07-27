package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class TeamsPage extends ProjectMethods {
	
	String teamName="newname";
	
	
	public TeamsPage() {		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//*[@name='displayName']")
	private WebElement field_name;
	
	@FindBy(how=How.XPATH,using="//*[@name='desc']")
	private WebElement field_description;
	
	@FindBy(how=How.XPATH,using="//*[@value='Create']")
	private WebElement button_Create;
	
	@FindBy(how=How.XPATH,using="//*[@class='board-tile mod-add']")
	private WebElement text_boards;

	
	@FindBy(how=How.XPATH,using="//*[text()='Settings']")
	private WebElement button_settings;
	
	@FindBy(how=How.XPATH,using="//*[@class='quiet-button']/span")
	private WebElement link_deleteteam;
	
	@FindBy(how=How.XPATH,using="//*[@value='Delete Forever']")
	private WebElement button_deleteteam;
	
	
	
	
	public TeamsPage enterTeamNameandDescription() {
		
		type(field_name, teamName);
		type(field_description, "adding a newteam");
		
		return this;
	}
	
	public TeamsPage clickCreatebutton() {
		
		click(button_Create);
		return this;
	}
	
	
	public TeamsPage verifyTeamcreated() 	
	
	{
		
		if(verifyPageContentForText("Teams","Team addition")) {
		System.out.println("Team added successfully");
	}
	else
	{
		System.out.println("Unable to add the Team");
	}
	
	return this;
}
	
	public TeamsPage navigatetoSettings() {
		
		click(button_settings);
		return this;
	}
	
	public TeamsPage deleteTeam() {
		
		click(link_deleteteam);
		click(button_deleteteam);
		return this;
		
	}
	
	public TeamsPage verifydeleteofTeam() {
		
		if(!getcurrentURL().contains(teamName)) {
			
			System.out.println("Team deleted successfully");
		}
		else {
			System.out.println("Unable to delete the team");
		}
		return this;
	}
	
}