package pagefactoryPKG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mainPKG.baseClass;

public class tenImportantQAskillspage extends baseClass {
	
	@FindBy(linkText="10 Important Skills Needed for a QA Engineer")
	WebElement tenimpqaskills;
	
	@FindBy(linkText="QA Engineer")
	WebElement qaengineersmallLink;
	
	@FindBy(linkText="qa engineer course")
	WebElement qaengineercoursesmallLink;
	
	public tenImportantQAskillspage() {
		PageFactory.initElements(driver,this);
	}
	
	public void tenimpskillclick() {
		tenimpqaskills.click();
	}
	
	public void qaengineercoursemallLinklclick() {
		qaengineercoursesmallLink.click();
	}
	
	public void qaengineersmallLinklclick() {
		qaengineersmallLink.click();
	}
	

}
