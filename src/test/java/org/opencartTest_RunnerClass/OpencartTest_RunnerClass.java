package org.opencartTest_RunnerClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\OpencartTest_Feature\\opencartTest.feature", glue = "org.opencartTest_StepDefinition",
monochrome = true,
dryRun = false)

public class OpencartTest_RunnerClass {
	public static WebDriver driver;

	@BeforeClass
	public static void start() {

		ChromeOptions o = new ChromeOptions();

		o.addArguments("--remote-allow-origins=*");

		// o.addArguments("incognito");

		driver = new ChromeDriver(o);

	}
}
