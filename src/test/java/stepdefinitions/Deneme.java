package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class Deneme {

    @Given("Site adresine gidilir")
    public void site_adresine_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Sayfa basliginin Managementon Schools oldugu dogrulanir")
    public void sayfa_basliginin_managementon_schools_oldugu_dogrulanir() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Managementon Schools");
    }

    @Then("Sayfa kapatilir")
    public void sayfa_kapatilir() {
        Driver.closeDriver();
    }

}
