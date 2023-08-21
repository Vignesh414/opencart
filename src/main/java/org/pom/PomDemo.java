package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomDemo {
	public static WebDriver driver;
@FindBy(xpath="//li/a[text()='Phones & PDAs']")
private WebElement phones;
@FindBy(xpath="//div/a/img[@alt=\"iPhone\"]")
private WebElement iphoneclick;
@FindBy(xpath="//div/button[@id=\"button-cart\"]")
private WebElement addcart;
@FindBy(xpath="//li/a[text()='Components']")
private WebElement componentsclick;
@FindBy(xpath="//li/a[text()='Monitors (2)']")
private WebElement monitors;
@FindBy(xpath="//li/a[text()='Demo']")
private WebElement demobutton;
@FindBy(xpath="//*[@id=\"cms-demo\"]/div[2]/div/div[1]/div/a")
private WebElement storefront;
@FindBy(xpath="//div/h4/a[text()='Apple Cinema 30\"']")
private WebElement applemonitor;
@FindBy(xpath="//*[@id=\"input-option-value-5\"]")
private WebElement radio;
@FindBy(xpath="//*[@id=\"input-option-value-9\"]")
private WebElement checkbox;
@FindBy(id="input-option-208")
private WebElement text;
@FindBy(id="input-option-209")
private WebElement textarea;
@FindBy(xpath="//div/input[@name=\"filter_search\"]")
private WebElement marketsearch;
@FindBy(xpath="//li/a[text()='Blog']")
private WebElement blog;
@FindBy(xpath="(//li/a[text()='Download'])[1]")
private WebElement download;
@FindBy(xpath="//li/a[@data-toggle=\"dropdown\"]")
private WebElement resources;

@FindBy(xpath="//div/p/a[text()='Antropy Electron Theme']")
private WebElement marketscroll;


@FindBy(xpath="//li/a[@href=\"https://www.opencart.com/index.php?route=support/partner\"]")
private WebElement partnersclick;
@FindBy(className="form-control")
private WebElement partnerscroll;
@FindBy(xpath="//div/p/a[@href=\"https://www.opencart.com/index.php?route=support/partner/info&partner_id=128213&filter_country_id=99\"]")
private WebElement indiapartclick;
@FindBy(xpath="//div/select[@onchange=\"location = this.value\"]")
private WebElement indiadrop;







public WebElement getIndiadrop() {
	return indiadrop;
}
public WebElement getIndiapartclick() {
	return indiapartclick;
}
public WebElement getPartnerscroll() {
	return partnerscroll;
}
public WebElement getPartnersclick() {
	return partnersclick;
}
public WebElement getMarketscroll() {
	return marketscroll;
}
public WebElement getDownload() {
	return download;
}
public WebElement getResources() {
	return resources;
}
public WebElement getMarketsearch() {
	return marketsearch;
}
public WebElement getBlog() {
	return blog;
}
public WebElement getRadio() {
	return radio;
}
public WebElement getCheckbox() {
	return checkbox;
}
public WebElement getText() {
	return text;
}
public WebElement getTextarea() {
	return textarea;
}
public WebElement getApplemonitor() {
	return applemonitor;
}
public WebElement getStorefront() {
	return storefront;
}
public WebElement getDemobutton() {
	return demobutton;
}
public WebElement getPhones() {
	return phones;
	
}
public WebElement getIphoneclick() {
	return iphoneclick;
}
public WebElement getAddcart() {
	return addcart;
}
public WebElement getComponentsclick() {
	return componentsclick;
}
public WebElement getMonitors() {
	return monitors;
}

public PomDemo(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
}
