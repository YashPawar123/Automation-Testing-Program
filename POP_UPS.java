import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POP_UPS {

	public static void main(String[] args) {
       ChromeDriver driver =new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://www.amazon.in");
       //driver.switchTo().alert().accept();
       driver.manage().window().maximize();
       WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
       search.sendKeys("Shoes");
       List<WebElement> firstEle=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div"));
      // search.sendKeys(Keys.ENTER);
       System.out.println(firstEle.size());
       firstEle.get(0).click();
       
       WebElement shoes=driver.findElement(By.xpath("//img[@class='s-image']"));
       shoes.click();
       String parentid=driver.getWindowHandle();
       System.out.println(parentid);
       Set<String> parentandchild=driver.getWindowHandles();
       System.out.println(parentandchild);
       Iterator<String> pc=parentandchild.iterator();
       
       String id1=pc.next();
       System.out.println(id1);
      String id2= pc.next();
       System.out.println(id2);
       
       driver.close();
       driver.switchTo().window(id2);

	}

}
