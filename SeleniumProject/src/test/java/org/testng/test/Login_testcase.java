package org.testng.test;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.testcases.BaseClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagefactory.Admin_Elements;
import pagefactory.Login_Elements;

public class Login_testcase extends BaseClass {
	
	
	@BeforeTest
	public void lauching_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	@Test(enabled=false)
	public void login_tc() {
		Login_Elements login_tc = new Login_Elements(driver);
		login_tc.login();
	}
	
	@Test(enabled=false)
	@Parameters ({"username", "password"})
	public void tc_login(String v1, String v2  ) {
		Login_Elements login_tc = new Login_Elements(driver);
		login_tc.login1(v1, v2);
	}
	
	@Test
	public void tc_login1() throws Exception {
		Login_testcase lg = new Login_testcase();
		Login_Elements login_tc = new Login_Elements(driver);
		String user = lg.read_data("Login", 1, 0);
		String pwd = lg.read_data("Login", 1, 1);
		login_tc.username().sendKeys(user);
		login_tc.password().sendKeys(pwd);
		login_tc.login_btn().click();
		boolean verify_welcome = login_tc.txt_welcome().isDisplayed(); //true or false
		Assert.assertTrue(verify_welcome);
		if(verify_welcome) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
			
		}
		
		
	}
	
	@Test(dependsOnMethods="tc_login1")
	public void tc_admin() throws Exception {
		Admin_Elements admin = new Admin_Elements(driver);
		admin.click_admin().click();;
		Thread.sleep(3000);
		
		List<WebElement> user_table = driver.findElements(By.tagName("td"));
		String name = "John Smith";
		for(WebElement cell_value : user_table ) {
			System.out.println(cell_value.getText());
			if(cell_value.getText().equals(name)) {
				break;
			}
		}
	}
	
	@AfterTest
	public void close_browser() {
		driver.close();
	}
}
