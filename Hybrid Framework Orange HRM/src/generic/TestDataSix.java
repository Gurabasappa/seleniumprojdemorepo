package generic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class TestDataSix 
{
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{
		Object[][] arr=Generic_ExcelFive.get_multiple_data("Sheet1");
		return arr;
	}@DataProvider(name="endtoend")
}
