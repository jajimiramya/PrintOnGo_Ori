package Simplecloudprinting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keywords 
{
	static FirefoxDriver driver;
	static Properties prop;
	static FileInputStream file;
	
	public void openbrowser() throws IOException 
	{
	driver=new 	FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	String dir_path=System.getProperty("user.dir");
	System.out.println("Working Directory = " + dir_path);
   	String str2="\\src\\objectrepository\\objectrepository.properties";
	String str3=dir_path+str2;
	FileInputStream file=new FileInputStream(str3);
	 prop=new Properties();
	prop.load(file);
	}
	public void navigate(String data) 
	{
	driver.get(data);
		
	}
	public void click(String objectname) 
	{
		driver.findElement(By.id(prop.getProperty(objectname))).click();
	}
	public void input(String data, String objectname) 
	{
		driver.findElement(By.xpath(prop.getProperty(objectname))).sendKeys(data);	
		
	}
	public void select(String data) throws AWTException 
	{
		StringSelection selection=new StringSelection(data);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	}

