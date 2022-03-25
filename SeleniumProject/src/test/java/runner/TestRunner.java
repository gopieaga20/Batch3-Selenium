package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"D:\\BasicJava\\SeleniumProject\\src\\test\\resources" }, 
	glue = {"stepDefinition" },
	monochrome = true, 
	dryRun= false,
	tags = {"@Test "},
	plugin= {"pretty","json:Cucumber\\target\\Selenium.json"}
	)

public class TestRunner extends AbstractTestNGCucumberTests {
	@AfterClass
	public static void afterClass() {
		report.Report.cucumberReport("Cucumber\\target\\Selenium.json");
		

	}
}
