package popupprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {

	//implicit wait//
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovoo\\Desktop\\sele2\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("ashu");
	}
}
