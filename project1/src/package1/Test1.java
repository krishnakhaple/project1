package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 
{

	public Test1() 
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
	
	//	System.setProperty("webdriver.chrome.driver" , "./Driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Kkhap\\eclipse-workspace\\maven3\\geckodriver.exe");
	 //	WebDriver d=new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver" , "C:\\Users\\Kkhap\\eclipse-workspace\\maven3\\msedgedriver.exe");
		
		WebDriver d=new EdgeDriver();
        d.get("https://www.indiamart.com/"); 
		
		
	}

}

