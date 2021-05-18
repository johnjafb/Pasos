package com.choucairtestinguno;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.JavascriptExecutor;

public class GoogleSearchTest {
	
	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	@Test
	public void testGooglePage() {
		
	    WebElement searchBox = driver.findElement(By.name("q"));
		
	    searchBox.clear();
		
	    searchBox.sendKeys("ttp://automationpractice.com/index.php");
		
	    searchBox.submit();
		
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	    assertEquals("ttp://automationpractice.com/index.php - Buscar con Google",driver.getTitle());
	
	}
	
	@After
	public void tearDown() {
		//driver.quit();
	
	}	
}
