package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 
{

	public Test5() 
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.navigate().to("https://digisales.licindia.in/eSales/liconline/setprop?plan=852");
	}

}
