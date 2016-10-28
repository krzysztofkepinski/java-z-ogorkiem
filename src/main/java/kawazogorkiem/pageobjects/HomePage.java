package kawazogorkiem.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private static String url = "https://int.smartrecruiters.com/account/app/home";

    private static WebDriver driver;

    private static String home_link_id = "st-homeLink";
    private static By homeLink = By.id(home_link_id);

    public HomePage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public WebElement getHomeLink() {
        return driver.findElement(homeLink);
    }
}
