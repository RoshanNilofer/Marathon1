package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		Thread.sleep(3000);
		WebElement source = driver.findElement(By.xpath("//select[@name,'city')]"));
		Select city = new Select(source);
		city.selectByVisibleText("Chennai");
		Thread.sleep(3000);
		WebElement source1 = driver.findElement(By.xpath("//select[@name,'genre')]"));
		Select gen = new Select(source1);
		gen.selectByVisibleText("ANIMATION");
		Thread.sleep(3000);
		WebElement source2 = driver.findElement(By.xpath("//select[@name,'lang')]"));
		Select lan = new Select(source2);
		lan.selectByVisibleText("ENGLISH");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		Thread.sleep(3000);
		WebElement source3=driver.findElement(By.xpath("//select[@id='cinemaName']"));
		Select cin = new Select(source3);
		cin.selectByVisibleText("PVR Heritage RSL ECR Chennai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='16']")).click();
		Thread.sleep(3000);
		WebElement source4 = driver.findElement(By.xpath("//select[@name,'timings')]"));
		Select time = new Select(source4);
		time.selectByVisibleText("03:00 PM - 06:00 PM");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Haneef");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("roshannilofer@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("7530084635");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='F&B Requirements']")).sendKeys("No");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Other Requirements']")).sendKeys("No");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='CANCEL']")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
	}
}
