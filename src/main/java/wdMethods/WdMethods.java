package wdMethods;

import java.awt.AWTException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public interface WdMethods {
		
	
	
		public void startApp(String browser, boolean bReturns) throws MalformedURLException ;
		public WebElement locateElement(String locator, String locValue) ;	
		public WebElement locateElement(String locValue) ;	
		public void type(WebElement ele, String data) ;
		public void click(WebElement ele);
		public String getText(WebElement ele);
		public void selectDropDownUsingText(WebElement ele, String value) ;
		public void selectDropDownUsingIndex(WebElement ele, int index) ;
		public boolean verifyTitle(String expectedTitle);
		public void closeAllBrowsers();
		
		
}



