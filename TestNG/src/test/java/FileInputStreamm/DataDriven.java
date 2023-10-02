package FileInputStreamm;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
           
	       public static void getData() throws IOException {
	    	           ArrayList<String> a = new ArrayList<String>();
	    	           FileInputStream fis = new FileInputStream("C:\\Users\\Sarika Namsha\\Desktop\\ExcelReader.xlsx");
	    	           System.out.println(fis);
	    	           XSSFWorkbook workbook = new XSSFWorkbook(fis);
	    	           System.out.println(workbook);
	    	           int sheets = workbook.getNumberOfSheets();
	    	           System.out.println("no of sheets : " +sheets);
	    	           
	    	           for (int i=0;i<sheets;i++) {
	    	        	   if(workbook.getSheetName(i).equalsIgnoreCase("Demo")) {
	    	        		   XSSFSheet sheet = workbook.getSheetAt(i);
	    	        		   
	    	        	   }
	    	           }
	    	           
	    	           
	       }
	       public static void main(String[] args) throws IOException {
			  getData();
		}
}
