package pagefactoryPKG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mainPKG.baseClass;

public class howToBoostQAskillpage extends baseClass {
	
	@FindBy(linkText="How to Boost QA Skills Efficiency")
	WebElement howtoboostQaSkill;
	
	@FindBy(linkText="QA Skills Efficiency")
	WebElement qaengineersmallLink;
	
	@FindBy(id="comment")
	WebElement commentbox;
	
	@FindBy(id="author")
	WebElement namebox;
	
	@FindBy(id="email")
	WebElement emailbox;
	
	@FindBy(id="submit")
	WebElement postbttn;
	
	@FindBy(id="url")
	WebElement website;
	
	@FindBy(className="comment-body")
	WebElement commentdisplay;
	
	public howToBoostQAskillpage() {
		PageFactory.initElements(driver, this);
	}
	
	public void howtoboostQaSkillclick() {
		howtoboostQaSkill.click();
	}
	
	public void qaengineersmallLinkclick() {
		qaengineersmallLink.click();
	}
	
	public void commentboxtype() {
		commentbox.sendKeys("Very Good Article!");
	}
	
	public void nametype() {
		namebox.sendKeys("Syeda");
	}
	
	public void emailtype() {
		emailbox.sendKeys("t@gmail.com");
	}
	
	public void websitetype() {
		website.sendKeys("https://transfotechacademy.com/top-bug-tracking-system/");
	}
	public void postbuttonclick() {
		postbttn.click();
	}
	 public WebElement howToBoostQAskillpage() {
		 return commentdisplay;
	 }
	 
	 public void scrollup() {
		 Actions action=new Actions(driver);
		 
		 for(int i=1;i<=2;i++) {
			 action.sendKeys(Keys.PAGE_UP).build().perform();
		 }
	 }

}
