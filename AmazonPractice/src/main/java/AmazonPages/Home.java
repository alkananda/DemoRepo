package AmazonPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Home {
	
	@FindBy(xpath = "//*[contains(text(),'Account & Lists')]")
	public WebElement  Account_List;
	
	

}
