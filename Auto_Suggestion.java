//import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Auto_Suggestion {

	public static void main(String[] args) throws InterruptedException {
		//For the Amzon.in 
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
       boolean s1= search.isDisplayed();
       System.out.println(s1);
       boolean s2=search.isEnabled();
       System.out.println(s2);
       boolean s3=search.isSelected();
       System.out.println(s3);
        search.sendKeys("Shoes");
        Thread.sleep(3000);
        List<WebElement> Autosuggestion=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
        System.out.println(Autosuggestion.size());
        Autosuggestion.get(5).click();
		
//		//for typing in google search textfeild
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.google.in");
//		driver.manage().window().maximize();
//		WebElement st =driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
//		st.sendKeys("India");
//		Thread.sleep(3000);
//		List<WebElement> d1=driver.findElements(By.xpath("//div[@class='erkvQe']/div/ul/li"));
//		System.out.println(d1.size());
//		d1.get(9).click();
	}

}
