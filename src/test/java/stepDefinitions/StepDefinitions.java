package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StepDefinitions {

    private WebDriver driver;

    @Given("I open chrome")
    public void i_open_chrome() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("I go to the product page")
    public void i_go_to_the_product_page() throws InterruptedException {
        driver.get("https://www.grolls.se/helags-t-shirt--svart1100099.html");
        Thread.sleep(3000);

    }

    @When("I select size S in the dropdown menu")
    public void i_select_size_s_in_the_dropdown_menu() {
        Select dropDown = new Select(driver.findElement(By.id("attribute400")));
        dropDown.selectByValue("1419");
    }

    @Then("add {int} pieces of the product into the shopping cart")
    public void add_pieces_of_the_product_into_the_shopping_cart(Integer int1) throws InterruptedException {
        WebElement quantity = driver.findElement(By.className("qty-plus"));
        quantity.click();

        WebElement putToCart = driver.findElement(By.id("product-addtocart-button"));
        putToCart.click();

        Thread.sleep(3000);
        driver.quit();
    }




}
