package iframe1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovoo\\Desktop\\sele2\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	
	//driver.switchTo().frame("iframeResult");//string frame name//
	//driver.switchTo().frame("iframeResult");
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"iframeResult\"]")));//iframe//
	
	driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	
	
}
}
