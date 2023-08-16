package org.opencartTest_StepDefinition;

import java.io.IOException;

import org.opencartTest_Base.OpencartTest_Base;
import org.opencartTest_Pom.OpencartTest_Pom;
import org.opencartTest_RunnerClass.OpencartTest_RunnerClass;
import org.openqa.selenium.WebDriver;

import com.google.common.util.concurrent.ClosingFuture.ClosingCallable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpencartTest_StepDefinition extends OpencartTest_Base {

	public static WebDriver driver = OpencartTest_RunnerClass.driver;//Runner Class
	public static OpencartTest_Pom ocp = new OpencartTest_Pom(driver);//Pom Class
	
	@Given("User launches the URL")
	public void user_launches_the_url() {
		//toHold(driver, 10);
		url(driver, "https://www.opencart.com/");
		maxi(driver);
	   	}
	@When("User clicks the Features options")
	public void user_clicks_the_features_options() throws IOException {
		features(ocp.getFeatures());
		snapshot(driver, "Admin");
		scrolldown(driver, ocp.getScrdown1());
		
	}
	@When("User checks the redirecting link to Unlimited everything")
	public void user_checks_the_redirecting_link_to_unlimited_everything() throws IOException {
	  click(ocp.getFirstLink());
	  scrollup(driver,ocp.getScrup1());
	  snapshot(driver, "Unlimited");
	}
	@When("User scrolldown and check the customer redirecting Link")
	public void user_scrolldown_and_check_the_customer_redirecting_link() throws IOException {
	   scrolldown(driver, ocp.getScrdown2());
	   click(ocp.getSecondlink());
	   scrollup(driver, ocp.getScrup2());
	  snapshot(driver, "Customer");
	}
	@When("User scrolldown and check the Shipping redirecting Link")
	public void user_scrolldown_and_check_the_shipping_redirecting_link() throws IOException {
		scrolldown(driver, ocp.getScrdown3());
		click(ocp.getThirdlink());
		scrollup(driver, ocp.getScrup3());
		snapshot(driver, "Shipping");
	  
	}
	@When("User scrolldown and check the Extension redirecting Link")
	public void user_scrolldown_and_check_the_extension_redirecting_link() throws IOException {
		scrolldown(driver, ocp.getScrdown4());
		click(ocp.getFourthlink());
		scrollup(driver,ocp.getScrup4());
		snapshot(driver, "Extension");
		}
	@When("User scrolldown and check the Mobile seo redirecting Link")
	public void user_scrolldown_and_check_the_mobile_seo_redirecting_link() throws IOException {
		scrolldown(driver, ocp.getScrdown5());
		click(ocp.getFifthlink());
		scrollup(driver, ocp.getScrup5());
		snapshot(driver, "Mobile SEO");
	    }
	@When("User scrolldown and check the Developer redirecting Link")
	public void user_scrolldown_and_check_the_developer_redirecting_link() throws IOException {
		scrolldown(driver, ocp.getScrdown6());
		click(ocp.getSixthlink());
		scrollup(driver, ocp.getScrup6());
		snapshot(driver, "Developer"); 
	}
	
	@When("User clicks the Demo option")
	public void user_clicks_the_demo_option() {
		click(ocp.getDemo());
	  
	}
	@When("user scrolldown and  clicks View store Front")
	public void user_scrolldown_and_clicks_view_store_front() {
		click(ocp.getStorefront());
		
	}
	@When("User checks the Demo module and add one item to cart")
	public void user_checks_the_demo_module_and_add_one_item_to_cart() throws IOException, InterruptedException {
		windowhandle(driver,"https://demo.opencart.com/");
		click(ocp.getDesktop());
		click(ocp.getMac());
		scrolldown(driver, ocp.getScrdown7());
		Thread.sleep(2000);
		click(ocp.getDesktopcart());
		scrollup(driver, ocp.getScrup7());
		Thread.sleep(2000);
		snapshot(driver, "Desktop Cart");
	    
	}
	@When("User checks the Laptops module and add one item to cart")
	public void user_checks_the_laptops_module_and_add_one_item_to_cart() throws InterruptedException, IOException {
		
		click(ocp.getLaptop());
		click(ocp.getShowalllaps());
		scrolldown(driver, ocp.getScrdown8());
		Thread.sleep(2000);
		click(ocp.getMaclap());
		scrolldown(driver, ocp.getScrdown9());
		Thread.sleep(2000);
		click(ocp.getLaptopcart());
		scrollup(driver, ocp.getScrup8());
		Thread.sleep(2000);
		snapshot(driver, "Laptopcart");
	 
	}
	@When("User checks the Components module and add one item to cart")
	public void user_checks_the_components_module_and_add_one_item_to_cart() throws InterruptedException, IOException {
	click(ocp.getComponents());
	click(ocp.getMonitors());
	scrolldown(driver, ocp.getScrdown10());
	Thread.sleep(2000);
	click(ocp.getSamsung());
	scrolldown(driver, ocp.getScrdown11());
	Thread.sleep(2000);
	click(ocp.getMonitorcart());
	scrollup(driver, ocp.getScrup9());
	Thread.sleep(2000);
	snapshot(driver, "Componenets Cart");
	
	
	}
	@When("User checks the Tablets module and add one item to cart")
	public void user_checks_the_tablets_module_and_add_one_item_to_cart() throws IOException, InterruptedException {
		click(ocp.getTablets());
		scrolldown(driver, ocp.getScrdown12());
		Thread.sleep(3000);
		click(ocp.getTabletcart());
		scrollup(driver, ocp.getScrup10());
		Thread.sleep(3000);
		snapshot(driver, "Tablets Cart");
	}
	@When("User checks the software module and add one item to cart")
	public void user_checks_the_software_module_and_add_one_item_to_cart() throws IOException {
	    click(ocp.getSoftware());
	    snapshot(driver, "Software module");
	    click(ocp.getCont());
	}
	@When("User checks the Phones module and add one item to cart")
	public void user_checks_the_phones_module_and_add_one_item_to_cart() throws IOException, InterruptedException {
		click(ocp.getPhones());
		scrolldown(driver, ocp.getScrdown13());
		Thread.sleep(2000);
		click(ocp.getIphone());
		scrolldown(driver, ocp.getScrdown14());
		Thread.sleep(2000);
		click(ocp.getPhonecart());
		scrollup(driver, ocp.getScrup11());
		Thread.sleep(2000);
		snapshot(driver, "Phone cart");
		
	    	}
	@When("User checks the Cameras module and add one item to cart")
	public void user_checks_the_cameras_module_and_add_one_item_to_cart() throws IOException, InterruptedException {
		click(ocp.getCamera());
		scrolldown(driver, ocp.getScrdown15());
		Thread.sleep(2000);
		click(ocp.getNikon());
		scrolldown(driver, ocp.getScrdown16());
		Thread.sleep(2000);
		click(ocp.getCamcart());
		scrollup(driver, ocp.getScrup12());
		Thread.sleep(2000);
		snapshot(driver, "Camera cart");
	    
	}
	@When("User checks the Mp3Players module and add one item to cart")
	public void user_checks_the_mp3players_module_and_add_one_item_to_cart() throws IOException, InterruptedException {
		click(ocp.getMp3player());
		click(ocp.getShowall());
		scrolldown(driver, ocp.getScrdown17());
		Thread.sleep(3000);
		click(ocp.getIpod());
		scrolldown(driver, ocp.getScrdown18());
		Thread.sleep(2000);
		click(ocp.getMp3cart());
		scrollup(driver, ocp.getScrup13());
		Thread.sleep(2000);
		snapshot(driver, "MP3 Cart");
		click(ocp.getStore());
	
		windowhandleparent(driver);
		click(ocp.getHomeStore());
	}
	@When("User Clicks the Marketplace Module")
	public void user_clicks_the_marketplace_module() {
		click(ocp.getMarketplace());
	    
	}
	@When("User Scrolldown to select MarketPLace category")
	public void user_scrolldown_to_select_market_p_lace_category() {
	   scrolldown(driver, ocp.getScrdown19());
	   click(ocp.getMarketcategory());
	    
	}
	@When("User clicks any Product and click viewall")
	public void user_clicks_any_product_and_click_viewall() throws IOException {
	   scrolldown(driver, ocp.getScrdown20());
	   snapshot(driver, "Market");
	   click(ocp.getProduct());
	   
	   scrolldown(driver, ocp.getScrdown21());
	   scrollup(driver, ocp.getScrup14());
	   click(ocp.getViewall1());
	    
	}
	@When("User Scrolldown to select Theme category")
	public void user_scrolldown_to_select_theme_category() throws InterruptedException {
	   scrolldown(driver, ocp.getScrdown22());
	   
	   click(ocp.getThemecategory());
	    
	}
	@When("User clicks any Theme and click viewall")
	public void user_clicks_any_theme_and_click_viewall() throws IOException {
	   scrolldown(driver, ocp.getScrdown23());
	   snapshot(driver, "Theme");
//	   click(ocp.getTheme());
//	   scrolldown(driver, ocp.getScrdown24());
//	   scrollup(driver, ocp.getScrup15());
//	   click(ocp.getViewall2());
	    
	}
	@When("User Scrolldown to select Language category")
	public void user_scrolldown_to_select_language_category() throws IOException {
		scrolldown(driver, ocp.getScrdown25());
		click(ocp.getLanguagecategory());
		snapshot(driver, "Language");
		 
	}
	@When("User Scrolldown to select Payment Gateway category")
	public void user_scrolldown_to_select_payment_gateway_category() {
	  scrolldown(driver, ocp.getScrdown26());
	  click(ocp.getPaymentgatewaycategory());
	  
	}
	@When("User clicks any gateway and click viewall")
	public void user_clicks_any_gateway_and_click_viewall() throws IOException {
	  scrolldown(driver,ocp.getScrdown27());
	  snapshot(driver, "Gateway");
//	  click(ocp.getGateway());
//	  scrolldown(driver, ocp.getScrdown28());
//	  scrollup(driver, ocp.getScrup16());
//	  click(ocp.getViewall3());
	    
	}
	@When("User Scrolldown to select Shipping  category")
	public void user_scrolldown_to_select_shipping_category() {
	   scrolldown(driver, ocp.getScrdown29());
	   click(ocp.getShippingcategory());
	    
	}
	@When("User clicks any shipping method and click viewall")
	public void user_clicks_any_shipping_method_and_click_viewall() throws IOException {
		   scrolldown(driver, ocp.getScrdown30());
		   snapshot(driver, "Shipping");
//		   click(ocp.getShipping());
//		   scrolldown(driver, ocp.getScrdown31());
//		   scrollup(driver, ocp.getScrup17());
//		   click(ocp.getViewall4());
	    
	}
	@When("User Scrolldown to select MOdules  category")
	public void user_scrolldown_to_select_m_odules_category() {
		 scrolldown(driver, ocp.getScrdown32());
		   click(ocp.getModulecategory());
	    
	}
	@When("User clicks any module and click viewall")
	public void user_clicks_any_module_and_click_viewall() throws IOException {
		scrolldown(driver, ocp.getScrdown33());
		snapshot(driver, "Module");
//		   click(ocp.getModule());
//		   scrolldown(driver, ocp.getScrdown34());
//		   scrollup(driver, ocp.getScrup18());
//		   click(ocp.getViewall5());
	    
	}
	@When("User Scrolldown to select OrderTotal  category")
	public void user_scrolldown_to_select_order_total_category() {
		   scrolldown(driver, ocp.getScrdown35());
		   click(ocp.getOrdertotalcategory());
	    
	}
	@When("User clicks any order and click viewall")
	public void user_clicks_any_order_and_click_viewall() throws IOException {
		   scrolldown(driver, ocp.getScrdown36());
		   snapshot(driver, "order");
//		   click(ocp.getOrdertotal());
//		   scrolldown(driver, ocp.getScrdown37());
//		   scrollup(driver, ocp.getScrup19());
//		   click(ocp.getViewall6());
	    
	}
	@When("User Scrolldown to select productfeeds  category")
	public void user_scrolldown_to_select_productfeeds_category() throws IOException {
		 scrolldown(driver, ocp.getScrdown38());
		   click(ocp.getProductfeedcategory());
		   snapshot(driver, "Productfeed");
	    
	}
	@When("User Scrolldown to select Reports  category")
	public void user_scrolldown_to_select_reports_category() throws IOException, InterruptedException {
		 scrolldown(driver, ocp.getScrdown39());
		 Thread.sleep(2000);
		 click(ocp.getReportcategory());
	
//		   click(ocp.getProductfeed());
//		   scrolldown(driver, ocp.getScrdowm40());
//		   scrollup(driver, ocp.getScrup20());
//		   click(ocp.getViewall7());
	    
	}
	@When("User clicks any Reports and click viewall")
	public void user_clicks_any_reports_and_click_viewall() throws IOException {
		 scrolldown(driver, ocp.getScrdown41());
		 snapshot(driver, "Reports");
		 //  click(ocp.getReportcategory());
	    
	}
	@When("User Scrolldown to select others  category")
	public void user_scrolldown_to_select_others_category() {
		 scrolldown(driver, ocp.getScrdown42());
		 click(ocp.getOrdercateegory());
//		   click(ocp.getReport());
//		   scrolldown(driver, ocp.getScrdown43());
//		   click(ocp.getViewall8());
	    
	}
	@When("User clicks any other and click viewall")
	public void user_clicks_any_other_and_click_viewall() throws IOException {
		scrolldown(driver, ocp.getScrdown44());
		 snapshot(driver, "Other");
	    
	}
	@When("User Scrolldown to select VqMod  category")
	public void user_scrolldown_to_select_vq_mod_category() {
		scrolldown(driver, ocp.getScrdown46());
		   click(ocp.getVqmodcategory());
	    
	}
	@When("User clicks any VqMod and click viewall")
	public void user_clicks_any_vq_mod_and_click_viewall() throws IOException {
		scrolldown(driver, ocp.getScrdown47());
		 snapshot(driver, "VQMOD");
//		   click(ocp.getVqmod());
//		   scrolldown(driver, ocp.getScrdown48());
//		   scrollup(driver, ocp.getScrup21());
//		   click(ocp.getViewall9());
	    click(ocp.getBacktohome());
	}

	@When("the user clicks on the Resource module.")
	public void the_user_clicks_on_the_resource_module() {
		click(ocp.getResource());
	   
	}
	@When("the user selects the Showcase option.")
	public void the_user_selects_the_showcase_option() {
		click(ocp.getShowcase());
		scrolldown(driver, ocp.getScrdowm40());
	   
	}
	@When("the user selects the Contact Us option and fills in the required details.")
	public void the_user_selects_the_contact_us_option_and_fills_in_the_required_details() {
	   
	}
	@When("the user selects and interacts with the OpenCart Partner option.")
	public void the_user_selects_and_interacts_with_the_open_cart_partner_option() {
	   
	}
	@When("the user selects and reviews the active topics in the Community Forum.")
	public void the_user_selects_and_reviews_the_active_topics_in_the_community_forum() {
	    
	}
	@When("the user clicks on the Documentation link.")
	public void the_user_clicks_on_the_documentation_link() {
	   
	}
	@When("the user clicks on the OpenCart Books section.")
	public void the_user_clicks_on_the_open_cart_books_section() {
	    
	}
	@When("the user clicks on the GitHub Bugtracker link.")
	public void the_user_clicks_on_the_git_hub_bugtracker_link() {
	    
	}
	@When("the user clicks on the Developer option.")
	public void the_user_clicks_on_the_developer_option() {
	    
	}
	@Then("the user has successfully navigated through the Resource module, validating various options and interactions.")
	public void the_user_has_successfully_navigated_through_the_resource_module_validating_various_options_and_interactions() {
	    
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
