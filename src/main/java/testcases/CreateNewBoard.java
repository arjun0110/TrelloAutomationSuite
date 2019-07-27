package testcases;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import wdMethods.ProjectMethods;




public class CreateNewBoard extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Add a new board and delete the same";
		testDescription="Login to user profile and verify if the user is able to add and delete a board";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
	}
	@Test
	public void verifyBoards() {
		try {
		new HomePage()
		.clickLoginButton()
		.enterEmailandPassword("u.arjunkumar@gmail.com","Tester123$")
		.logintoUserProfile()
		.verifyLogin()
		.clicknewBoardlink()
		.addnewBoard()
		.waitforAddnewButton()
		.verifyBoardadded()
		.deleteBoard();
		}
		catch(Exception e) {
			 e.printStackTrace();
		}
		
		
			
	}



}
