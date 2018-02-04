

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a {
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://qa.printme.com/home/upload");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/form/div[2]/div/button")).click();
		
	}

}
