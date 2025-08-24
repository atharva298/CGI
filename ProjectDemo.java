package Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello");
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
//driver.get("https://tutorialsninja.com/demo/index.php?");
driver.get("https://www.google.com/");
System.out.println("title is: "+driver.getTitle());
WebElement search=driver.findElement(By.id("APjFqb"));
search.sendKeys("Automation  Testing Tools");
search.submit();
	}

}
