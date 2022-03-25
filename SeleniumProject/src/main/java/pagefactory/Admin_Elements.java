package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Elements {
	
	public WebDriver driver;
	
	public Admin_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="menu_admin_viewAdminModule") WebElement admin_menu;
	
	public WebElement click_admin() {
		return admin_menu;
	}
	
	

}
