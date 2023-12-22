import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JSpopuphandling {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/yash/Downloads/learningHTML1.html");
        driver.switchTo().alert().accept();
        WebElement drop=driver.findElement(By.xpath("//select[@id='Relegion']"));
        Select s1 =new Select(drop);
        s1.selectByIndex(1);
        drop.sendKeys(Keys.ENTER);
        
	}

}
