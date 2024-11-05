package StepDefinitions;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.context.Context;

public class IDRfeature {



	WebDriver driver = new EdgeDriver();
	@Given("browser is open")
	public void browser_is_open() {
		System.out.print("Inside-step browser is open");  
		driver.manage().window().maximize();
	}

	@Given("user navigates to RE application")
	public void user_navigates_to_re_application() {
		System.out.print("Inside-step user navigates to RE application"); 
		driver.get("https://re.qa.accenture.com/#/home");

	}

	@When("searches for IDR section")
	public void searches_for_idr_section() {
		System.out.print("Inside-step searches for IDR section");  
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}

	@When("clicks on IDR")
	public void clicks_on_idr()throws InterruptedException {
		{
	
		System.out.print("Inside-step clicks on IDR"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home-page/mat-drawer-container/mat-drawer-content/div/div[2]/div[1]/div/a/span[2]")).click();

		}
	}


	@Then("data is visible for BO page")
	public void data_is_visible_for_bo_page() throws InterruptedException {

		System.out.print("Inside-step data is visible for BO page"); 

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@src='https://re.qa.accenture.com/cmp-ui-idr-ui']")));
		Thread.sleep(2000);
		String s = driver.findElement(By.xpath("//div[@class='subheadlineText'][contains(.,'Total records processed: ')]")).getText();
		System.out.println("   ");
		System.out.println("Accenture Beauty=");
		System.out.println(s);
        Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='caret ng-star-inserted'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(@id,'ACN Fresh')]")).click();
		String s2 = driver.findElement(By.xpath("//div[@class='subheadlineText'][contains(.,'Total records processed: ')]")).getText();
		System.out.print("ACN Fresh=");
		System.out.println(s2);
		Thread.sleep(1000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,550)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(), '1P ATTRIBUTES')]")).click(); 
		Thread.sleep(2000);
		

		

	}

	@Then("clicks on identities overview page")
	public void clicks_on_identities_overview_page() throws InterruptedException {

		
		System.out.print("Inside-step clicks on identities overview page");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-600)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Identities Overview')]")));
		driver.findElement(By.xpath("//a[contains(text(), 'Identities Overview')]")).click();
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,500)");

		driver.findElement(By.xpath("//input[@placeholder='Enter email or phone number']")).sendKeys("jasmin.breitenberg@kuhlman.io");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='inputbuttonStyle']")).click();
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(3000);
		
		driver.quit();

	}

}

