package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newww {
	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovoo\\Desktop\\sele2\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			
			driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("samsung");
		
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}	
}
