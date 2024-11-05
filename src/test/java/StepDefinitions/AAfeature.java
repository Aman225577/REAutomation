package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AAfeature {
	WebDriver driver = new EdgeDriver();
	@Given("browser is opened")
	public void browser_is_opened() {
		System.out.println("Inside-step browser is open");  
		driver.manage().window().maximize();

	}

	@Given("user navigates to RE application url")
	public void user_navigates_to_re_application_url()throws InterruptedException {
		System.out.println("Inside-step user navigates to RE application"); 
		Thread.sleep(2000);
		driver.get("https://re.qa.accenture.com/#/home");


	}

	@When("searches for AA component")
	public void searches_for_aa_component() {
		System.out.println("Inside-step searches for AA component");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//span[contains(@class,'uil-dl-icon-Chevron-right')])[8]")).click();

	}
	

	@Then("User lands to segment screen")
	public void user_lands_to_segment_screen() throws InterruptedException{
		System.out.println("Inside-step User lands to segment screen");
		Thread.sleep(1000);


	}

	@Then("after navigates to audience screen")
	public void after_navigates_to_audience_screen()  {

		System.out.println("Inside-step after navigates to audience screen");
		
	
	

		driver.quit();
		
		
	}

}
