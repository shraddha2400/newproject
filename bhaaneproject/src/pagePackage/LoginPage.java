package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class LoginPage {
	
	@FindBy(xpath = "//li[text()='account']") private WebElement accountLink;
	@FindBy(name = "email") private WebElement emailTB;
	@FindBy(name = "password") private WebElement passwordTB;
	@FindBy(xpath = "(//button[text()='submit'])[1]") private WebElement submitButton;
	
	
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	
	}




	public WebElement getAccountLink() {
		return accountLink;
	}




	public WebElement getEmailTB() {
		return emailTB;
	}




	public WebElement getPasswordTB() {
		return passwordTB;
	}




	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	
	public void validLogin(String validEmail,String validPassword)
	{

		emailTB.sendKeys(validEmail);
		passwordTB.sendKeys(validPassword);
		submitButton.click();
	}
	
	
	
}