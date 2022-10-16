import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.PublicApi;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\16yat\\browserdrivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
//		maximize the window--
		driver.manage().window().maximize();
//		automate login page
//		clear email id-----
		Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
		
//		enter email id-----
	  Thread.sleep(2000);
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
			
//			automate add customer
//			Add a dashboard customer
			WebElement DASHBOARD_TITLE_ELEMENT=driver.findElement(By.xpath("//*[@id=\"nopcommerce-common-statistics-card\"]/div[2]/div/div[3]/div/a"));
//			Assert.assertEquals("Dashboard page not found!", "Dashboard", DASHBOARD_TITLE_ELEMENT.getText());
			
			WebElement CUSTOMER_ELEMENT = driver.findElement(By.linkText("Customers"));
			CUSTOMER_ELEMENT.click();
			
			WebElement CUSTOMER = driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a"));
			CUSTOMER.click();
			
//			Add customer button
			WebElement ADD_NEW_ELEMENT = driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a"));
			ADD_NEW_ELEMENT.click();
			
//			Add customer form
			WebElement EMAIL_ELEMENT = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
			EMAIL_ELEMENT.sendKeys("20yatingrover@gmail.com");
			
			WebElement PASSWORD_ELEMENT = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
			PASSWORD_ELEMENT.sendKeys("20yatingrover");
			
			WebElement FIRST_NAME_ELEMENT = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
			FIRST_NAME_ELEMENT.sendKeys("Yatin");
			
			WebElement LAST_NAME_ELEMENT = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
			LAST_NAME_ELEMENT.sendKeys("Grover");
			
			WebElement MALE_RADIO_BTN = driver.findElement (By.xpath("//*[@id=\"Gender_Male\"]"));
			WebElement FEMALE_RADIO_BTN = driver.findElement (By.xpath("//*[@id=\"Gender_Female\"]"));
			MALE_RADIO_BTN.click();
			
			WebElement DATE_OF_BIRTH_ELEMENT = driver.findElement(By.xpath("//*[@id=\"DateOfBirth\"]"));
			DATE_OF_BIRTH_ELEMENT.sendKeys("1/16/2000");
			
			WebElement COMPANY_ELEMENT = driver.findElement(By.xpath("//*[@id=\"Company\"]"));
			COMPANY_ELEMENT.sendKeys("bebo technology");
			
			WebElement IS_TAX_EXEMPT_ELEMENT = driver.findElement(By.xpath("//*[@id=\"IsTaxExempt\"]"));
			IS_TAX_EXEMPT_ELEMENT.click();
			
			Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"VendorId\"]")));  
			dropdown.selectByValue("1");  
			
			WebElement ADMIN_COMMENT_ELEMENT = driver.findElement(By.xpath("//*[@id=\"AdminComment\"]"));
			ADMIN_COMMENT_ELEMENT.sendKeys("nice to meet you");
			
//			save button-----
			WebElement SAVE_BUTTON = driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div[1]/div/button[1]"));
			SAVE_BUTTON.click();
			System.out.println("Successfully info saved");
			
//			automate search-----
			WebElement SEARCH_EMAIL_ELEMENT = driver.findElement(By.xpath("//*[@id=\"SearchEmail\"]"));
			SEARCH_EMAIL_ELEMENT.sendKeys("20yatingrover@gmail.com");
			
			WebElement SEARCH_FIRSTNAME_ELEMENT = driver.findElement(By.xpath("//*[@id=\"SearchFirstName\"]"));
			SEARCH_FIRSTNAME_ELEMENT.sendKeys("Yatin");
			
			WebElement SEARCH_LASTNAME_ELEMENT = driver.findElement(By.xpath("//*[@id=\"SearchLastName\"]"));
			SEARCH_LASTNAME_ELEMENT.sendKeys("Grover");
			
			Select SEARCH_BIRTH_M_ELEMENT = new Select(driver.findElement(By.xpath("//*[@id=\"SearchMonthOfBirth\"]")));  
			SEARCH_BIRTH_M_ELEMENT.selectByValue("1");  
			
			Select SEARCH_BIRTH_D_ELEMENT = new Select(driver.findElement(By.xpath("//*[@id=\"SearchDayOfBirth\"]")));  
			SEARCH_BIRTH_D_ELEMENT.selectByValue("16");  
			
			WebElement SEARCH_COMPANY = driver.findElement(By.xpath("//*[@id=\"SearchCompany\"]"));
			SEARCH_COMPANY.sendKeys("bebo technology");
			
			WebElement SEARCH_IP_ADDRESS = driver.findElement(By.xpath("//*[@id=\"SearchIpAddress\"]"));
			SEARCH_IP_ADDRESS.sendKeys("null");
			
//.			search button-----
			WebElement SEARCH_BUTTON = driver.findElement(By.xpath("//*[@id=\"search-customers\"]"));
			SEARCH_BUTTON.click();
			System.out.println("Successfully search");
			
//			automate delete----
			Thread.sleep(2000);
			WebElement EDIT_BUTTON = driver.findElement(By.xpath("//*[@id=\"customers-grid\"]/tbody/tr/td[7]/a"));
			EDIT_BUTTON.click();
			
			WebElement DELETE_BUTTON = driver.findElement(By.xpath("//*[@id=\"customer-delete\"]"));
			DELETE_BUTTON.click();
			
			WebElement DEL_BUTTON1 = driver.findElement(By.xpath("//*[@id=\"customermodel-Delete-delete-confirmation\"]/div/div/form/div/div[2]/button"));
			 //JavascriptExecutor to click element
		      JavascriptExecutor jse = (JavascriptExecutor) driver;
		      jse.executeScript("arguments[0].click();", DEL_BUTTON1);
		   	System.out.println("Successfully delete");
		   	
		   	Thread.sleep(2000);
//		   	logout
		   	WebElement LOGOUT_BUTTON = driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[3]/a"));
		   	LOGOUT_BUTTON.click();
		   	
		   	Thread.sleep(2000);
		   	driver.close();
			System.out.println("exit");
			
	}

}
