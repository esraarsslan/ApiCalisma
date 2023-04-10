package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import static base_urls.SchoolManagementonBaseUrl.schoolSetUp;

public class Hooks {

    @Before()
    public void beforeApi(){
        schoolSetUp();
    }

    @After
    public void tearDownScenarios(Scenario scenario){
        System.out.println("After Methodu");

        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(failedScreenshot, "image/png", "failed_scenario" + scenario.getName());

            Driver.closeDriver();
        }
    }
}
