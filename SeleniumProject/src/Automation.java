import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.PublicApi;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\16yat\\browserdrivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
//		clear email id-----
		Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
		
//		enter email id-----
	  Thread.sleep(4000);
		driver.findElement(By.cssSelector("#Email")).sendKeys("admin@yourstore.com");

//		  check checkBox-----
			WebElement checkBox;
			checkBox = driver.findElement(By.xpath("//*[@id=\"RememberMe\"]"));
			if(!checkBox.isSelected())
			{
				checkBox.click();
			}		
		
//			login button-----
			WebElement loginButton = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
			loginButton.click();
			
			System.out.println("User logged in successfully");
	}

}
