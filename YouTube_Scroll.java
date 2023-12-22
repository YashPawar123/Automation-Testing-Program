import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube_Scroll {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.youtube.com/");
         JavascriptExecutor jse=(JavascriptExecutor) driver;
         for(int i=0;i<5;i++) {
         Thread.sleep(5000);
         jse.executeScript("window.scrollBy(0,500)");
         
	}

}
}
