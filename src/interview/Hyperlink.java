package interview;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.navigate().to("http://www.leafground.com/");
	driver.findElement(By.xpath("//*[@class='wp-categories-icon svg-image']/following::img[2]")).click();
	
	driver.findElement(By.linkText("Go to Home Page")).click();
	driver.navigate().back();
	WebElement find=driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
	System.out.println(find.getAttribute("href"));
	WebElement url=driver.findElement(By.linkText("Verify am I broken?"));
	
	
	Thread.sleep(3000);
	driver.quit();
	}

}
