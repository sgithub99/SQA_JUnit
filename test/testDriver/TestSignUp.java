package testDriver;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.After;
public class TestSignUp extends TestDriver{
	
	ChromeDriver driver = getDriver();

	@Before
	public void setUp() {
		
	}


	@Test
	public void login_title_test() {
		driver.get("http://localhost:8080/BankingProjectSQA/create_account.jsp");
		String title = driver.getTitle();
		String expectedTitle = "Create new account";
		assertEquals(expectedTitle, title);
		System.out.println(title);
		driver.close();
	}
	
	@Test
	public void leaveFirstName() {
		driver.get("http://localhost:8080/BankingProjectSQA/create_account.jsp");
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("");
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Sơn");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Nam Từ Liêm");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Hà Nội");
		WebElement branchName = driver.findElement(By.id("branchName"));
		branchName.sendKeys("TP Bank");
		WebElement zip = driver.findElement(By.id("zip"));
		zip.sendKeys("100000");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("xuanson");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123");
		WebElement re_password = driver.findElement(By.id("re_password"));
		re_password.sendKeys("123");
		WebElement phone_number = driver.findElement(By.id("phone_number"));
		phone_number.sendKeys("09898312");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("xuansondoan99@gmail.com");
		WebElement account_type = driver.findElement(By.id("account_type"));
		account_type.sendKeys("Saving account");
		WebElement amount = driver.findElement(By.id("amount"));
		amount.sendKeys("9000000");
		
		WebElement btnSignUp = driver.findElement(By.id("button_sign_up"));
		btnSignUp.click();
		
		String title = driver.getTitle();
		String expectedTitle = "Create new account";
		
		driver.close();
		
