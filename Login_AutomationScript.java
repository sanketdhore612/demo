import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login_AutomationScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// Log In
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.xpath("//input[@class='email required input_authentication']")).sendKeys("sanketdhore0612@gmail.com");
		driver.findElement(By.xpath("//input[@class='required input_authentication']")).sendKeys("sanket@123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		

	}

}
