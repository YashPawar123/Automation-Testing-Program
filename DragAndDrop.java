import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
         ChromeDriver driver =new ChromeDriver();
      //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.manage().window().maximize();
         driver.get("https://grotechminds.com/drag-and-drop/");
         WebElement drag=driver.findElement(By.id("drag8"));
         WebElement drop=driver.findElement(By.id("div2"));
         Actions a1=new Actions(driver);
         a1.dragAndDrop(drag, drop).perform();
         Thread.sleep(2000);
     
         
         Actions a2 =new Actions(driver);
         WebElement drop2=driver.findElement(By.id("div1"));
         a2.dragAndDrop(drop, drop2).perform();
         Thread.sleep(2000);
         driver.quit();
       
}
}
