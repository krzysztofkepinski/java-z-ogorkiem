package kawazogorkiem.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private static String url = "https://int.smartrecruiters.com/account/sign-in";

    private WebDriver driver;

    private static String email_input_id = "email";
    private static String password_input_id = "password";
    private static String login_button_id = "sign-in-btn";

    private By emailInput = By.id(email_input_id);
    private By passwordInput = By.id(password_input_id);
    private By loginButton = By.id(login_button_id);

    public LoginPage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void setEmail(String email) {
        WebElement input = driver.findElement(emailInput);
        input.clear();
        input.sendKeys(email);
    }

    public void setPassword(String password) {
        WebElement input = driver.findElement(passwordInput);
        input.clear();
        input.sendKeys(password);
    }

    public void clickLogin() {
        WebElement button = driver.findElement(loginButton);
        button.click();
    }

    public String getUrl() {
        return url;
    }

    public void open() {
        driver.get(this.url);
    }



}
