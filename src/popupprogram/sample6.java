package popupprogram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample6 {

public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovoo\\Desktop\\sele2\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
	driver.get("https://www.collegesearch.in/college-login.php");
	
	driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("acnnmmm");
	
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("lmmana");
	
	driver.findElement(By.xpath("//div[@class=\"text-center\"]")).click();
	
	Alert alt = driver.switchTo().alert();
	

}
			
}
