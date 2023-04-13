package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.ViceDeanPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US13_TC01_StepDefinition {

    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    ViceDeanPage viceDeanPage=new ViceDeanPage();
    @When("Menu butonuna tiklar")
    public void menu_butonuna_tiklar() {
        viceDeanPage.menuButton.click();

    }
    @When("Teacher Management'a tiklar")
    public void teacher_management_a_tiklar() {
        viceDeanPage.teacherManagement.click();

    }
    @When("Ogretmenin girecegi ders secilir")
    public void ogretmenin_girecegi_ders_secilir() {

        viceDeanPage.chooseLessons.click();
        Actions action=new Actions(Driver.getDriver());
        action.keyDown(Keys.ARROW_DOWN).sendKeys("Java",Keys.ENTER).perform();

    }
    @When("Name girilir")
    public void name_girilir() {
        viceDeanPage.nameBox.sendKeys("Senem"+Keys.ENTER);
    }
    @When("Surname girilir")
    public void surname_girilir() {
        viceDeanPage.surnameBox.sendKeys("Ozcetin"+Keys.ENTER);

    }
    @When("Birth Place girilir")
    public void birth_place_girilir() {
        viceDeanPage.birthPlaceBox.sendKeys("Izmir"+Keys.ENTER);

    }
    @When("Email girilir")
    public void email_girilir() {

        viceDeanPage.emailbox.sendKeys("snm@gmail.com");

    }
    @When("Phone number girilir")
    public void phone_number_girilir() {

        viceDeanPage.phoneNumberBox.sendKeys("123-852-6473");

    }
    @When("Gender female secilir")
    public void gender_female_secilir() {


    }
    @When("Date Of Birth girilir")
    public void date_of_birth_girilir() {


    }
    @When("Ssn girilir")
    public void ssn_girilir() {


    }
    @When("User Name girer")
    public void user_name_girer() {


    }
    @When("Password girer")
    public void password_girer() {


    }
    @When("Submit tiklanir")
    public void submit_tiklanir() {


    }
    @Then("Islemin gerceklestigine dair popUp mesajini goruntuler")
    public void ıslemin_gerceklestigine_dair_pop_up_mesajini_goruntuler() {


    }

}
