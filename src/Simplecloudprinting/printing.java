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
import org.apache.xpath.compiler.Keywords;

public class printing
{
	public static void main(String[] args) throws IOException, AWTException 
	{
		keywords key=new keywords();
		
		ArrayList a=new ArrayList();
		FileInputStream file=new FileInputStream("G:\\Ramya\\workspace2\\PrintOnGo_Ori\\src\\testcases\\printing.xlsx");
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
			
			
              }
	}
}
			
			
