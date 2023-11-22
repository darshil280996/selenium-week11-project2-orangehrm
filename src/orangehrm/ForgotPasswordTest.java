package orangehrm;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot your password?"));
        forgotPasswordLink.click();

        WebElement resetPasswordText = driver.findElement(By.xpath("//h2[text()='Reset Password']"));
        Assert.assertTrue(resetPasswordText.isDisplayed());
    }
}
