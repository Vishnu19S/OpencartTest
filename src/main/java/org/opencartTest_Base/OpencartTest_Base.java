package org.opencartTest_Base;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OpencartTest_Base {
	public static WebDriver driver;
	public static void url(WebDriver driver, String s) {
		driver.get(s);
	}
	public static void maxi(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public static void features(WebElement web) {
		web.click();
	}
	public static void snapshot(WebDriver driver,String picname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Dell\\eclipse-workspace\\OpencartTest\\Screenshots"+ picname +".png");
		FileUtils.copyFile(source, destination);
	}
	public static void scrolldown(WebDriver driver, WebElement web) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", web);
	}
	
	public static void click(WebElement ele) {
		ele.click();
	}
	
	public static void scrollup(WebDriver driver,WebElement web) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)",web);
	}
	public static void toHold( WebDriver driver,int seconds){
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(seconds));
		}

	 
	
	 public void windowhandle(WebDriver driver,String windowTitle) {
	        for (String windowHandle : driver.getWindowHandles()) {
	            driver.switchTo().window(windowHandle);
	            if (driver.getTitle().equals(windowTitle)) {
	                break;
	            }
	        }
	    }
	 
	 public void windowhandleparent(WebDriver driver ) {
		 Set<String> opcw = driver.getWindowHandles();
		 Iterator<String> itera = opcw.iterator();
		 String parent = itera.next();
		 String child = itera.next();
		 driver.switchTo().window(parent);
		
	 }


}
	
	
	

