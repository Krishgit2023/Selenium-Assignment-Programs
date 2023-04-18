package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabelClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/bootstrap-dual-list.php");
		driver.manage().window().maximize();
		String Option = "option2";
		WebElement optionElement = driver.findElement(By.xpath("//option[@value='"+Option+"']"));
		optionElement.click();
		Option = "option4";
		optionElement = driver.findElement(By.xpath("//option[@value='"+Option+"']"));
		optionElement.click();
		Option = "option5";
		optionElement = driver.findElement(By.xpath("//option[@value='"+Option+"']"));
		optionElement.click();
		Option = "option7";
		optionElement = driver.findElement(By.xpath("//option[@value='"+Option+"']"));
		optionElement.click();
		Option = "option8";
		optionElement = driver.findElement(By.xpath("//option[@value='"+Option+"']"));
		optionElement.click();
		Option = "option9";
		optionElement = driver.findElement(By.xpath("//option[@value='"+Option+"']"));
		optionElement.click();
		Option = "option0";
		optionElement = driver.findElement(By.xpath("//option[@value='"+Option+"']"));
		optionElement.click();
		
	}

}
