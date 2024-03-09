package Businesslogic;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import elementrepo.EndtoEnd_repo;
import generic.Base_class;
import generic.TestData;

public class EndToEndTestScript extends Base_class
{
	@Test(dataProvider = "endtoend", dataProviderClass = TestData.class)
	public void test_script(String path,String fn,String mn,String ln) {
		
		EndtoEnd_repo erp=new EndtoEnd_repo(driver);
		
		wait.until(ExpectedConditions.visibilityOf(erp.getpim())).click();
		
		wait.until(ExpectedConditions.visibilityOf(erp.getadd_emp())).click();
		
		wait.until(ExpectedConditions.visibilityOf(erp.getUpload_btn())).sendKeys(path);
		
		erp.getFirst_name().sendKeys(fn);
		erp.getMiddle_name().sendKeys(mn);
		erp.getLastName().sendKeys(ln);
		erp.getSubmit().click();
	}
}
