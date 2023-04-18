package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormSubmitAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		driver.manage().window().maximize();
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		FirstName.sendKeys("Krishna");
		WebElement LastName = driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		LastName.sendKeys("Suresh");
		WebElement UserName = driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		UserName.sendKeys("Krishna123");
		WebElement City = driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		City.sendKeys("Trivandrum");
		WebElement State = driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		State.sendKeys("Kerala");
		WebElement Zip = driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		Zip.sendKeys("695573");
		WebElement Checkbox = driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		Checkbox.click();
		WebElement SubmitButton = driver.findElement(By.xpath("//button[text()='Submit form']"));
		SubmitButton.click();
		
		WebElement PrintMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		String Text = PrintMessage.getText();
		System.out.println(Text);
		

	}

}
