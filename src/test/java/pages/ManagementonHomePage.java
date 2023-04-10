package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ManagementonHomePage {

    public ManagementonHomePage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
}
