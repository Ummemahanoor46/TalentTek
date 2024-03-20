package stepDef;

import base.config;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class signupSteps extends config {
    Faker faker = new Faker();
    @And("user click on Create New Account button")
    public void userClickOnCreateNewAccountButton() { driver.findElement(By.xpath("//a[@class='new-account']")).click();
    }

    @And("user enter valid first name")
    public void userEnterValidFirstName() {
        STUDENT_FIRST_NAME = faker.name().firstName().replaceAll("[^a-zA-Z0-9]", "");
        driver.findElement(By.name("firstName")).sendKeys(STUDENT_FIRST_NAME);
    }

    @And("user enter valid last name")
    public void userEnterValidLastName() {
        STUDENT_LAST_NAME = faker.name().lastName().replaceAll("[^a-zA-Z0-9]", "");
        driver.findElement(By.name("lastName")).sendKeys(STUDENT_LAST_NAME);
    }

    @And("user enter new valid email address")
    public void userEnterNewValidEmailAddress() {
        STUDENT_RANDOM_EMAIL = STUDENT_FIRST_NAME.toLowerCase()+"."+STUDENT_LAST_NAME.toLowerCase()+faker.number().digits(4)+"@taltektc.com";
        driver.findElement(By.name("email")).sendKeys(STUDENT_RANDOM_EMAIL);
    }

    @And("user enter new valid password")
    public void userEnterNewValidPassword() {
        RANDOM_PASSWORD = STUDENT_FIRST_NAME.toLowerCase()+STUDENT_LAST_NAME.toLowerCase()+faker.number().digits(5);
        driver.findElement(By.name("password")).sendKeys(RANDOM_PASSWORD);
    }

    @And("user enter valid confirm password")
    public void userEnterValidConfirmPassword() {driver.findElement(By.name("confirmPassword")).sendKeys(RANDOM_PASSWORD);
    }
    @And("user enter their month as {string} under dob")
    public void userEnterTheirMonthAsUnderDob(String enterMonth) {
        Select m=new Select(driver.findElement(By.name("month")));
        m.selectByVisibleText(enterMonth);
    }

    @And("user enter their day as {string} under dob")
    public void userEnterTheirDayAsUnderDob(String enterDay) {
        Select d=new Select(driver.findElement(By.name("day")));
        d.selectByVisibleText(enterDay);

    }

    @And("user enter their year as {string} under dob")
    public void userEnterTheirYearAsUnderDob(String enterYear) {
        Select y=new Select(driver.findElement(By.name("year")));
        y.selectByVisibleText(enterYear);
    }

    @And("user select gender")
    public void userSelectGender() {
        driver.findElement(By.id("female")).click();
    }

    @And("user click the term and condition policy")
    public void userClickTheTermAndConditionPolicy() {
        driver.findElement(By.id("defaultCheck1")).click();
    }

    @When("user click on Create my Account button")
    public void userClickOnCreateMyAccountButton() {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Then("user should get unique student id with success message")
    public void userShouldGetUniqueStudentIdWithSuccessMessage() {
        String studentIdFullText = driver.findElement(By.xpath("//div[@class='swal-text']")).getText();
        STUDENT_RANDOM_ID = studentIdFullText.substring(studentIdFullText.indexOf(":") + 2);
        System.out.println("Student Random Id is :==========+++++======>>> "+STUDENT_RANDOM_ID);
    }

    @Then("student click on {string} button from popup modal")
    public void studentClickOnButtonFromPopupModal(String buttonName) {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='"+buttonName+"'])")).click();

    }

    @And("student enter newly created Student ID")
    public void studentEnterNewlyCreatedStudentID() {
        driver.findElement(By.name("email")).sendKeys(STUDENT_RANDOM_ID);
    }

    @And("student enter newly created password")
    public void studentEnterNewlyCreatedPassword() {
        driver.findElement(By.name("password")).sendKeys(RANDOM_PASSWORD);
    }

    @When("student clicks on Login button")
    public void studentClicksOnLoginButton() {
        driver.findElement(By.xpath("//input[@class='my-login']")).click();
    }

    @And("user enter alphanumeric first name")
    public void userEnterAlphanumericFirstName() {
        STUDENT_FIRST_NAME = faker.name().firstName();
        STUDENT_NAME_NUMERIC= STUDENT_FIRST_NAME+faker.number().digits(5);
        driver.findElement(By.name("firstName")).sendKeys(STUDENT_NAME_NUMERIC);
    }

    @Then("the user should receive First name and last name cannot contain numeric or special characters error.")
    public void theUserShouldReceiveFirstNameAndLastNameCannotContainNumericOrSpecialCharactersError() {
        driver.findElement(By.id("error-msg"));
    }

    @And("user enter alphanumeric last name")
    public void userEnterAlphanumericLastName() {
        STUDENT_LAST_NAME = faker.name().firstName();
        STUDENT_NAME_NUMERIC= STUDENT_LAST_NAME+faker.number().digits(5);
        driver.findElement(By.name("lastName")).sendKeys(STUDENT_NAME_NUMERIC);
    }
}
