package JavaTest;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login {
	private WebDriver driver;
	  private String baseUrl;
	  //common method for logging in
	   @Test 
		public void Byotlogin(){
			 System.setProperty("webdriver.chrome.driver","E://musthafa 2//Automated testing//Driver1//chromedriver.exe");
			  
			    driver = new ChromeDriver();
			    baseUrl = "https://akt-on.com/";
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driver.get(baseUrl + "/byot/Account/Login");
			    driver.findElement(By.xpath("/html/body/div[1]/div[2]/button[1]")).click();
			    driver.findElement(By.id("LoginPage_Email")).clear();
			    driver.findElement(By.id("LoginPage_Email")).sendKeys("designermus@aktrea.com");
			    driver.findElement(By.id("LoginPage_Password")).clear();
			    driver.findElement(By.id("LoginPage_Password")).sendKeys("test123");
			    driver.findElement(By.id("submit_login")).click();
			    driver.close();
			    try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	   }
}
	
