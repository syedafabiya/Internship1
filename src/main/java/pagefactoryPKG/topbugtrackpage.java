package pagefactoryPKG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mainPKG.baseClass;

public class topbugtrackpage extends baseClass {
	
	@FindBy(linkText="bug tracking system")
	WebElement bugtrackingsmalllinktxt;
	
	@FindBy(linkText="top bug tracking system")
	WebElement topbugtrackingsmalllinktxt;
	
	@FindBy(id="error-page")
	WebElement errorpage;
	
	public topbugtrackpage() {
		PageFactory.initElements(driver,this);
	}
	
	public void bugtrackclick() {
		bugtrackingsmalllinktxt.click();
	}
    public void topbugtrackclick() {
    	topbugtrackingsmalllinktxt.click();
	}
    public WebElement topbugtrackpage() {
    	return errorpage;
    }
}
