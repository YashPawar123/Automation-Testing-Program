import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cross_button {

	public static void main(String[] args) throws InterruptedException {
         ChromeDriver driver =new ChromeDriver();
         driver.get("https://Flipkart.com");
         driver.manage().window().maximize();
         WebElement cross=driver.findElement(By.xpath("//span[@class='_30XB9F']"));
         Thread.sleep(3000);
         cross.click();
         WebElement Hoverover =driver.findElement(By.xpath("//a[.='Beauty & Personal Care']"));
         Actions a1= new Actions(driver);
         
	}

}
