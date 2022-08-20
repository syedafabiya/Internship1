package pagefactoryPKG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mainPKG.baseClass;

public class blogpage extends baseClass {
	
	
	@FindBy(linkText="Criteria for selecting Top Bug Tracking System")
	WebElement topbugtracklink;
	
//	@FindBy(xpath="//a[contains(text(),'What')]")
//	WebElement qajobinterview;
	
	@FindBy(linkText="What to Expect at QA Job Interviews")
	WebElement qajobinterview;
	
	public blogpage() {
		PageFactory.initElements(driver,this);
	}
	
	public void clicktopbugtracklink() {
		topbugtracklink.click();
	}
	
	public void clickqajobinterviewlink() {
		qajobinterview.click();
	}
	
	 public String ccurrenturl() {
		 return driver.getCurrentUrl();
	 }
	 
	 public void scrolldownqajob() {
		 Actions action=new Actions(driver);
		 
		 for(int i=1;i<=2;i++) {
			 action.sendKeys(Keys.PAGE_DOWN).build().perform();
		 }
	 }
	 public void scrolldowntopbug() {
		 Actions action=new Actions(driver);
		 
		 for(int i=1;i<=1;i++) {
			 action.sendKeys(Keys.PAGE_DOWN).build().perform();
		 }
	 }
	 


}
