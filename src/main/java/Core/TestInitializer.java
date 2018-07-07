package Core;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestInitializer implements ITestListener {

	ExtentReports extent = null;
	ExtentTest logger;
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext testContext) {
		// TODO Auto-generated method stub
//		String tc= testContext.getName();
//		System.out.print("case Name" + tc);
//		String mName=testContext.getClass().getName();
//		System.out.println("Test started "+ mName);
//		extent = new ExtentReports ("/home/rekha/Documents/STMExtentReport.html", true);
//		extent
//                .addSystemInfo("Host Name", "SoftwareTestingMaterial")
//                .addSystemInfo("Environment", "Automation Testing")
//                .addSystemInfo("User Name", "Rajkumar SM");
      

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestStart(ITestResult testRes) {
//	          extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	

	}

	public void onTestSuccess(ITestResult iTestResult) {
	
	        //logger.log(com.relevantcodes.extentreports.LogStatus.PASS, "Test passed");
	        //extent.flush();
	        //extent.close();
		System.out.println("Test Passed \n");
	}

}
