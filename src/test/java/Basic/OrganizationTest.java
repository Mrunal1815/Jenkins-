package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrganizationTest {

	@Test
	private void createOrganizationsTest() {

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://localhost:8888/");
	}
}
