package ganericPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest implements IAutoconstant  {
	protected static WebDriver driver;


	@BeforeMethod
	public void setUp() throws IOException
	{
		ChromeOptions co = new 	ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		Flib flib = new Flib();
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(flib.readPropertyData(PROP_PATH,"url"));
	}

	
	public void failed(String faliedMethod)
	{
		try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenShots/"+faliedMethod+".png");
		Files.copy(src, dest);
		}
		
		catch(Exception e)
		{
			
		}
		
	}

	@AfterMethod
	public void teraDown()
	{
		driver.quit();
	}
}
