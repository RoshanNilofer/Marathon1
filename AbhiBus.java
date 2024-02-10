package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bang");
		driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
		driver.findElement(By.xpath("//a[text()='Tomorrow']")).click();
		Thread.sleep(3000);
		WebElement bus =driver.findElement(By.xpath("//h5[text()='Parveen Travels']"));
		String name = bus.getText();
		System.out.println(name);
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		WebElement seat =driver.findElement(By.xpath("//div[@class='text-grey']/small[1]"));
        String name1 = seat.getText();
        System.out.println(name1);
        driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
        driver.findElement(By.xpath("//button[@class='seat sleeper']")).click();
        driver.findElement(By.xpath("//div[@class='label']/p")).click();
        driver.findElement(By.xpath("//p[text()='Attibele Toll Gate']")).click();
        WebElement row=driver.findElement(By.xpath("//div[@class='row selectedSeatDetails']/span"));
        String name2 = row.getText();
        System.out.println(name2);
        WebElement fare=driver.findElement(By.xpath("//div[@class='row selectedSeatDetails']/span[2]"));
        String name3 = fare.getText();
        System.out.println(name3);
        String title = driver.getTitle();
		System.out.println(title);
        }

}
