package pagefactoryPKG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mainPKG.baseClass;

public class homepage extends baseClass {
 
	@FindBy(linkText="Blogs")
	WebElement blogslink;
	
	public homepage() {
		PageFactory.initElements(driver,this);
	}
	 public void clickbloglink() {
		 blogslink.click();
	 }
	 
	 public String currenturl() {
		 return driver.getCurrentUrl();
	 }
}
