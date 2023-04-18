package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement SelectAllButton = driver.findElement(By.xpath("//input[@id='button-two']"));
		SelectAllButton.click();
		
		WebElement Checkbox1 = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement Checkbox2 = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement Checkbox3 = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement Checkbox4 = driver.findElement(By.xpath("//input[@id='check-box-four']"));
		
		Boolean Checkbox1Status = Checkbox1.isSelected();
		Boolean Checkbox2Status = Checkbox2.isSelected();
		Boolean Checkbox3Status = Checkbox3.isSelected();
		Boolean Checkbox4Status = Checkbox4.isSelected();
		
		System.out.println("Checkbox1 is selected: "+Checkbox1Status);
		System.out.println("Checkbox2 is selected: "+Checkbox2Status);
		System.out.println("Checkbox3 is selected: "+Checkbox3Status);
		System.out.println("Checkbox4 is selected: "+Checkbox4Status);
	}

}
