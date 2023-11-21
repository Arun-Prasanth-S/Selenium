package selenium_practise;


import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://letcode.in/waits");
		driver.findElement(By.id("accept")).click();
//		driver.switchTo().alert().accept();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();
	}

}



