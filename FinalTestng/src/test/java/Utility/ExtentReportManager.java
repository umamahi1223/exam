package Utility;

import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReportManager {
	public static ExtentReports extentReport;
	public static ExtentTest extentTest;
	public static  void createReport(String ReportName) {
		Date date = new Date();
		String time  = date.getTime()+"";
		extentReport = new ExtentReports(System.getProperty("user.dir")+"/target/data-output/"+ReportName+"_"+time+".html");
	}
	public static void startTest(String testname) {
		extentTest = extentReport.startTest(testname);
	}
}
