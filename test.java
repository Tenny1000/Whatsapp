package excel;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class test {
	
	{
		
	
		
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\new__\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver wd = new ChromeDriver();
	wd.get("http://13.126.129.219/EServer5/recruitment@dbthread_Recruitment@Recruitment/mobile");
	wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement a1= wd.findElement(By.xpath("//*[@id=\"txtUser\"]"));
	a1.sendKeys("super");
	WebElement a2 = wd.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
	a2.sendKeys("super123");
	WebElement a3= wd.findElement(By.id("btnLogin"));
	a3.click();
	
	//
	 WebElement element = wd.findElement(By.id("header-show-sidenav"));

     // Click on the <a> element
     element.click();
   

	
	WebElement bb = wd.findElement(By.xpath("//*[@id=\"level2_23\"]/a/span[1]"));
	bb.click();
	WebElement cc = wd.findElement(By.xpath("//*[@id=\"level2_21\"]/a/span"));
	cc.click();
	WebElement dd = wd.findElement(By.xpath("//*[@id=\"btn_candidateimport\"]/div"));
	dd.click();
	
	
	

}
}