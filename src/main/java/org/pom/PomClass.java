package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {

	public static WebDriver driver;
	@FindBy(xpath="(//li/a[text()='Features'])[1]")
	private WebElement features;
	@FindBy(xpath="//div/p[contains(text(),'Discover the popular extensions in the marketplace')]")
	private WebElement unlimited;
	@FindBy(xpath="(//div/a[@class=\"btn btn-lg\"])[1]")
	private WebElement unlimitedclick;
	@FindBy(xpath="//div/p[contains(text(),'No monthly fees, ')]")
	private WebElement customerscroll;
	@FindBy(xpath="//li/a[text()='Customer']")
	private WebElement customerclick;
	@FindBy(xpath="//div/h2[text()='Turn mail to your advantage']")
	private WebElement shippingscroll;
	@FindBy(xpath="//div/a[@onclick=\"$('a[href=\\'#tab-shipping\\']').click();\"]")
	private WebElement shippingclick;
	@FindBy(xpath="//div/h1[text()='Comprehensive payment gateways']")
	private WebElement extensionscroll;
	@FindBy(xpath="//li/a[text()='Extensions']")
	private WebElement extensionclick;
	@FindBy(xpath="//div/h2[text()='Partners around the world']")
	private WebElement mobilescroll;
	@FindBy(xpath="//div/a[@onclick=\"$('a[href=\\'#tab-mobile\\']').click();\"]")
	private WebElement mobileclick;
	@FindBy(xpath="//div/h1[text()='Responsive & SEO friendly']")
	private WebElement developerscroll;
	@FindBy(xpath="(//li/a[text()='Developer'])[2]")
	private WebElement developerclick;
	@FindBy(xpath="//li/a[text()='Demo']")
	private WebElement democlick;
	@FindBy(xpath="(//div/a[@class=\\\"box-overlay\\\"])[1]")
	private WebElement storefrontclick;
	@FindBy(xpath="(//li/a[@class=\\\"nav-link\\\"])[6]")
	private WebElement applemonitorclick;
	public WebElement getUnlimitedclick() {
		return unlimitedclick;
	}
	public WebElement getCustomerscroll() {
		return customerscroll;
	}
	public WebElement getCustomerclick() {
		return customerclick;
	}
	public WebElement getShippingscroll() {
		return shippingscroll;
	}
	public WebElement getShippingclick() {
		return shippingclick;
	}
	public WebElement getExtensionscroll() {
		return extensionscroll;
	}
	public WebElement getExtensionclick() {
		return extensionclick;
	}
	public WebElement getMobilescroll() {
		return mobilescroll;
	}
	public WebElement getMobileclick() {
		return mobileclick;
	}
	public WebElement getDeveloperscroll() {
		return developerscroll;
	}
	public WebElement getDeveloperclick() {
		return developerclick;
	}
	public WebElement getDemoclick() {
		return democlick;
	}
	public WebElement getStorefrontclick() {
		return storefrontclick;
	}
	public WebElement getApplemonitorclick() {
		return applemonitorclick;
	}
	public WebElement getUnlimited() {
		return unlimited;
	}
	public WebElement getFeatures() {
		return features;
	}
	public PomClass(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
}
