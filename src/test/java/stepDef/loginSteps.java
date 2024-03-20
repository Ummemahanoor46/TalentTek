package stepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class loginSteps extends config {
    @Given("user in TalentTEK Homepage")
    public void userInTalentTEKHomepage() {
    }

    @And("user enter valid email address")
    public void userEnterValidEmailAddress() {
        driver.findElement(By.name("email")).sendKeys(STUDENT_EMAIL);
    }

    @And("user enter valid password")
    public void userEnterValidPassword() {
        driver.findElement(By.name("password")).sendKeys(STUDENT_PASSWORD);
    }

    @When("user clicks on Log In button")
    public void userClicksOnLogInButton() { driver.findElement(By.xpath("//input[@class='my-login']")).click();
    }

    @Then("the user should be able to login successfully")
    public void theUserShouldBeAbleToLoginSuccessfully() {
        String expText = "Student Information";
        String actText = driver.findElement(By.xpath("//h2[@class='d-inline info']")).getText();
        Assert.assertEquals(expText,actText);
    }

    @And("user enter invalid email address")
    public void userEnterInvalidEmailAddress() { driver.findElement(By.name("email")).sendKeys("wrongeamil@gmail.com");

    }

    @And("user enter invalid password")
    public void userEnterInvalidPassword() { driver.findElement(By.name("password")).sendKeys("wrongpassword");
    }

    @Then("user should see Invalid email address error message.")
    public void userShouldSeeInvalidEmailAddressErrorMessage() {
        driver.findElement(By.xpath("//*[@id='error-msg']")).getText();
    }


    @Then("user should find Incorrect email or password error message.")
    public void userShouldFindIncorrectEmailOrPasswordErrorMessage() {
        driver.findElement(By.xpath("//*[@id='error-msg']")).getText();
    }

    @And("user submit email address and password field empty")
    public void userSubmitEmailAddressAndPasswordFieldEmpty() {
        driver.findElement(By.name("email")).sendKeys("");
        driver.findElement(By.name("password")).sendKeys("");
    }

    @Then("User should see please fill out field message.")
    public void userShouldSeePleaseFillOutFieldMessage()  {
        //driver.switchTo().alert();

    }

    @And("User enter the email with a mix of uppercase and lowercase characters")
    public void userEnterTheEmailWithAMixOfUppercaseAndLowercaseCharacters() {
        driver.findElement(By.name("email")).sendKeys("talenttekUMME@gmail.com");

    }

    @And("User enter the password with a mix of uppercase and lowercase characters")
    public void userEnterThePasswordWithAMixOfUppercaseAndLowercaseCharacters() {
        driver.findElement(By.name("email")).sendKeys(STUDENT_EMAIL);
        driver.findElement(By.name("password")).sendKeys("TEstPASSWORD99");
    }

    @And("user enter correct password")
    public void userEnterCorrectPassword() {  driver.findElement(By.name("password")).sendKeys("123456");
    }
}