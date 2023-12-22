import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoordinateProgExam {

	public static void main(String[] args) {
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.in");
        WebElement canada=driver.findElement(By.linkText("Canada"));
        org.openqa.selenium.Point coordinate = canada.getLocation();
        int x =coordinate.getX();
        System.out.println(x);
        int y=coordinate.getY();
        System.out.println(y);

	}

}
