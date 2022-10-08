package TestNg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

;


public class AutomateWebApp {
	
	String driverPath="E:\\chromedriver.exe";
	public WebDriver wd;
	
	@Test(priority = 1)
	  public void register() {
		
	      System.setProperty("webdriver.chrome.driver", 
	    		  "E:\\\\chromedriver.exe");
		  
		  wd = new ChromeDriver();
	      wd.manage().window().maximize();
	      wd.get("https://www.amazon.in/");
	      wd.findElement(By.id("nav-link-accountList")).click();
	      wd.findElement(By.id("createAccountSubmit")).click();
	      wd.findElement(By.id("ap_customer_name")).sendKeys("Naveena");
	      wd.findElement(By.id("ap_phone_number")).sendKeys("9445207847");
	      wd.findElement(By.id("ap_email")).sendKeys("kampallinaveena2@gmail.com");
	      wd.findElement(By.id("ap_password")).sendKeys("Kukkapilla@143");
	     wd.findElement(By.id("continue")).click();

	     
	  }
	@Test(priority = 2)
	  public void login() {
		  
	     System.setProperty("webdriver.chrome.driver", 
	    		 "E:\\\\chromedriver.exe");
		  
		  wd = new ChromeDriver();
	      wd.manage().window().maximize();
	      wd.get("https://www.amazon.in/");
	      wd.findElement(By.id("nav-link-accountList")).click();
	      wd.findElement(By.id("ap_email")).sendKeys("kampallinaveena2@gmail.com");
		  wd.findElement(By.id("continue")).click();
	      wd.findElement(By.id("ap_password")).sendKeys("Kukkapilla@143");


	  }
	  @Test(priority = 3)
	  public void search() throws InterruptedException {
		  	
		  	System.setProperty("webdriver.chrome.driver", 
		  			"E:\\\\chromedriver.exe");
			  
			  wd = new ChromeDriver();
	      	wd.get("https://www.amazon.in/");
		    System.out.println(wd.getTitle());
		    System.out.println(wd.getCurrentUrl());
		    wd.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus nord ce 2 5g");
		    Thread.sleep(5000);
		    wd.findElement(By.id("nav-search-submit-button")).submit();
		   wd.findElement(By.linkText("OnePlus Nord CE 2 5G (Bahamas Blue, 8GB RAM, 128GB Storage)")).click();
	      
	  }
}
