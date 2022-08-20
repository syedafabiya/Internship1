package stepdefinationPKG;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import mainPKG.baseClass;

public class Hooks extends baseClass {
	
	@Before
	public void loadApp() {
		initialization();
	}
	
	@After
	public void closeApp() {
		teardown();
	}

}
