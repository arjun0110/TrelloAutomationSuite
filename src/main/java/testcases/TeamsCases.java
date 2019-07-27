package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import wdMethods.ProjectMethods;

public class TeamsCases extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Add a new team and delete the same";
		testDescription="Login to user profile and verify if the user is able to add and delete a team";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
	}
	@Test
	public void verifyTeams() {
		
		new HomePage()
		.clickLoginButton()
		.enterEmailandPassword("u.arjunkumar@gmail.com","Tester123$")
		.logintoUserProfile()
		.verifyLogin()
		.clickAddnewTeam()
		.enterTeamNameandDescription()
		.clickCreatebutton()
		.verifyTeamcreated()
		.navigatetoSettings()
		.deleteTeam()
		.verifydeleteofTeam();
		
		
		
		
	}
		

}
