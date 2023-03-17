package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ganericPackage.BaseTest;
import ganericPackage.CustomListner;
import ganericPackage.Flib;
import pagePackage.LoginPage;
@Listeners(CustomListner.class)

public class ValidTest extends BaseTest{
	
	
	
	@Test
	public void validLogIn() throws IOException, InterruptedException
	{
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		
		Thread.sleep(2000);
		lp.validLogin(flib.readPropertyData(PROP_PATH, "email"),flib.readPropertyData(PROP_PATH, "password "));
		
	}

}
