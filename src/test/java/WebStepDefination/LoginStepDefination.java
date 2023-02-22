package WebStepDefination;

import Core.Helper;
import SearchPage.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginStepDefination {
    WebDriver driver;
    LoginPage lp;
    @Given("user in add customer page")
    public void userInAddCustomerPage() {
        Helper helper = new Helper();
        driver = helper.webURLForChrome("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/addCust");
    }

    @When("user enters {string} and {string} and {string}")
    public void userEntersFirstNameAndLastNameAndPostCode(String firstName, String lastName, String postCode) {
        lp = new LoginPage(driver);
        lp.customerData(firstName,lastName,postCode);
    }

    @And("click add customer button")
    public void clickAddCustomerButton() {

        lp.clickButton();
    }

    @Then("manager will navigate to successful popup page")
    public void managerWillNavigateToSuccessfulPopupPage() {

        lp.popUp();
    }

    @Given("user in open account page")
    public void userInOpenAccountPage() {

        lp.openAccount(); //problem.........
        System.out.println("hello");
    }

    @When("select customer name and currency")
    public void selectCustomerNameAndCurrency() {
        System.out.println("hello");
        
    }

    @And("click process button")
    public void clickProcessButton() {

        System.out.println("hello");
    }

    @Then("navigate the successful popup page")
    public void navigateTheSuccessfulPopupPage() {

        System.out.println("hello");
    }
}
