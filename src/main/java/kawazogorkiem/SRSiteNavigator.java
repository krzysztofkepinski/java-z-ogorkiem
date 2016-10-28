package kawazogorkiem;

import kawazogorkiem.pageobjects.HomePage;
import kawazogorkiem.pageobjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SRSiteNavigator {

    private static WebDriver driver;

    private static LoginPage loginPage;
    private static HomePage homePage;

    public SRSiteNavigator() {
        FirefoxProfile prof = new FirefoxProfile();
        prof.setPreference("browser.startup.homepage_override.mstone", "ignore");
        prof.setPreference("startup.homepage_welcome_url.additional",  "about:blank");
        DesiredCapabilities dc = DesiredCapabilities.firefox();
        dc.setCapability(FirefoxDriver.PROFILE, prof);
        driver = new FirefoxDriver(proxyCpabilities(dc));
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    DesiredCapabilities proxyCpabilities(DesiredCapabilities cap) {
        String proxyDefinition = System.getProperty("sr.proxy", "");
        if (!proxyDefinition.isEmpty()) {
            org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
            proxy.setHttpProxy(proxyDefinition)
                    .setFtpProxy(proxyDefinition)
                    .setSslProxy(proxyDefinition);
            cap.setCapability(CapabilityType.PROXY, proxy);
        }
        // To ignore SSL certificates (for example ZAP Proxy certificate)
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        return cap;
    }

    public LoginPage loginPage() {
        return this.loginPage;
    }

    public HomePage homePage() {
        return this.homePage;
    }

    public void close() {
        driver.close();
    }
}
