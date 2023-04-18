package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCheckBoxClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		String checkbox = "gridCheck";
		WebElement checkboxElement = driver.findElement(By.xpath("//input[@id='"+checkbox+"']"));
		checkboxElement.click();
		checkbox = "check-box-one";
		checkboxElement = driver.findElement(By.xpath("//input[@id='"+checkbox+"']"));
		checkboxElement.click();
		checkbox = "check-box-two";
		checkboxElement = driver.findElement(By.xpath("//input[@id='"+checkbox+"']"));
		checkboxElement.click();
		checkbox = "check-box-three";
		checkboxElement = driver.findElement(By.xpath("//input[@id='"+checkbox+"']"));
		checkboxElement.click();
		checkbox = "check-box-four";
		checkboxElement = driver.findElement(By.xpath("//input[@id='"+checkbox+"']"));
		checkboxElement.click(); 
		
		
		
		
		
		

	}

}
