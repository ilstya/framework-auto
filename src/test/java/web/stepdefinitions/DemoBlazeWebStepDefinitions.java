package web.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DemoBlazeWebStepDefinitions {

    WebDriver driver = new ChromeDriver();  // WebDriver

    @Given("I open the demo website {string}")
    public void i_open_the_demo_website(String url) {
        driver.get(url);
    }

    @Then("The page title should be {string}")
    public void the_page_title_should_be(String title) {
        String pageTitle = driver.getTitle();
        assertEquals(title, pageTitle);
    }

    @When("I click on the first product")
    public void i_click_on_the_first_product() {
        WebElement firstProduct = driver.findElement(By.cssSelector(".card-title"));
        firstProduct.click();
    }

    @Then("I should be taken to the product detail page")
    public void i_should_be_taken_to_the_product_detail_page() {
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("prod.html"));
    }

    @Then("The product title should be visible")
    public void the_product_title_should_be_visible() {
        WebElement productTitle = driver.findElement(By.cssSelector("h2.product-title"));
        assertTrue(productTitle.isDisplayed());
    }

    @When("I click on the {string} link")
    public void i_click_on_the_link(String linkText) {
        WebElement contactLink = driver.findElement(By.linkText(linkText));
        contactLink.click();
    }

    @Then("I should be taken to the Contact page")
    public void i_should_be_taken_to_the_contact_page() {
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("cart.html"));
    }

    @Then("The contact form should be displayed")
    public void the_contact_form_should_be_displayed() {
        WebElement contactForm = driver.findElement(By.id("cartur"));
        assertTrue(contactForm.isDisplayed());
    }
}
