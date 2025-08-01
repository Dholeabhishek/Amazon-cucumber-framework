package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = {"stepdefinitions", "hooks"},
	    tags = "@smoke or @sanity", // ✅ This avoids loading @OutlineSearch steps
	    		//tags = "@ExcelSearch",
	    //plugin = {"pretty", "html:target/cucumber-reports"},
	    //plugin = {"pretty", "html:target/cucumber-html-report.html"},
	    		
	    				 plugin = {"pretty", "html:target/cucumber-html-report.html"},
	    		        
	    		   
	    monochrome = true
	)


		public class TestNGCucumberRunner extends AbstractTestNGCucumberTests {
		}
