package testDriver;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author admin
 */
public class TestLogin extends TestDriver {

	ChromeDriver driver = getDriver();

	@Before
	public void setUp() {
		
	}
	
	@Test
	public void login_title_test() {
		driver.get("http://localhost:8080/BankingProjectSQA");
		String title = driver.getTitle();
		String expectedTitle = "Green Bank";
		assertEquals(expectedTitle, title);
		System.out.println(title);
		driver.close();
	}
	
	@Test 
	public void loginFail1() {
		driver.get("http://localhost:8080/BankingProjectSQA");
		
		WebElement loginButton = driver.findElementById("loginHome");
		loginButton.click();
		
		WebElement usernameEditText = driver.findElement(By.id("account_no"));
		WebElement passwordEditText = driver.findElement(By.id("password"));
		
		usernameEditText.sendKeys("son");
		passwordEditText.sendKeys("123");
		
		WebElement signInBtn = driver.findElement(By.id("sign_in_button"));
		signInBtn.click();
		
		String title = driver.getTitle();
		String expectedTitle = "Sign In";
		
		driver.close();
		
		assertEquals(title, expectedTitle);
	}
	
	@Test 
	public void loginSuccessful() {
		driver.get("http://localhost:8080/BankingProjectSQA");
		
		WebElement loginButton = driver.findElementById("loginHome");
		loginButton.click();
		
		WebElement usernameEditText = driver.findElement(By.id("account_no"));
		WebElement passwordEditText = driver.findElement(By.id("password"));
		
		usernameEditText.sendKeys("xuanson");
		passwordEditText.sendKeys("123");
		
		WebElement signInBtn = driver.findElement(By.id("sign_in_button"));
		signInBtn.click();
		
		String title = driver.getTitle();
		String expectedTitle = "Green Bank";
		
		driver.close();
		
		assertEquals(title, expectedTitle);
	}
	
	@After
	public void close() {
		
	}
	
}
