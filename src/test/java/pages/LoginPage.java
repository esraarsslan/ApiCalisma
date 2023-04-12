package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // LoginAndClose Page -> User Name
    @FindBy(id = "username")
    public WebElement username;

    // LoginAndClose Page -> Password
    @FindBy(id = "password")
    public WebElement password;

    // LoginAndClose Page -> LoginAndClose Button
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

}
