package popupprogram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4 {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovoo\\Desktop\\allfolders\\sele2\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.demo.guru99.com/V4/");
	
	driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("1234");
	
	driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
	
	Alert alt = driver.switchTo().alert();
	
	String text = alt.getText();
	System.out.println(text);
		
	//alt.accept();
	
	//alt.dismiss();
}	
}

//cancel button and ok button and get text//