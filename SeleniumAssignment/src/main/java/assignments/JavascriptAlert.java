package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().window().maximize();
		WebElement ClickmeButton1 = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		ClickmeButton1.click();
		Thread.sleep(2000);
		String AlertText = driver.switchTo().alert().getText();
		System.out.println(AlertText);
		driver.switchTo().alert().accept();
		WebElement ClickmeButton2 = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		ClickmeButton2.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		WebElement Clickmebutton3 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		Clickmebutton3.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Test");
		driver.switchTo().alert().accept();

	}

}
