package Simplecloudprinting;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class gmail 
{
  static FirefoxDriver driver;
  public void gmail_account() 
 {
	FirefoxDriver driver=new FirefoxDriver();
	keywords key=new keywords();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.get("https://www.gmail.com");
	driver.findElement(By.id("identifierId")).sendKeys("abc.xyz04071990@gmail.com");
	driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
	driver.findElement(By.name("password")).sendKeys("kallur@1234");
	driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
	WebElement table = driver.findElement(By.id(":35"));
	List<WebElement> rows_table = table.findElements(By.tagName("tr"));
	int rows_count=rows_table.size();
	for(int row=0;row<rows_count;row++)
	{
		List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
 	    int columns_count = Columns_row.size();
	 	int column = 5;
	    String celtext = Columns_row.get(column).getText();
	 	String text=celtext.substring(celtext.indexOf(":")+1);
	    String splited[] = text.split(" ");
		System.out.println(splited[1]);
	    String docid=splited[1];
	    String docid_gmail = key.store();
	    if(docid.equals(docid_gmail))
	    		{	
	    			System.out.println("found the doc-id");
	    			break;
	    		}	
	}

	 
 }
		
		
	}	
	
	






