package interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.navigate().to("http://www.leafground.com/");
		driver.findElement(By.xpath("//*[@class='wp-categories-icon svg-image']/following::img[1]")).click();
		driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.navigate().back();
		WebElement button=driver.findElement(By.id("position"));
		Point point=button.getLocation();
		int x=point.getX();
		System.out.println("X points : "+x);
		int y=point.getY();
		System.out.println("Y points : "+y);
		WebElement color=driver.findElement(By.id("color"));
		System.out.println(color.getCssValue("color"));
		WebElement size=driver.findElement(By.id("size"));
		System.out.println(size.getCssValue("font-size"));
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
