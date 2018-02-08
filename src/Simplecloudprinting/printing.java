package Simplecloudprinting;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class printing
{
	@Test
	public void test1() throws IOException, AWTException, InterruptedException
	 {
		keywords key=new keywords();
		gmail g =new gmail();
		ArrayList a=new ArrayList();
		String x=System.getProperty("user.dir");
		System.out.println("Working Directory = " + x);
	    String str2="\\src\\testcases\\printing.xlsx";
		String str3=x+str2;
		FileInputStream file=new FileInputStream(str3);
		XSSFWorkbook wbks=new XSSFWorkbook(file);
		Sheet s= wbks.getSheet("Teststeps");
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
		Row rowitr=(Row)itr.next();
		Iterator cellitr=rowitr.cellIterator();
		while(cellitr.hasNext())
		{
			Cell Celldata=(Cell)cellitr.next();
	
		switch(Celldata.getCellType())
		{
		case Cell.CELL_TYPE_STRING:
			a.add(Celldata.getStringCellValue());
			break;
		case Cell.CELL_TYPE_NUMERIC:
			a.add(Celldata.getNumericCellValue());
			break;
		case Cell.CELL_TYPE_BOOLEAN:
			a.add(Celldata.getBooleanCellValue());
			break;
		}
		}
		}
              for (int i=0;i<a.size();i++)
              {
			
			if (a.get(i).equals("openbrowser")) 
			{
				String keyword=(String)a.get(i);
				String data=(String)a.get(i+1);
				String objectname=(String)a.get(i+2);
				String runmode=(String)a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectname);
				System.out.println(runmode);
				if(runmode.equals("yes"))
				{
				key.openbrowser();
			    }
			}
			if (a.get(i).equals("navigate")) 
			{
				String keyword=(String)a.get(i);
				String data=(String)a.get(i+1);
				String objectname=(String)a.get(i+2);
				String runmode=(String)a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectname);
				System.out.println(runmode);
				if(runmode.equals("yes"))
				{
				key.navigate(data);
			    }
			}
			if (a.get(i).equals("click")) 
			{
				String keyword=(String)a.get(i);
				String data=(String)a.get(i+1);
				String objectname=(String)a.get(i+2);
				String runmode=(String)a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectname);
				System.out.println(runmode);
				if(runmode.equals("yes"))
				{
				key.click(objectname);
			    }
			}
			if (a.get(i).equals("input")) 
			{
				String keyword=(String)a.get(i);
				String data=(String)a.get(i+1);
				String objectname=(String)a.get(i+2);
				String runmode=(String)a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectname);
				System.out.println(runmode);
				if(runmode.equals("yes"))
				{
					key.input(data,objectname);
			    }
			}
			if (a.get(i).equals("select")) 
			{
				String keyword=(String)a.get(i);
				String data=(String)a.get(i+1);
				String objectname=(String)a.get(i+2);
				String runmode=(String)a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectname);
				System.out.println(runmode);
				if(runmode.equals("yes"))
				{
				key.select(data);
			    }
			}
			if (a.get(i).equals("gmail_account")) 
			{
				String keyword=(String)a.get(i);
				String data=(String)a.get(i+1);
				String objectname=(String)a.get(i+2);
				String runmode=(String)a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectname);
				System.out.println(runmode);
				if(runmode.equals("yes"))
				{
				g.gmail_account();
				}
			}
			if (a.get(i).equals("store")) 
			{
				String keyword=(String)a.get(i);
				String data=(String)a.get(i+1);
				String objectname=(String)a.get(i+2);
				String runmode=(String)a.get(i+3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectname);
				System.out.println(runmode);
				if(runmode.equals("yes"))
				{
			   String result= key.store();
			   System.out.println(result);
				}
			}
	  
        }
	}
}

			
			
