package popupprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovoo\\Desktop\\sele2\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
	driver.get("https://www.flipkart.com/");
			
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("xyzxzx");
			
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("uysc");
			
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			
}
}
