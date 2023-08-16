package org.opencartTest_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpencartTest_Pom {
	public static WebDriver driver;
	@FindBy(xpath = "//ul[@class='nav navbar-nav']//a[normalize-space()='Features']")
	private WebElement Features;

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Unlimited everything']")
	private WebElement FirstLink;

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Customer']")
	private WebElement Secondlink;

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Shipping, Payments and Reports']")
	private WebElement Thirdlink;

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Extensions']")
	private WebElement fourthlink;

	@FindBy(xpath = "//a[normalize-space()='Mobile and SEO']")
	private WebElement Fifthlink;

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Developer']")
	private WebElement sixthlink;

	@FindBy(xpath = "//h3[normalize-space()='Affiliates']")
	private WebElement scrdown1;

	@FindBy(xpath = "//h2[normalize-space()='Free to download and use']")
	private WebElement scrup1;

	@FindBy(xpath = "//h3[normalize-space()='Downloadable Products Ready']")
	private WebElement scrdown2;

	@FindBy(xpath = "//h2[normalize-space()='Filters']")
	private WebElement scrup2;

	@FindBy(xpath = "//h2[normalize-space()='Turn mail to your advantage']")
	private WebElement scrdown3;

	@FindBy(xpath = "//h1[normalize-space()='Comprehensive payment gateways']")
	private WebElement scrup3;

	@FindBy(xpath = "//h2[normalize-space()='Sales reports']")
	private WebElement scrdown4;

	@FindBy(xpath = "//h1[normalize-space()='Easily extend the functionality']")
	private WebElement scrup4;

	@FindBy(xpath = "//h2[normalize-space()='Partners around the world']")
	private WebElement scrdown5;

	@FindBy(xpath = "//h1[normalize-space()='Responsive & SEO friendly']")
	private WebElement scrup5;

	@FindBy(xpath = "//h2[normalize-space()='Guest and Registered user Checkout']")
	private WebElement Scrdown6;

	@FindBy(xpath = "//h1[contains(text(),'Sell your modules and themes on the OpenCart marke')]")
	private WebElement scrup6;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//a[normalize-space()='Demo']")
	private WebElement Demo;

	@FindBy(xpath = "//span[normalize-space()='View Store Front']")
	private WebElement storefront;

	@FindBy(xpath = "//a[normalize-space()='Desktops']")
	private WebElement Desktop;

	@FindBy(xpath = "//a[normalize-space()='Mac (1)']")
	private WebElement mac;

	@FindBy(xpath = "//a[normalize-space()='Cameras (2)']")
	private WebElement scrdown7;

	@FindBy(xpath = "//button[@aria-label='Add to Cart']")
	private WebElement Desktopcart;

	@FindBy(xpath = "//a[normalize-space()='Desktops']")
	private WebElement scrup7;

	@FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
	private WebElement laptop;

	@FindBy(xpath = "//a[normalize-space()='Show All Laptops & Notebooks']")
	private WebElement showalllaps;

	@FindBy(xpath = "//a[normalize-space()='MacBook']")
	private WebElement maclap;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement laptopcart;

	@FindBy(xpath = "//a[normalize-space()='MP3 Players (4)']")
	private WebElement scrdown8;

	@FindBy(xpath = "//h1[normalize-space()='MacBook']")
	private WebElement scrdown9;

	@FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
	private WebElement scrup8;

	@FindBy(xpath = "//a[normalize-space()='Components']")
	private WebElement components;

	@FindBy(xpath = "//a[normalize-space()='Monitors (2)']")
	private WebElement monitors;

	@FindBy(xpath = "//div[@class='list-group mb-3']//a[1]")
	private WebElement scrdown10;

	@FindBy(xpath = "//div[@class='description']//a[contains(text(),'Samsung SyncMaster 941BW')]")
	private WebElement samsung;

	@FindBy(xpath = "//h1[normalize-space()='Samsung SyncMaster 941BW']")
	private WebElement scrdown11;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement monitorcart;

	@FindBy(xpath = "//a[normalize-space()='Components']")
	private WebElement scrup9;

	@FindBy(xpath = "//a[@class='nav-link'][normalize-space()='Tablets']")
	private WebElement tablets;

	@FindBy(xpath = "//h2[normalize-space()='Tablets']")
	private WebElement scrdown12;

	@FindBy(xpath = "//button[@aria-label='Add to Cart']//i[@class='fas fa-shopping-cart']")
	private WebElement tabletcart;

	@FindBy(xpath = "//h2[normalize-space()='Tablets']")
	private WebElement scrup10;

	@FindBy(xpath = "//a[normalize-space()='Software']")
	private WebElement software;

	@FindBy(xpath = "//a[normalize-space()='Continue']")
	private WebElement cont;

	@FindBy(xpath = "//a[@class='nav-link'][normalize-space()='Phones & PDAs']")
	private WebElement phones;

	@FindBy(xpath = "//h2[normalize-space()='Phones & PDAs']")
	private WebElement scrdown13;

	@FindBy(xpath = "//a[normalize-space()='iPhone']")
	private WebElement iphone;

	@FindBy(xpath = "//h1[normalize-space()='iPhone']")
	private WebElement scrdown14;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement phonecart;

	@FindBy(xpath = "//a[@class='nav-link'][normalize-space()='Phones & PDAs']")
	private WebElement scrup11;

	@FindBy(xpath = "//a[normalize-space()='Cameras']")
	private WebElement camera;

	@FindBy(xpath = "//h2[normalize-space()='Cameras']")
	private WebElement scrdown15;

	@FindBy(xpath = "//a[normalize-space()='Nikon D300']")
	private WebElement Nikon;

	@FindBy(xpath = "//h1[normalize-space()='Nikon D300']")
	private WebElement scrdown16;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement camcart;

	@FindBy(xpath = "//h1[normalize-space()='Nikon D300']")
	private WebElement scrup12;

	@FindBy(xpath = "//a[normalize-space()='MP3 Players']")
	private WebElement mp3player;

	@FindBy(xpath = "//a[normalize-space()='Show All MP3 Players']")
	private WebElement showall;

	@FindBy(xpath = "//a[normalize-space()='iPod Nano']")
	private WebElement scrdown17;

	@FindBy(xpath = "//a[normalize-space()='iPod Nano']")
	private WebElement ipod;

	@FindBy(xpath = "//h1[normalize-space()='iPod Nano']")
	private WebElement scrdown18;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement mp3cart;

	@FindBy(xpath = "//a[normalize-space()='MP3 Players']")
	private WebElement scrup13;

	@FindBy(xpath = "//img[@title='Your Store']")
	private WebElement store;

	@FindBy(xpath = "//img[@title='OpenCart - Open Source Shopping Cart Solution']")
	private WebElement HomeStore;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//a[normalize-space()='Marketplace']")
	private WebElement marketplace;

	@FindBy(xpath = "//h4[normalize-space()='Category']")
	private WebElement scrdown19;

	@FindBy(xpath = "//a[normalize-space()='Marketplaces']")
	private WebElement marketcategory;

	@FindBy(xpath = "//a[normalize-space()='Marketplaces']")
	private WebElement scrdown20;

	@FindBy(xpath = "//div[@id='extension-list']//div[2]//div[2]//section[1]//div[1]//a[1]//div[1]")
	private WebElement product;

	@FindBy(xpath = "//body/div[@id='marketplace-extension-info']/div[@class='container']/div[@class='row']/div[@class='col-md-8']/div[@id='comment-box']/div[@id='comment3018362']/div[@class='media-body']/p[1]")
	private WebElement scrdown21;

	@FindBy(xpath = "//span[normalize-space()='modulepoints']")
	private WebElement scrup14;

	@FindBy(xpath = "//a[normalize-space()='View all extensions']")
	private WebElement viewall1;

	@FindBy(xpath = "//h4[normalize-space()='Category']")
	private WebElement scrdown22;

	@FindBy(xpath = "//a[normalize-space()='Themes']")
	private WebElement themecategory;

	@FindBy(xpath = "//a[normalize-space()='Themes']")
	private WebElement scrdown23;

	@FindBy(xpath = "//div[contains(text(),'Accura Ocean Multipurpose Responsive OpenCart Them')]")
	private WebElement theme;

	@FindBy(xpath = "//strong[normalize-space()='Our Services']")
	private WebElement scrdown24;

	@FindBy(xpath = "//span[normalize-space()='redleaftuts']")
	private WebElement scrup15;

	@FindBy(xpath = "//a[normalize-space()='View all extensions']")
	private WebElement viewall2;
	
	@FindBy(xpath = "//h4[normalize-space()='Category']")
	private WebElement scrdown25;
	
	@FindBy(xpath="//a[normalize-space()='Languages']")
	private WebElement languagecategory;
	
	@FindBy(xpath = "//h4[normalize-space()='Category']")
	private WebElement scrdown26;
	
	@FindBy(xpath="//a[normalize-space()='Payment Gateways']")
	private WebElement paymentgatewaycategory;
	
	@FindBy(xpath="//a[normalize-space()='Payment Gateways']")
	private WebElement scrdown27;
	
	@FindBy(xpath="//div[3]//div[1]//section[1]//div[1]//a[1]//div[1]")
	private WebElement gateway;
	
	@FindBy(xpath="//h3[contains(text(),'What customers say about Square Payments - OpenCar')]")
	private WebElement scrdown28;
	
	@FindBy(xpath="//span[normalize-space()='iSense']")
	private WebElement scrup16;
	
	@FindBy(xpath="//a[normalize-space()='View all extensions']")
	private WebElement viewall3;
	
	@FindBy(xpath = "//h4[normalize-space()='Category']")
	private WebElement scrdown29;
	
	@FindBy(xpath="//a[normalize-space()='Shipping Methods']")
	private WebElement shippingcategory;
	
	@FindBy(xpath="//a[normalize-space()='Shipping Methods']")
	private WebElement scrdown30;
	
	@FindBy(xpath="//div[3]//div[1]//section[1]//div[1]//a[1]//div[1]")
	private WebElement shipping;
	
	@FindBy(xpath="//h3[normalize-space()='What customers say about Postcode-Based Shipping']")
	private WebElement scrdown31;
	
	@FindBy(xpath="//span[normalize-space()='Clear Thinking']")
	private WebElement scrup17;
	
	@FindBy(xpath="//a[normalize-space()='View all extensions']")
	private WebElement viewall4;
	
	
	
	@FindBy(xpath = "//h4[normalize-space()='Category']")
	private WebElement scrdown32;
	
	@FindBy(xpath="//a[normalize-space()='Modules']")
	private WebElement modulecategory;
	
	@FindBy(xpath="//a[normalize-space()='Modules']")
	private WebElement scrdown33;
	
	@FindBy(xpath="//div[contains(text(),'Current Version: v2023-5-16 (release notes)')]")
	private WebElement module;
	
	@FindBy(xpath="//h3[normalize-space()='What customers say about Infinite Module Positions']")
	private WebElement scrdown34;
	
	@FindBy(xpath="//span[normalize-space()='Clear Thinking']")
	private WebElement scrup18;
	
	@FindBy(xpath="//a[normalize-space()='View all extensions']")
	private WebElement viewall5;
	

	@FindBy(xpath = "//h4[normalize-space()='Category']")
	private WebElement scrdown35;
	
	@FindBy(xpath="//a[normalize-space()='Order Totals']")
	private WebElement ordertotalcategory;
	
	@FindBy(xpath="//a[normalize-space()='Order Totals']")
	private WebElement scrdown36;
	
	@FindBy(xpath="//a[normalize-space()='Charge Anywhere']")
	private WebElement ordertotal;
	
	@FindBy(xpath="//div[@class='media-body']//div[2]//div[2]//p[1]")
	private WebElement scrdown37;
	
	@FindBy(xpath="//div[@class='media-body']//div[2]//div[2]//p[1]")
	private WebElement scrup19;
	
	@FindBy(xpath="//a[normalize-space()='View all extensions']")
	private WebElement viewall6;
	
	
	@FindBy(xpath = "//h4[normalize-space()='Category']")
	private WebElement scrdown38;
	
	@FindBy(xpath="//a[normalize-space()='Product Feeds']")
	private WebElement productfeedcategory;
	
	@FindBy(xpath="//a[normalize-space()='Order Totals']")
	private WebElement scrdown39;
	
	@FindBy(xpath="//a[normalize-space()='Google Sitemap (Advanced) for Opencart']")
	private WebElement productfeed;
	
	@FindBy(xpath="//body/div[@id='marketplace-extension-info']/div[@class='container']/div[@class='row']/div[@class='col-md-8']/div[@id='comment-box']/div[@id='comment655537']/div[@class='media-body']/p[1]")
	private WebElement scrdowm40;
	
	@FindBy(xpath="//span[normalize-space()='opencartdeveloper']")
	private WebElement scrup20;
	
	@FindBy(xpath="//a[normalize-space()='View all extensions']")
	private WebElement viewall7;
	
	
	@FindBy(xpath = "//a[normalize-space()='Order Totals']")
	private WebElement scrdown41;
	
	@FindBy(xpath="//a[normalize-space()='Reports']")
	private WebElement Reportcategory;
	
	@FindBy(xpath="//a[normalize-space()='Order Totals']")
	private WebElement scrdown42;
	
	@FindBy(xpath="//div[3]//div[1]//section[1]//div[1]//a[1]//div[1]")
	private WebElement Report;
	
	@FindBy(xpath="//span[normalize-space()='opencartdeveloper']")
	private WebElement scrdown43;
	
	@FindBy(xpath="//a[normalize-space()='View all extensions']")
	private WebElement viewall8;
	
	@FindBy(xpath = "//h4[normalize-space()='Category']")
	private WebElement scrdown44;
	
	@FindBy(xpath="//a[normalize-space()='Other']")
	private WebElement othercateegory;
	
	@FindBy(xpath="//a[normalize-space()='Other']")
	private WebElement scrdown45;

	
	@FindBy(xpath = "//a[normalize-space()='Order Totals']")
	private WebElement scrdown46;
	
	public WebElement getOthercateegory() {
		return othercateegory;
	}

	public WebElement getScrdown46() {
		return scrdown46;
	}

	public WebElement getVqmodcategory() {
		return Vqmodcategory;
	}

	public WebElement getScrdown47() {
		return scrdown47;
	}

	public WebElement getVqmod() {
		return Vqmod;
	}

	public WebElement getScrdown48() {
		return scrdown48;
	}

	public WebElement getScrup21() {
		return scrup21;
	}

	public WebElement getViewall9() {
		return viewall9;
	}

	@FindBy(xpath="//a[normalize-space()='VQMod']")
	private WebElement Vqmodcategory;
	
	@FindBy(xpath="//a[normalize-space()='VQMod']")
	private WebElement scrdown47;
	
	@FindBy(xpath="//div[contains(text(),'Our Clear Cart extension provides additional funct')]")
	private WebElement Vqmod;
	
	@FindBy(xpath="//h3[contains(text(),'What customers say about Clear Cart button")
	private WebElement scrdown48;
	
	@FindBy(xpath="//span[normalize-space()='Kirill.']")
	private WebElement scrup21;
	
	@FindBy(xpath="//a[normalize-space()='View all extensions']")
	private WebElement viewall9;
	
	@FindBy(xpath="//img[@title='OpenCart - Marketplace']")
	private WebElement backtohome;
	
	@FindBy(xpath="//a[normalize-space()='Resources']")
	private WebElement resource;
	
	@FindBy(xpath="//ul[@class='dropdown-menu']//a[normalize-space()='Showcase']")
	private WebElement showcase;
	
	@FindBy(xpath="//a[normalize-space()='All Stores']")
	private WebElement scrdown49;
	
	@FindBy(xpath="//h1[normalize-space()='OpenCart Success Stories']")
    private WebElement scrup22;	
	
	
	public WebElement getShowcase() {
		return showcase;
	}

	public WebElement getScrdown49() {
		return scrdown49;
	}

	public WebElement getScrup22() {
		return scrup22;
	}

	public WebElement getResource() {
		return resource;
	}

	public WebElement getBacktohome() {
		return backtohome;
	}

	public WebElement getScrdown44() {
		return scrdown44;
	}

	public WebElement getOrdercateegory() {
		return othercateegory;
	}

	public WebElement getScrdown45() {
		return scrdown45;
	}

	public WebElement getScrdown41() {
		return scrdown41;
	}

	public WebElement getReportcategory() {
		return Reportcategory;
	}

	public WebElement getScrdown42() {
		return scrdown42;
	}

	public WebElement getReport() {
		return Report;
	}

	public WebElement getScrdown43() {
		return scrdown43;
	}

	public WebElement getViewall8() {
		return viewall8;
	}

	public WebElement getScrdown38() {
		return scrdown38;
	}

	public WebElement getProductfeedcategory() {
		return productfeedcategory;
	}

	public WebElement getScrdown39() {
		return scrdown39;
	}

	public WebElement getProductfeed() {
		return productfeed;
	}

	public WebElement getScrdowm40() {
		return scrdowm40;
	}

	public WebElement getScrup20() {
		return scrup20;
	}

	public WebElement getViewall7() {
		return viewall7;
	}

	public WebElement getScrdown35() {
		return scrdown35;
	}

	public WebElement getOrdertotalcategory() {
		return ordertotalcategory;
	}

	public WebElement getScrdown36() {
		return scrdown36;
	}

	public WebElement getOrdertotal() {
		return ordertotal;
	}

	public WebElement getScrdown37() {
		return scrdown37;
	}

	public WebElement getScrup19() {
		return scrup19;
	}

	public WebElement getViewall6() {
		return viewall6;
	}

	public WebElement getScrdown32() {
		return scrdown32;
	}

	public WebElement getModulecategory() {
		return modulecategory;
	}

	public WebElement getScrdown33() {
		return scrdown33;
	}

	public WebElement getModule() {
		return module;
	}

	public WebElement getScrdown34() {
		return scrdown34;
	}

	public WebElement getScrup18() {
		return scrup18;
	}

	public WebElement getViewall5() {
		return viewall5;
	}

	public WebElement getScrdown29() {
		return scrdown29;
	}

	public WebElement getShippingcategory() {
		return shippingcategory;
	}

	public WebElement getScrdown30() {
		return scrdown30;
	}

	public WebElement getShipping() {
		return shipping;
	}

	public WebElement getScrdown31() {
		return scrdown31;
	}

	public WebElement getScrup17() {
		return scrup17;
	}

	public WebElement getViewall4() {
		return viewall4;
	}

	public WebElement getScrdown26() {
		return scrdown26;
	}

	public WebElement getPaymentgatewaycategory() {
		return paymentgatewaycategory;
	}

	public WebElement getScrdown27() {
		return scrdown27;
	}

	public WebElement getGateway() {
		return gateway;
	}

	public WebElement getScrdown28() {
		return scrdown28;
	}

	public WebElement getScrup16() {
		return scrup16;
	}

	public WebElement getViewall3() {
		return viewall3;
	}

	public WebElement getScrdown25() {
		return scrdown25;
	}

	public WebElement getLanguagecategory() {
		return languagecategory;
	}

	public WebElement getScrdown22() {
		return scrdown22;
	}

	public WebElement getThemecategory() {
		return themecategory;
	}

	public WebElement getScrdown23() {
		return scrdown23;
	}
	
	public WebElement getHomeStore() {
		return HomeStore;
	}

	public WebElement getStore() {
		return store;
	}
	public WebElement getTheme() {
		return theme;
	}

	public WebElement getScrdown24() {
		return scrdown24;
	}

	public WebElement getScrup15() {
		return scrup15;
	}

	public WebElement getViewall2() {
		return viewall2;
	}

	public WebElement getMarketplace() {
		return marketplace;
	}

	public WebElement getScrdown19() {
		return scrdown19;
	}

	public WebElement getMarketcategory() {
		return marketcategory;
	}

	public WebElement getScrdown20() {
		return scrdown20;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getScrdown21() {
		return scrdown21;
	}

	public WebElement getScrup14() {
		return scrup14;
	}

	public WebElement getViewall1() {
		return viewall1;
	}

	public WebElement getShowalllaps() {
		return showalllaps;
	}

	public WebElement getMp3player() {
		return mp3player;
	}

	public WebElement getShowall() {
		return showall;
	}

	public WebElement getScrdown17() {
		return scrdown17;
	}

	public WebElement getIpod() {
		return ipod;
	}

	public WebElement getScrdown18() {
		return scrdown18;
	}

	public WebElement getMp3cart() {
		return mp3cart;
	}

	public WebElement getScrup13() {
		return scrup13;
	}

	public WebElement getCamera() {
		return camera;
	}

	public WebElement getScrdown15() {
		return scrdown15;
	}

	public WebElement getNikon() {
		return Nikon;
	}

	public WebElement getScrdown16() {
		return scrdown16;
	}

	public WebElement getCamcart() {
		return camcart;
	}

	public WebElement getScrup12() {
		return scrup12;
	}

	public WebElement getPhones() {
		return phones;
	}

	public WebElement getScrdown13() {
		return scrdown13;
	}

	public WebElement getIphone() {
		return iphone;
	}

	public WebElement getScrdown14() {
		return scrdown14;
	}

	public WebElement getPhonecart() {
		return phonecart;
	}

	public WebElement getScrup11() {
		return scrup11;
	}

	public WebElement getSoftware() {
		return software;
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getTablets() {
		return tablets;
	}

	public WebElement getScrdown12() {
		return scrdown12;
	}

	public WebElement getTabletcart() {
		return tabletcart;
	}

	public WebElement getScrup10() {
		return scrup10;
	}

	public WebElement getComponents() {
		return components;
	}

	public WebElement getMonitors() {
		return monitors;
	}

	public WebElement getScrdown10() {
		return scrdown10;
	}

	public WebElement getSamsung() {
		return samsung;
	}

	public WebElement getScrdown11() {
		return scrdown11;
	}

	public WebElement getMonitorcart() {
		return monitorcart;
	}

	public WebElement getScrup9() {
		return scrup9;
	}

	public WebElement getLaptop() {
		return laptop;
	}

	public WebElement getMaclap() {
		return maclap;
	}

	public WebElement getLaptopcart() {
		return laptopcart;
	}

	public WebElement getScrdown8() {
		return scrdown8;
	}

	public WebElement getScrdown9() {
		return scrdown9;
	}

	public WebElement getScrup8() {
		return scrup8;
	}

	public WebElement getDemo() {
		return Demo;
	}

	public WebElement getStorefront() {
		return storefront;
	}

	public WebElement getDesktop() {
		return Desktop;
	}

	public WebElement getMac() {
		return mac;
	}

	public WebElement getScrdown7() {
		return scrdown7;
	}

	public WebElement getDesktopcart() {
		return Desktopcart;
	}

	public WebElement getScrup7() {
		return scrup7;
	}

	public OpencartTest_Pom(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getScrdown1() {
		return scrdown1;
	}

	public WebElement getScrup1() {
		return scrup1;
	}

	public WebElement getScrdown2() {
		return scrdown2;
	}

	public WebElement getScrup2() {
		return scrup2;
	}

	public WebElement getScrdown3() {
		return scrdown3;
	}

	public WebElement getScrup3() {
		return scrup3;
	}

	public WebElement getScrdown4() {
		return scrdown4;
	}

	public WebElement getScrup4() {
		return scrup4;
	}

	public WebElement getScrdown5() {
		return scrdown5;
	}

	public WebElement getScrup5() {
		return scrup5;
	}

	public WebElement getScrdown6() {
		return Scrdown6;
	}

	public WebElement getScrup6() {
		return scrup6;
	}

	public WebElement getFeatures() {
		return Features;
	}

	public WebElement getFirstLink() {
		return FirstLink;
	}

	public WebElement getSecondlink() {
		return Secondlink;
	}

	public WebElement getThirdlink() {
		return Thirdlink;
	}

	public WebElement getFourthlink() {
		return fourthlink;
	}

	public WebElement getFifthlink() {
		return Fifthlink;
	}

	public WebElement getSixthlink() {
		return sixthlink;
	}

}
