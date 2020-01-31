package ArrayTest;

import java.util.HashSet;

public class EnhacedForLoop extends Framework{

	public static void main(String[] args) throws Exception {
		Browser("Chrome");
		driver.manage().window().maximize();
		Link("https://www.naukri.com/");
		Thread.sleep(2000);
		Clickon("xpath,//*[@title='Search Jobs']//*[@class='mTxt']");
		Clickon("xpath,//*[@title='Search Recruiters']//*[@class='mTxt']");
		Clickon("xpath,//*[@title='Jobs Posted By Top Companies']//*[@class='mTxt']");
		Clickon("xpath,//*[@class='topIcon jobs Insights']//following :: div[1]");

		HashSet<String> x=new HashSet<String>();
		x.addAll(driver.getWindowHandles());
		for (String a:x)
		{
		driver.switchTo().window(a);
		System.out.println("enter");
		if(driver.getTitle().contains("HR Manager"))
		{
		/*
		* if(driver.findElement(By.xpath("//*[@id='geoLocPopUp']")).isDisplayed()) {
		* Clickon("xpath,//*[@id='geoLocPopUp']//following :: span[1]"); }
		*/
		Thread.sleep(2000);
		Clickon("xpath,//*[@class='topIcon jobs Login']//following :: div[1]");
		Typein("xpath,//*[@id='eLogin']","test123");
		//Clickon("xpath,//*[@id='geoLocPopUp']//following :: span[1]");
		//Clickon("xpath,//*[contains(text(),'Later')]");
		System.out.println("sucess");
		break;

}
}
	}
}