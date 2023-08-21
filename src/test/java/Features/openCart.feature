Feature: automating the open cart website end to end

Scenario: verification of feature page
Given launching open cart website and click features
Then scroll down the page and click Unlimited Everything
And scroll up and click Customers
And scroll down the page and click Shipping,Payments and Report
And scroll up and click Extensions
And scroll down the page and click Mobile and Seo
And scroll up and click Developer

Scenario: verification of demo page
Given click demo option and click store front
Then switching to new window of demo page
And click phones and tabs click on iphone
And click on add to cart button and take screen shot
And select components option and select monitors
And click on apple monitor
And choose radio button and checkbox option
And Enter text and select colour enter text in textarea
And select date time and date&time and take screenshot
@tag-01
Scenario: verification of marketplace page
Given click marketplace option and search mobiles
Then scroll down and click last product
And get back to the home page and click blog
And click on download and click on resourses
And choose opencart partners
And choose india scroll down and choose the partner in page 1 and take screenshot

