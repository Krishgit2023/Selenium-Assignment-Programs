package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();
		WebElement FacebookButton = driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		String tooltip1 = FacebookButton.getAttribute("title");
		System.out.println(tooltip1);
		WebElement FollowButton = driver.findElement(By.xpath("//a[@class='btn btn-success']"));
		String tooltip2 = FollowButton.getAttribute("title");
		System.out.println(tooltip2);

	}

}
