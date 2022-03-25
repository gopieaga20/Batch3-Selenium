package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Login_Elements {
		public WebDriver driver;
		
	public Login_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(id="txtUsername") WebElement enter_username;
	//all search criterial should match
	
	@FindBys 
	({ 
		@FindBy(id="divUsername"),
		@FindBy(id="txtUsername")
	})	WebElement enter_username;
	
	public WebElement username() {
		return enter_username;
		
	}
	
	
	//@FindBy(id="txtPassword") WebElement enter_password;
	
	//anyone search matches it considered
	@FindAll 
	({
			@FindBy(name="txtPassword"),
			@FindBy(id="txtPassword")
			})  WebElement enter_password;
	
	public WebElement password() {
		return enter_password;
		
	}
	
	
	@FindBy(name="Submit") WebElement click_login;
	
	public WebElement login_btn() {
		return click_login;
		
	}
	
	@FindBy(id="welcome") WebElement welcome;
	
	public WebElement txt_welcome() {
		return welcome;
		
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[1]/h1") WebElement dashboard;
	public WebElement get_dash() {
		return dashboard;
		
	}
	
	public void login() {
		enter_username.sendKeys("Admin");
		enter_password.sendKeys("admin123");
		click_login.click();
	}
	
	public void login1(String usr, String pwd) {
		enter_username.sendKeys(usr);
		enter_password.sendKeys(pwd);
		click_login.click();
	}
	
	
	
}
