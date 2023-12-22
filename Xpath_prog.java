import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_prog {

	public static void main(String[] args) {
           ChromeDriver driver =new ChromeDriver();
           driver.get("file:///C:/Users/yash/Downloads/learningHTML1.html");
           driver.switchto().alert().accept();
           driver.manage().window().maximize();
           WebElement name =driver.findElement(By.xpath("(//input)[1]"));
           name.sendKeys("Yash#123");
           name.click();
           
           WebElement name2 =driver.findElement(By.xpath("(//input)[2]"));
           name2.sendKeys("GroTechMind");
           name2.click();
           
           WebElement psw =driver.findElement(By.xpath("(//input)[3]"));
           psw.sendKeys("Yash@123");
           psw.click();
           

           WebElement firstname =driver.findElement(By.xpath("(/html/body/form)/input[1]"));
           firstname.sendKeys("Yash");
            firstname.click();
           
           WebElement lastname =driver.findElement(By.xpath("(/html/body/form[1])/input[2]"));
           lastname.sendKeys("Pawar");
           lastname.click();
           
           
           WebElement button = driver.findElement(By.xpath("(/html/body/input)[4]"));
           button.click();
           
	}

}
