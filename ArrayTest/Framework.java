
package ArrayTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Framework {
	public static WebDriver driver;
	public static void Browser(String browser) {
			if (browser == "Chrome") {
				driver = new ChromeDriver();}
			else if (browser == "Firefox") {
				driver = new FirefoxDriver();
			} else if (browser == "IE") {
				driver = new InternetExplorerDriver();
				} else if (browser == "Edge") {
				driver = new EdgeDriver();}
			}
	
	public static void Wait(String Locator) {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator)));
			}
	
	public static void WaitPOE(String Locator){
		WebDriverWait wait1 = new WebDriverWait(driver, 1000);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Locator))); 
		}
	
	public static void Link(String Url) {
			driver.get(Url);
			}
	
	public static void Maximize() {
			driver.manage().window().maximize();
			}
	
	public static void Logincrediential(String LoginID, String Password) throws Exception {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/button[1]")).click();
			driver.findElement(By.id("LoginPage_Email")).sendKeys(LoginID);
			driver.findElement(By.id("LoginPage_Password")).sendKeys(Password);
			driver.findElement(By.id("submit_login")).click();
			Thread.sleep(3000);
			}
	
	public static void Typein(String Locator, String Value) {
			String[] value = Locator.split("!");
			if (value[0].equals("css")) {
				driver.findElement(By.cssSelector(value[1])).sendKeys(Value);
			} else if (value[0].equals("id")) {
				driver.findElement(By.id(value[1])).sendKeys(Value);
			} else if (value[0].equals("name")) {
				driver.findElement(By.name(value[1])).sendKeys(Value);
			} else if (value[0].equals("xpath")) {
				driver.findElement(By.xpath(value[1])).sendKeys(Value);
			} else if (value[0].equals("class")) {
				driver.findElement(By.className(value[1])).sendKeys(Value);
			}}
	
	public static void Close() {
			driver.close();
			}
	
	public static void Clickon(String Locator1) {
			String[] value = Locator1.split("!");
			if (value[0].equals("css")) {
				driver.findElement(By.cssSelector(value[1])).click();
			} else if (value[0].equals("id")) {
				driver.findElement(By.id(value[1])).click();
			} else if (value[0].equals("name")) {
				driver.findElement(By.name(value[1])).click();
			} else if (value[0].equals("xpath")) {
				driver.findElement(By.xpath(value[1])).click();
			} else if (value[0].equals("class")) {
				driver.findElement(By.className(value[1])).click();
			}}
	
	public static void Clear(String Locator) {
			String[] value = Locator.split("!");
			if (value[0].equals("css")) {
				driver.findElement(By.cssSelector(value[1])).clear();
			} else if (value[0].equals("id")) {
				driver.findElement(By.id(value[1])).clear();
			} else if (value[0].equals("name")) {
				driver.findElement(By.name(value[1])).clear();
			} else if (value[0].equals("xpath")) {
				driver.findElement(By.xpath(value[1])).clear();
			} else if (value[0].equals("class")) {
				driver.findElement(By.className(value[1])).clear();
			}}
	
	public static void Elementvisiblescroll(String Locator) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element = driver.findElement(By.xpath(Locator));
			js.executeScript("arguments[0].scrollIntoView(true);", Element);
			}
	
	public static void Draganddrop(String Locator1, String Locator2) throws Exception {
			Actions xy = new Actions(driver);
			Thread.sleep(2000);
			Elementvisiblescroll(Locator1);
			WebElement x = driver.findElement(By.xpath(Locator1));
			Thread.sleep(3000);
			Elementvisiblescroll(Locator2);
			WebElement y = driver.findElement(By.xpath(Locator2));
			Thread.sleep(2000);
			xy.dragAndDrop(x, y).build().perform();
			}
}
