package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test6
{

	public Test6() 
	{
		
	}

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.flipkart.com/");
         String ele=driver.getTitle();
         System.out.println(ele);
	}

}
