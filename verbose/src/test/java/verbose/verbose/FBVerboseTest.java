package verbose.verbose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FBVerboseTest 
{
WebDriver driver;
@BeforeMethod
public void setUp()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramakrishna\\Desktop\\chromedriver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Test(priority = 1)
public void FBTitleTest1()
{
	String title=driver.getTitle();
	System.out.println("title of the page is"+title);
	Assert.assertEquals(title, "Facebook – log in or sign up");
}
@Test(priority = 2)
public void FBTitleTest2()
{
	String title=driver.getTitle();
	System.out.println("title of the page is"+title);
	Assert.assertEquals(title, "Facebook – log in or sign up");
}
@Test(priority = 3)
public void FBTitleTest3()
{
	String title=driver.getTitle();
	System.out.println("title of the page is"+title);
	Assert.assertEquals(title, "Facebook – log in or sign up");
}
@AfterMethod
public void tearDown()
{
	driver.quit();
}
}
