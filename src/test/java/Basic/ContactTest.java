package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactTest {

	@Test
	public void createContactTest() {
		WebDriver d = new ChromeDriver();
		d.get("http://localhost:8888/");
	}
}
