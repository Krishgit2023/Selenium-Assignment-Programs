package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickActionWithElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		
		WebElement Checkbox1 = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement Checkbox2 = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement Checkbox3 = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement Checkbox4 = driver.findElement(By.xpath("//input[@id='check-box-four']"));
		
		Actions actions = new Actions(driver);
		actions.click(Checkbox1).build().perform();
		actions.click(Checkbox2).build().perform();
		actions.click(Checkbox3).build().perform();
		actions.click(Checkbox4).build().perform();
		

	}

}
