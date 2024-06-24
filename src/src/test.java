package src;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.out.println("This is test");
		WebDriver driver = new ChromeDriver();

       driver.get("https://bstackdemo.com/signin");
//	    driver.manage().window().setSize(new Dimension(1470, 920));
	    driver.findElement(By.xpath("//div[@id=\'username\']/div/div/div")).click();
	    driver.findElement(By.id("react-select-2-option-0-0")).click();
	    driver.findElement(By.xpath("//div[@id=\'password\']/div/div/div")).click();
	    driver.findElement(By.id("react-select-3-option-0-0")).click();
	    driver.findElement(By.id("login-btn")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[2]/div[4]")).click();
	    driver.findElement(By.cssSelector(".buy-btn")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.id("firstNameInput")).click();
	    driver.findElement(By.id("firstNameInput")).sendKeys("Parth");
	    driver.findElement(By.id("lastNameInput")).click();
	    driver.findElement(By.id("lastNameInput")).sendKeys("Barai");
	    driver.findElement(By.id("addressLine1Input")).click();
	    driver.findElement(By.id("addressLine1Input")).sendKeys("b22");
	    driver.findElement(By.id("provinceInput")).click();
	    driver.findElement(By.id("provinceInput")).sendKeys("mh");
	    driver.findElement(By.id("postCodeInput")).click();
	    driver.findElement(By.id("postCodeInput")).sendKeys("400092");
	    driver.findElement(By.id("checkout-shipping-continue")).click();
	    driver.findElement(By.cssSelector("*[data-test=\"shipping-address-heading\"]")).click();
	    {
	        List<WebElement> elements = driver.findElements(By.cssSelector("*[data-test=\"shipping-address-heading\"]"));
	        assert(elements.size() > 0);
	    }
	}

}
