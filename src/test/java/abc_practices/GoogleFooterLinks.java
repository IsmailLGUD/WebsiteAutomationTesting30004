package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFooterLinks {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome to Google Home page test project!");		
		System.setProperty("webdriver.chrome.driver", 
				 "C:/Users/MD. ISMAIL HOSSAIN/utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // For Chrome Browser
		
				driver.get("https://www.google.com/?hl=en\r\n");
				driver.manage().window().maximize();
				
				Thread.sleep(5000);
				
				
				
				driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/a[1]")).click();
				Thread.sleep(5000);
				String pagesource= driver.getPageSource();
				
				System.out.println(pagesource.contains("When you use our services"));
				
				String actualTitle= driver.getTitle();
				
				String expectedTitle= "Privacy Policy – Privacy & Terms – Google";
				if (actualTitle.equals(expectedTitle))
					System.out.println("I am on the privacy page");
				else 
					System.out.println("The test is failed!");
				Thread.sleep(3000);
				driver.close();
				
	}

}
