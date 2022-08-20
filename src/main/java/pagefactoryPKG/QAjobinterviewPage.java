package pagefactoryPKG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mainPKG.baseClass;

public class QAjobinterviewPage extends baseClass {
  
	@FindBy(linkText="QA Job Interviews")
	WebElement smallqajonlinktext;
	
	public QAjobinterviewPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void smallqajonlinkclick() {
		smallqajonlinktext.click();
	}
	 public void scrollsmallqalink() {
		 Actions action=new Actions(driver);
		 
		 for(int i=1;i<=5;i++) {
			 action.sendKeys(Keys.PAGE_DOWN).build().perform();
		 }
	 }
}
