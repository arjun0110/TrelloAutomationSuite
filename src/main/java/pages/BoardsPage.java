package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class BoardsPage extends ProjectMethods {
	
	private String boardName="newname";
	
	
	public BoardsPage() {		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='board-tile mod-add']")
	private WebElement button_addnewBoard;
	
	@FindBy(how=How.XPATH,using="//*[@placeholder='Add board title']")
	private WebElement field_addnewBoard;
	
	@FindBy(how=How.XPATH,using="//*[@class='subtle-chooser-trigger unstyled-button vis-chooser-trigger']")
	private WebElement button_private;
	
	@FindBy(how=How.XPATH,using="//*[text()='Create Board']")
	private WebElement button_add;
	


	@FindBy(how=How.XPATH,using="//*[contains(@class,'list-header-target')]")
	private WebElement text_boardhomepage;
	
	@FindBy(how=How.XPATH,using="//*[text()='Show Menu']")
	private WebElement link_showmore;	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'open-more')]")
	private WebElement link_openmore;	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'close-board')]")
	private WebElement link_closeboard;	
	
	@FindBy(how=How.XPATH,using="//*[contains(@value,'Close')]")
	private WebElement button_delete;	
	
	@FindBy(how=How.XPATH,using="//*[@class='quiet js-delete']")
	private WebElement button_permenantdelete;	
	
	
	@FindBy(how=How.XPATH,using="//*[@class='little-message']")
	private WebElement text_confirmdelete;	
	
	@FindBy(how=How.XPATH,using="//*[contains(@value,'Delete')]")
	private WebElement button_permenantlydelete;
	
	
	public BoardsPage clicknewBoardlink() {
		
		click(button_addnewBoard);
		return this;
	}
	
	public BoardsPage addnewBoard() {
		
		type(field_addnewBoard,boardName);
		click(button_add);
		
		return this;
	}
	
	public BoardsPage waitforAddnewButton() {
		
		explicitWaitVisibilityOfElement(text_boardhomepage,10000);
		return this;
	}
	
	public BoardsPage verifyBoardadded() {
		if(getcurrentURL().contains(boardName)) {
			System.out.println("Board added successfully");
		}
		else
		{
			System.out.println("Unable to add the board");
		}
		
		return this;
	}
	
	public BoardsPage deleteBoard() {
		
		click(link_showmore);
		click(link_openmore);
		click(link_closeboard);
		click(button_delete);
		click(button_permenantdelete);
		click(button_permenantlydelete);
		verifyDisplayed(text_confirmdelete);
		
		return this;
		
	}
	
}
