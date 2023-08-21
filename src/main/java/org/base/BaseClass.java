package org.base;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	WebDriver driver;

	// launchurl
	public static void url(WebDriver driver, String s) {
		driver.get(s);

	}

	// maximizewindow
	public static void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	// navigate
	public static void navigateto(WebDriver driver, String s) {
		driver.navigate().to(s);
	}

	public static void navigateback(WebDriver driver) {
		driver.navigate().back();
	}

	public static void navigaterefresh(WebDriver driver) {
		driver.navigate().refresh();
	}

	// find element by xpath
	public WebElement findelementxpath(WebDriver driver, String s) {
		WebElement e = driver.findElement(By.xpath(s));
		return e;
	}

	// find element by id
	public WebElement findelementid(WebDriver driver, String s) {
		WebElement element = driver.findElement(By.id(s));
		return element;
	}

	// click an element
	public static void click(WebElement object) {
		object.click();

	}

	// scroll down using javascript
	public static WebElement scrolldown(WebDriver driver, WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
		return e;

	}

	// scroll up using javascript
	public static WebElement scrollup(WebDriver driver, WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", e);
		return e;
	}

	// switching to another window
	public static void getWindowHandle(WebDriver driver, int indexOfTab) {
	String handle = driver.getWindowHandle();
	ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(tab.get(indexOfTab));

	}
	//take screen shot
	public static void screentshot(String imgname,WebDriver driver) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\ELCOT\\eclipse-workspace\\OpenCart\\src\\test\\java\\Snaps" + imgname + ".png");
		FileUtils.copyFile(s, d);

	}
	//select 
	public static  void selectdropdown(WebDriver driver,String id,String value) {
		Select s1 = new Select(driver.findElement(By.id(id)));
		s1.selectByValue(value);
		
		
	}
	public static  void selectdropdownxpath(WebDriver driver,WebElement a,String visibletext) {
		
		Select s2 = new Select(a);
		 
		s2.selectByVisibleText(visibletext);
	}
	//mouse over
			//mouse over on monitors and click
			public static void mouseover(WebDriver driver, String xpath) {
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.xpath(xpath)));


			}
}