package report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {

	public static void cucumberReport(String json) {
		 File seReport = new File("D:\\BasicJava\\SeleniumProject\\target");
		 Configuration config = new Configuration(seReport, "Selenium");
		 config.addClassifications("Browser", "Chrome");
		 config.addClassifications("Version", "99");
		 config.addClassifications("OS", "Win-10");
		 
		 List<String> li = new ArrayList<String>();
		 li.add(json);
		 
		 ReportBuilder builder = new ReportBuilder(li, config);
		 builder.generateReports();
		 
	}
}
