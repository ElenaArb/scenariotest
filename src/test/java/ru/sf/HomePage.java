package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
       this.webDriver = webDriver;
    }

   public void accept() {
     webDriver.findElement(By.xpath("//div[@class='main-header']//a[text()='Просмотреть курсы']")).click();
    }

   public void searchParam(String searchParam) {
       WebElement searchField = webDriver.findElement(By.id("discovery-input"));
       searchField.sendKeys(searchParam);
       searchField.submit();
   }

}
