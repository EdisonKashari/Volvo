package com.volvo.step_definitions;

import com.volvo.utilities.BrowserUtils;
import com.volvo.utilities.ConfigurationReader;
import com.volvo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @After
    public void teardownScenario(Scenario scenario) {

        //scenario.isFailed() --> if scenario fails thios method will return TRUE boolean value

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", scenario.getName());


        }


        BrowserUtils.sleep(2);
        Driver.closeDriver();
    }
}