package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Login Page -> User Name
    @FindBy(id = "username")
    public WebElement username;

    // Login Page -> Password
    @FindBy(id = "password")
    public WebElement password;

    // Login Page -> Login Button
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

}
