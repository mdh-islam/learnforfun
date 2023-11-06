package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleDropDown {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.click();
		searchBox.sendKeys("even number");
		Thread.sleep(3000);
	List <WebElement> ele =	driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//descendant::div[@class='wM6W7d']"));
		
	for(int i=0;i<ele.size();i++) {
		if(ele.get(i).getText().contains("even numbers 1 to 100")) {
		Thread.sleep(5000);
			ele.get(i).click();
		}
	}
			
		}
			


	}


