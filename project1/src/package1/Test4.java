package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 
{

	public Test4() 
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException 
	{
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	 //   driver.get("https://www.indiamart.com/");
	    driver.get("https://www.flipkart.com/");
	    driver.get("https://www.vtiger.com/");
		   driver.navigate().back();
		   Thread.sleep(2000);
		   driver.navigate().forward();
		   Thread.sleep(2000);
		   driver.navigate().refresh();

	}

}
