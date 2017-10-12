package talentify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[] args) throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://talentify.in/index.jsp");
	    driver.findElement(By.xpath( "//div[@id='navbar-collapse-1']/ul/li[7]/a")).click();
	   Thread.sleep(2000);
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("swethakrish60@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("swetha11");
	    
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Welcome\n						   swetha krish')]")).click();
	    driver.findElement(By.linkText("Logout")).click();
		
	}
	}