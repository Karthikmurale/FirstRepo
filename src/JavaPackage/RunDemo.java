package JavaPackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://Users//User//Desktop//Chrome Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		Dimension dim = new Dimension(500,700);
		driver.manage().window().fullscreen();
		
		//driver.manage().window().setSize(1400);


}
	}