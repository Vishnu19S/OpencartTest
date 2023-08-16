@oc1
Feature: Validating the Home page
Scenario: Checking all modules
Given User launches the URL
When User clicks the Features options 
And User checks the redirecting link to Unlimited everything
And User scrolldown and check the customer redirecting Link
And User scrolldown and check the Shipping redirecting Link
And User scrolldown and check the Extension redirecting Link
And User scrolldown and check the Mobile seo redirecting Link
And User scrolldown and check the Developer redirecting Link

@oc2
Scenario: Validating the Demo module
When User clicks the Demo option
And user scrolldown and  clicks View store Front 
And User checks the Demo module and add one item to cart
And User checks the Laptops module and add one item to cart
And User checks the Components module and add one item to cart
And User checks the Tablets module and add one item to cart	
And User checks the software module and add one item to cart
And User checks the Phones module and add one item to cart
And User checks the Cameras module and add one item to cart
And User checks the Mp3Players module and add one item to cart

@oc3
Scenario: Validating the Market Place Module
When User Clicks the Marketplace Module
And User Scrolldown to select MarketPLace category
And User clicks any Product and click viewall
And User Scrolldown to select Theme category
And User clicks any Theme and click viewall
And User Scrolldown to select Language category
And User Scrolldown to select Payment Gateway category
And User clicks any gateway and click viewall
And User Scrolldown to select Shipping  category
And User clicks any shipping method and click viewall
And User Scrolldown to select MOdules  category
And User clicks any module and click viewall
And User Scrolldown to select OrderTotal  category
And User clicks any order and click viewall
And User Scrolldown to select productfeeds  category
And User Scrolldown to select Reports  category
And User clicks any Reports and click viewall
And User Scrolldown to select others  category
And User clicks any other and click viewall
And User Scrolldown to select VqMod  category
And User clicks any VqMod and click viewall

@oc4
Scenario: Validating the Resource Module
When the user clicks on the Resource module.
And the user selects the Showcase option.
And the user selects the Contact Us option and fills in the required details.
And the user selects and interacts with the OpenCart Partner option.
And the user selects and reviews the active topics in the Community Forum.
And the user clicks on the Documentation link.
And the user clicks on the OpenCart Books section.
And the user clicks on the GitHub Bugtracker link.
And the user clicks on the Developer option.
Then the user has successfully navigated through the Resource module, validating various options and interactions.

