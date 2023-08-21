package org.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Features\\openCart.feature",glue="org.step")

public class Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void start() {
	
	EdgeOptions co=new EdgeOptions();

	co.addArguments("--remote-allow-origins=*");

	 driver=new EdgeDriver(co);

}
}