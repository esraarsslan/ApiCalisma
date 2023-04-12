package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Deneme {

    @Given("Site adresine gidilir")
    public void siteAdresineGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Sayfa basliginin Managementon Schools oldugu dogrulanir")
    public void sayfaBasligininManagementonSchoolsOlduguDogrulanir() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Managementon Schools");
    }

    @Then("Sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.closeDriver();
    }

    @When("Vice Dean rolu ile login islemi gerceklestirilir")
    public void viceDeanRoluIleLoginIslemiGerceklestirilir() {
        ReusableMethods.login("viceDeanUsername", "viceDeanPassword");
    }

}
