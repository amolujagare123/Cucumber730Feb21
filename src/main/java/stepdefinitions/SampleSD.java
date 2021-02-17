package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SampleSD {

    WebDriver driver;

    @Given("I am on login page")
    public void i_am_on_login_page() {
        System.out.println("I am on login page");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net");
    }

    @When("I enter valid username and valid password")
    public void i_enter_valid_username_and_valid_password() {
        System.out.println("I enter valid username and valid password");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
    }

    @When("I click on login button")
    public void i_click_on_login_button() {

        System.out.println("I click on login button");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }

    @Then("I should be redirected to the home page")
    public void i_should_be_redirected_to_the_home_page() {

        String expected = "https://stock.scriptinglogic.net/dashboard.php";
        String actual = driver.getCurrentUrl();

        Assert.assertEquals(actual,expected);

    }
}
