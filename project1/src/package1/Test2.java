package package1;



import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public Test2() 
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         ChromeDriver driver=new ChromeDriver();
        // driver.manage().window().fullscreen();
        // driver.manage().window().minimize();
        // driver.manage().window().maximize();
//        Dimension d=new Dimension(200,300);
//        driver.manage().window().setSize(d);
         
       
         // Dimension pune = driver.manage().window().getSize();
       //  System.out.println(pune);
//          System.out.println(pune.getWidth());
//          System.out.println(pune.getHeight());
         
//        Point pune2 = driver.manage().window().getPosition();
//        System.out.println(pune2);
//        System.out.println(pune2.getX());
//        System.out.println(pune2.getY());
         
        Point p=new Point(100,200);
        driver.manage().window().setPosition(p);
        driver.get("https://www.facebook.com/");
         
        
	}

}
