import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UIbank {
 public static void main(String[] args) {
	 ChromeDriver driver = new ChromeDriver();

	driver.get("https://uibank.uipath.com/register-account");

	driver.manage().window().maximize();

	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Mothish");

	WebElement title = driver.findElement(By.xpath("//select[@id='title']"));

	Select selectTitle = new Select(title);

	selectTitle.selectByVisibleText("Mr");

	driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("H");

	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kumar");

	WebElement gender = driver.findElement(By.xpath("//select[@id='sex']"));

	Select selectGender = new Select(gender);

	selectGender.selectByVisibleText("Male");

	// select employment status

	WebElement status = driver.findElement(By.xpath("//select[@id='employmentStatus']"));

	Select selectStatus = new Select(status);

	selectStatus.selectByVisibleText("Full-time");

	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Siva");

	

	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Mothish46siva@gmail.com");

	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("93469346");

	//driver.close();
}
}
