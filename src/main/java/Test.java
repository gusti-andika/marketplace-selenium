import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test {

	public static void main(String[] args) throws Exception {
	     WebDriver driver = new RemoteWebDriver(
	                new URL("http://localhost:4444"),
	                DesiredCapabilities.chrome());
	     
	     driver.get("http://www.google.com");

	}
}
