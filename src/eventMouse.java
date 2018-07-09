import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class eventMouse {

	WebDriver driver;
	Action mouseOvr,chold,reles,sendkey,click;
	Actions bacton;
	
	
	
	
	
	@BeforeTest
	public void moOver() {
		
		
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Md Mamunur Rashid\\Desktop\\chromedriver.exe");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		bacton=new Actions(driver);
		

		mouseOvr=bacton.moveToElement(driver.findElement(By.id("lst-ib"))).build();
		chold=bacton.clickAndHold(driver.findElement(By.linkText("Store"))).build();
		reles=bacton.release(driver.findElement(By.linkText("Store"))).build();
		sendkey=bacton.sendKeys(driver.findElement(By.id("lst-ib")),"Rose").build();
		click=bacton.click(driver.findElement(By.name("btnK"))).build();
		
		
	}
	

	@Test 
	public void mouseOver() {
		mouseOvr.perform();
		sendkey.perform();
		
		//chold.perform();
		//reles.perform();
		click.perform();
		
	}
	
	
	
	
}
