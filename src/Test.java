import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test {
	
	static WebDriver driver = null;
	public static void main(String[] args[]) {
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\Testathon\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://www.freecrm.com/");
	    System.out.println("Tile of page is : "+driver.getTitle());
	    
	    WebElement body = driver.findElement(By.tagName("body"));
	    body.sendKeys(Keys.END);
	    WebElement phoneNumber = driver.findElement(By.xpath("/html/body/div[1]/footer/div/div[1]/div[2]/div[2]/div"));
	    System.out.println("Phone number : "+phoneNumber.getText());
	}
}