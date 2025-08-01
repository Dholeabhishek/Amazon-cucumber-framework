package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            // ✅ Use SparkReporter directly, not in array
            ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
            extent = new ExtentReports();
            extent.attachReporter(spark); // ✅ This is correct
            extent.setSystemInfo("Author","Abhishek Dhole"); 
            extent.setSystemInfo("Framework","Cucumber-TestNG Hybrid"); 
            extent.setSystemInfo("Environment", "QA");
        }
        return extent;
    }
}  
