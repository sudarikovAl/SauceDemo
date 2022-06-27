package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void userShouldLoginWithValidCredentials(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).submit();
        Assert.assertTrue(driver.findElement(By.cssSelector(".title")).isDisplayed(), "User was  not logged in");
    }

}
