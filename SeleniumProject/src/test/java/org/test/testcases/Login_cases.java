package org.test.testcases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pagefactory.Login_Elements;

public class Login_cases extends BaseClass {
	
	
	Login_Elements login = new Login_Elements(driver);

	public void credentials(String username, String password) {
		login.username().sendKeys(username);
		login.password().sendKeys(password);
		System.out.println("user entered data");
	}

	public void login() throws Exception {
		login.login_btn().click();
		System.out.println("user clicked login");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(login.get_dash()));
		
	}

	public void validate_login() {
		boolean verify_welcome = login.txt_welcome().isDisplayed(); //true or false
		Assert.assertTrue(verify_welcome);
		if(verify_welcome) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
			
		}
	}

	public void getExceldata() throws Exception {
		Login_cases lg = new Login_cases();
		String user = lg.read_data("Login", 1, 0);
		String pwd = lg.read_data("Login", 1, 1);
		login.username().sendKeys(user);
		login.password().sendKeys(pwd);
		
	}
	
	
	
	

	
}
