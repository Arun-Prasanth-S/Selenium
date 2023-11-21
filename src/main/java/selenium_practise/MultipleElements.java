package selenium_practise;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {


	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/elements");
		driver.findElement(By.name("username")).sendKeys("ortonikc", 
				Keys.ENTER);
		// sleep
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.xpath("(//div[@class='box'])[1]//li"));
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		
			
	}
}







