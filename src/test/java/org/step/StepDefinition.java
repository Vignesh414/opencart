package org.step;

import java.io.IOException;
import java.util.ArrayList;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pom.PomClass;
import org.pom.PomDemo;
import org.runner.Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition extends BaseClass {
	static WebDriver driver = Runner.driver;
	public static PomClass pom = new PomClass(driver);
	public static PomDemo pom1 = new PomDemo(driver);

	@Given("launching open cart website and click features")
	public void launching_open_cart_website_and_click_features() {
		url(driver, "https://www.opencart.com/");
		maximize(driver);
		pom.getFeatures().click();
		// click(driver.findElement(By.xpath("(//a[text()='Features'])[1]")));

	}

	@Then("scroll down the page and click Unlimited Everything")
	public void scroll_down_the_page_and_click_unlimited_everything() throws InterruptedException {
		scrolldown(driver, pom.getUnlimited());
		Thread.sleep(1000);
		pom.getUnlimitedclick().click();
	}

	@Then("scroll up and click Customers")
	public void scroll_up_and_click_customers() {
		scrollup(driver, pom.getCustomerscroll());
		pom.getCustomerclick().click();

	}

	@Then("scroll down the page and click Shipping,Payments and Report")
	public void scroll_down_the_page_and_click_shipping_payments_and_report() {
		scrolldown(driver, pom.getShippingscroll());
		pom.getShippingclick().click();
	}

	@Then("scroll up and click Extensions")
	public void scroll_up_and_click_extensions() {
		scrollup(driver, pom.getExtensionscroll());
		pom.getExtensionclick().click();
	}

	@Then("scroll down the page and click Mobile and Seo")
	public void scroll_down_the_page_and_click_mobile_and_seo() {
		scrolldown(driver, pom.getMobilescroll());
		pom.getMobileclick().click();
	}

	@Then("scroll up and click Developer")
	public void scroll_up_and_click_developer() {
		scrollup(driver, pom.getDeveloperscroll());
		pom.getDeveloperclick().click();
	}

	@Given("click demo option and click store front")
	public void click_demo_option_and_click_store_front() throws InterruptedException {
		pom1.getDemobutton().click();

		Thread.sleep(1000);
		pom1.getStorefront().click();

	}

	@Then("switching to new window of demo page")
	public void switching_to_new_window_of_demo_page() {
		getWindowHandle(driver, 1);
	}

	@Then("click phones and tabs click on iphone")
	public void click_phones_and_tabs_click_on_iphone() {
		pom1.getPhones().click();
		scrolldown(driver, driver.findElement(By.xpath("//div/a[text()=\"Cameras (2)\"]")));
		pom1.getIphoneclick().click();
	}

	@Then("click on add to cart button and take screen shot")
	public void click_on_add_to_cart_button_and_take_screen_shot() throws IOException {
		pom1.getAddcart().click();
		screentshot("img", driver);

	}

	@Then("select components option and select monitors")
	public void select_components_option_and_select_monitors() {
		pom1.getComponentsclick().click();
		pom1.getMonitors().click();
	}

	@Then("click on apple monitor")
	public void click_on_apple_monitor() {

		scrolldown(driver, driver.findElement(By.xpath("//div/label[text()='Sort By']")));
		pom1.getApplemonitor().click();
	}

	@Then("choose radio button and checkbox option")
	public void choose_radio_button_and_checkbox_option() {
		scrolldown(driver, driver.findElement(By.xpath("//*[@id=\"form-product\"]/h3")));
		pom1.getRadio().click();
		pom1.getCheckbox().click();

	}

	@Then("Enter text and select colour enter text in textarea")
	public void enter_text_and_select_colour_enter_text_in_textarea() {
		pom1.getText().sendKeys("test");
		selectdropdown(driver, "input-option-217", "3");
		pom1.getTextarea().sendKeys("heloo");
	}

	@Then("select date time and date&time and take screenshot")
	public void select_date_time_and_date_time_and_take_screenshot() throws InterruptedException, IOException {

		String date = "17";
		String month = "Sep 2011";
		String[] split = month.split(" ");
		WebElement e = driver.findElement(By.id("button-upload-222"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scroll down and click unlimited
		js.executeScript("arguments[0].scrollIntoView(true)", e);
		Thread.sleep(1000);

		Actions ac = new Actions(driver);
		Thread.sleep(1000);
		Actions moveToElement = ac.moveToElement(driver.findElement(By.id("input-option-219")));
		moveToElement.click();
		while (true) {
			(driver.findElement(By.id("input-option-219"))).click();
			Thread.sleep(1000);
			String text = (driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/table/thead/tr[1]/th[2]")))
					.getText();
			System.out.println(text);
			String[] split2 = text.split(" ");
			if (text.equals(month)) {
				break;
			} else {
				(driver.findElement(By.xpath("(//div/table/thead/tr[1]/th[3][@class=\"next available\"])[1]"))).click();

			}
		}
		(driver.findElement(By.xpath("(//div/table/tbody/tr/td[text()=" + date + "])[1]"))).click();

		screentshot("img1", driver);
		getWindowHandle(driver, 0);
	}

	@Given("click marketplace option and search mobiles")
	public void click_marketplace_option_and_search_mobiles() {
		(driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[3]/a"))).click();
		pom1.getMarketsearch().sendKeys("Mobiles");

	}

	@Then("scroll down and click last product")
	public void scroll_down_and_click_last_product() throws IOException {
		scrolldown(driver, driver.findElement(By.xpath("(//div/a/img[@class=\"img-responsive\"])[34]")));
		pom1.getMarketscroll().click();
		screentshot("marketsearch", driver);
	}
	@Then("get back to the home page and click blog")
	public void get_back_to_the_home_page_and_click_blog() {
		navigateback(driver);
		pom1.getBlog().click();
	}

	@Then("click on download and click on resourses")
	public void click_on_download_and_click_on_resourses() {
		pom1.getDownload().click();
		pom1.getResources().click();
	}

	@Then("choose opencart partners")
	public void choose_opencart_partners() {
		mouseover(driver, "//li/a[text()='OpenCart Partners']");
		pom1.getPartnersclick().click();
		
	}

	@Then("choose india scroll down and choose the partner in page {int} and take screenshot")
	public void choose_india_scroll_down_and_choose_the_partner_in_page_and_take_screenshot(Integer int1) throws IOException {
selectdropdownxpath(driver, pom1.getIndiadrop(), "India (14)");
scrolldown(driver, pom1.getPartnerscroll());
pom1.getIndiapartclick().click();
screentshot("indpart", driver);
navigateback(driver);
driver.close();

	}

}
