package cucumber.Testdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage_Steps {
	WebDriver driver;

	@Given("user navigate to the application URL")
	public void user_navigate_to_the_application_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("User enter the valid credentials {string} and {string}")
	public void user_enter_the_valid_credentials_and(String uName, String pwd) {
		driver.findElement(By.id("user-name")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
	}

	@Then("user should able to login")
	public void user_should_able_to_login() {
		// Write code here that turns the phrase above into concrete actions
		boolean actual = driver.getCurrentUrl().contains("/inventory.html");
		Assert.assertTrue(actual);
	}

}
