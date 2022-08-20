package mainPKG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public baseClass() {
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\suzan\\eclipse-workspace\\Internship1"
					+ "\\src\\main\\java\\configPKG\\configfile.properties");
prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
	public void initialization() {
		System.setProperty(prop.getProperty("chromekey"),prop.getProperty("chromepath"));
		driver=new ChromeDriver();
		driver.get(prop.getProperty("testurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
	}
   public void teardown() {
		driver.close();
	}
}
