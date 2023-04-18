package assignments;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		//to upload file--- only if tagname is input
		WebElement ChooseFile = driver.findElement(By.xpath("//input[@id='file-upload']"));
		//ChooseFile.sendKeys("C:\\Users\\krishna\\Desktop\\Test\\Test.txt");
		
		//another method to upload file
		//File fileupload = new File("C:\\Users\\krishna\\Desktop\\Test\\Test.txt");
		//ChooseFile.sendKeys(fileupload.getAbsolutePath());
		
		String Path = System.getProperty("user.dir");
		System.out.println(Path);
		
		//C:\Users\krishna\eclipse-workspace\SeleniumAssignment

	}

}
