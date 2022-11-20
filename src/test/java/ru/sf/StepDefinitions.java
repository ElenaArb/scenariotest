package ru.sf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {
    private static final WebDriver webDriver;
    private static final HomePage homePage;

    static {
        System.setProperty("webdriver.chrome.driver", "/Users/elena/IdeaProjects/cc-scenario /src/test/resources/chromedriver");
        webDriver = new ChromeDriver();
        homePage = new HomePage(webDriver);
    }

    @Given("url of SkillFactory {string}")
    public void url_of_skill_factory(String url) {
        webDriver.get(url);
    }

    @When("website is open click on {string}")
    public void website_is_open_click_on(String string) {
        homePage.accept();
    }

    @Then("start search {string}")
    public void start_search(String searchParam) {
        homePage.searchParam(searchParam);
    }

    @Then("assert that user got message {string}")
    public void assert_that_user_got_message(String errorMessage) {
       final var actualMessage = webDriver.findElement(By.id("discovery-message")).getText();
       assertEquals(errorMessage, actualMessage);
    }
}
