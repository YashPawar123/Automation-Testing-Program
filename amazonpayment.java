import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazonpayment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.amazon.in");;
        driver.manage().window().maximize();
        WebElement sf =driver.findElement(By.id("twotabsearchtextbox"));
        sf.sendKeys("Shoe");
        sf.sendKeys(Keys.ENTER);
//        List<WebElement> fe= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
//       int size= fe.size();
//       System.out.println(size);
//       fe.get(0).click();
      WebElement fp= driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
        fp.click();
       
       Set<String> pc =driver.getWindowHandles();
       Iterator<String> pc1=pc.iterator();
       String id=pc1.next();
       System.out.println(id);
       String id2=pc1.next();
       System.out.println(id2);
       driver.switchTo().window(id2);
       WebElement buy =driver.findElement(By.xpath("//input[@id='buy-now-button']"))    ;
       buy.click();
       WebElement email=driver.findElement(By.name("email"));
       email.sendKeys("ABC@gmail.com");
       WebElement conti=driver.findElement(By.id("continue"));
       conti.click();
     //  Thread.sleep(5000);
       
       WebElement pass=driver.findElement(By.name("password"));
       pass.sendKeys("password@1234");
       WebElement signin=driver.findElement(By.id("signInSubmit"));
       signin.click(); 
	}

}
