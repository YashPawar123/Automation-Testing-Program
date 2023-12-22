import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {

	public static void main(String[] args) {
           ChromeDriver driver =new ChromeDriver();
           //driver.get("https://www.google.com");
           driver.get("https://Facebook.com");
           WebElement un =driver.findElement(By.id("email"));
           un.sendKeys("Yash123@gmail.com");
           WebElement pwd =driver.findElement(By.id("pass"));
           pwd.sendKeys("123456");
           WebElement login =driver.findElement(By.name("login"));
           login.click();
	}

}
