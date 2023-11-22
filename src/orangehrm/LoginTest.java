package orangehrm;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        WebElement loginButton = driver.findElement(By.id("btnLogin"));

        usernameField.sendKeys("Admin");
        passwordField.sendKeys("admin123");
        loginButton.click();

        WebElement dashboardText = driver.findElement(By.xpath("//h1[text()='Dashboard']"));
        Assert.assertTrue(dashboardText.isDisplayed());
    }
}
