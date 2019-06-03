package AmazonPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn {
	
	@FindBy(name = "email")
	public WebElement  EMAIL_ID;
	
	@FindBy(name = "password")
	public WebElement PASSWORD;
	
	@FindBy(id = "signInSubmit")
	public WebElement SIGNIN_BTN;
	
	public void signIn() {
		
	}

}
