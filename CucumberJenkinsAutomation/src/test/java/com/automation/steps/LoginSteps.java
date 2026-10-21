package com.automation.steps;

import com.automation.factory.DriverFactory;
import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginSteps {
    private LoginPage loginPage;

    @Given("the user opens the login page")
    public void openLoginPage() {
        loginPage = new LoginPage(DriverFactory.getDriver());
        loginPage.open();
    }
    @When("the user enters username {string} and password {string}")
    public void enterCredentials(String username, String password) {
        loginPage.enterCredentials(username, password);
    }
    @When("the user clicks the login button")
    public void clickLogin() { loginPage.clickLogin(); }
    @Then("the success message should contain {string}")
    public void verifySuccess(String expected) {
        Assert.assertTrue(loginPage.getFlashMessage().contains(expected), "Success message mismatch");
    }
    @Then("the error message should contain {string}")
    public void verifyError(String expected) {
        Assert.assertTrue(loginPage.getFlashMessage().contains(expected), "Error message mismatch");
    }
}
