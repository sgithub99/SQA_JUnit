package testDriver;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author admin
 */
public class TestDriver {
	private String driverUrl = "D:\\chromedriver_win32 (1)\\chromedriver.exe";

	public TestDriver() {

	}

	public ChromeDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", driverUrl);
		return new ChromeDriver();
	}
}