		assertEquals(title, expectedTitle);
		
		
	}
	
	@Test
	public void leaveLastName() {
		driver.get("http://localhost:8080/BankingProjectSQA/create_account.jsp");
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Đoàn Xuân");
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Nam Từ Liêm");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Hà Nội");
		WebElement branchName = driver.findElement(By.id("branchName"));
		branchName.sendKeys("TP Bank");
		WebElement zip = driver.findElement(By.id("zip"));
		zip.sendKeys("100000");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("xuanson");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123");
		WebElement re_password = driver.findElement(By.id("re_password"));
		re_password.sendKeys("123");
		WebElement phone_number = driver.findElement(By.id("phone_number"));
		phone_number.sendKeys("09878412");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("xuansondoan99@gmail.com");
		WebElement account_type = driver.findElement(By.id("account_type"));
		account_type.sendKeys("Saving account");
		WebElement amount = driver.findElement(By.id("amount"));
		amount.sendKeys("10000000");
		
		WebElement btnSignUp = driver.findElement(By.id("button_sign_up"));
		btnSignUp.click();
		
		String title = driver.getTitle();
		String expectedTitle = "Create new account";
		
		driver.close();
		
		assertEquals(title, expectedTitle);
	}
	@Test
	public void leaveAddressName() {
		driver.get("http://localhost:8080/BankingProjectSQA/create_account.jsp");
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Đoàn Xuân");
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Sơn");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Hà Nội");
		WebElement branchName = driver.findElement(By.id("branchName"));
		branchName.sendKeys("TP Bank");
		WebElement zip = driver.findElement(By.id("zip"));
		zip.sendKeys("100000");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("xuanson");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123");
		WebElement re_password = driver.findElement(By.id("re_password"));
		re_password.sendKeys("123");
		WebElement phone_number = driver.findElement(By.id("phone_number"));
		phone_number.sendKeys("09878412");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("xuansondoan99@gmail.com");
		WebElement account_type = driver.findElement(By.id("account_type"));
		account_type.sendKeys("Saving account");
		WebElement amount = driver.findElement(By.id("amount"));
		amount.sendKeys("10000000");
		
		WebElement btnSignUp = driver.findElement(By.id("button_sign_up"));
		btnSignUp.click();
		
		String title = driver.getTitle();
		String expectedTitle = "Create new account";
		
		driver.close();
		
		assertEquals(title, expectedTitle);
	}
	
	@Test
	public void leaveCityName() {
		driver.get("http://localhost:8080/BankingProjectSQA/create_account.jsp");
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Đoàn Xuân");
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Sơn");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Hà Nội");
		WebElement branchName = driver.findElement(By.id("branchName"));
		branchName.sendKeys("TP Bank");
		WebElement zip = driver.findElement(By.id("zip"));
		zip.sendKeys("100000");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("xuanson");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123");
		WebElement re_password = driver.findElement(By.id("re_password"));
		re_password.sendKeys("123");
		WebElement phone_number = driver.findElement(By.id("phone_number"));
		phone_number.sendKeys("09878412");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("xuansondoan99@gmail.com");
		WebElement account_type = driver.findElement(By.id("account_type"));
		account_type.sendKeys("Saving account");
		WebElement amount = driver.findElement(By.id("amount"));
		amount.sendKeys("10000000");
		
		WebElement btnSignUp = driver.findElement(By.id("button_sign_up"));
		btnSignUp.click();
		
		String title = driver.getTitle();
		String expectedTitle = "Create new account";
		
		driver.close();
		
		assertEquals(title, expectedTitle);
	}
	@Test
	public void leaveBranchName() {
		driver.get("http://localhost:8080/BankingProjectSQA/create_account.jsp");
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Đoàn Xuân");
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Sơn");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Nam Từ Liêm");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("");
		WebElement branchName = driver.findElement(By.id("branchName"));
		branchName.sendKeys("");
		WebElement zip = driver.findElement(By.id("zip"));
		zip.sendKeys("");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("");
		WebElement re_password = driver.findElement(By.id("re_password"));
		re_password.sendKeys("");
		WebElement phone_number = driver.findElement(By.id("phone_number"));
		phone_number.sendKeys("");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("");
		WebElement account_type = driver.findElement(By.id("account_type"));
		account_type.sendKeys("");
		WebElement amount = driver.findElement(By.id("amount"));
		amount.sendKeys("");
		
		WebElement btnSignUp = driver.findElement(By.id("button_sign_up"));
		btnSignUp.click();
		
		String title = driver.getTitle();
		String expectedTitle = "Create new account";
		
		driver.close();
		
		assertEquals(title, expectedTitle);
		
		
	}
	
	@Test 
	public void checkRePasswordNotEqualPassword() {
		driver.get("http://localhost:8080/BankingProjectSQA/create_account.jsp");
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Đoàn Xuân");
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Sơn");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Nam Từ Liêm");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("");
		WebElement branchName = driver.findElement(By.id("branchName"));
		branchName.sendKeys("");
		WebElement zip = driver.findElement(By.id("zip"));
		zip.sendKeys("");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("son123");
		WebElement re_password = driver.findElement(By.id("re_password"));
		re_password.sendKeys("son");
		WebElement phone_number = driver.findElement(By.id("phone_number"));
		phone_number.sendKeys("");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("");
		WebElement account_type = driver.findElement(By.id("account_type"));
		account_type.sendKeys("");
		WebElement amount = driver.findElement(By.id("amount"));
		amount.sendKeys("");
		
		WebElement btnSignUp = driver.findElement(By.id("button_sign_up"));
		btnSignUp.click();
		
		String title = driver.getTitle();
		String expectedTitle = "Create new account";
		
		driver.close();
		
		assertEquals(title, expectedTitle);
	}
	
	public void checkRePasswordEqualPassword() {
		driver.get("http://localhost:8080/BankingProjectSQA/create_account.jsp");
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Đoàn Xuân");
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Sơn");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Nam Từ Liêm");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("");
		WebElement branchName = driver.findElement(By.id("branchName"));
		branchName.sendKeys("");
		WebElement zip = driver.findElement(By.id("zip"));
		zip.sendKeys("");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("");
		WebElement re_password = driver.findElement(By.id("re_password"));
		re_password.sendKeys("");
		WebElement phone_number = driver.findElement(By.id("phone_number"));
		phone_number.sendKeys("");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("");
		WebElement account_type = driver.findElement(By.id("account_type"));
		account_type.sendKeys("");
		WebElement amount = driver.findElement(By.id("amount"));
		amount.sendKeys("");
		
		WebElement btnSignUp = driver.findElement(By.id("button_sign_up"));
		btnSignUp.click();
		
		String title = driver.getTitle();
		String expectedTitle = "Create new account";
		
		driver.close();
		
		assertEquals(title, expectedTitle);
	}
	
	
	@After
	public void close() {
		
	}

}
