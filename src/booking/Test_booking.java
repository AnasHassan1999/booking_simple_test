package booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_booking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "H:\\my new wep driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.booking.com");
		driver.findElement(By.xpath("//a[@class='bui-button bui-button--secondary js-header-login-link']//span[@class='bui-button__text'][normalize-space()='Sign in']")).click();
		driver.findElement(By.name("username")).sendKeys("anashaasan123@hotmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Anas#199912");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.name("ss")).sendKeys("Amman");
		
	}

}
