import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Partial_link_prog {

	public static void main(String[] args) {
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement bestsellerlink=	driver.findElement(By.partialLinkText("Sellers"));
		bestsellerlink.click();
	}

}
