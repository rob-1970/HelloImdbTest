// Generated by Selenium IDE

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class HelloPelisIMDBTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void helloPelisIMDB() {
        // Test name: HelloPelis-IMDB
        // Step # | name | target | value
        // 1 | open | https://www.imdb.com/ |
        driver.get("https://www.imdb.com/");
        // 2 | setWindowSize | 1649x891 |
        driver.manage().window().setSize(new Dimension(1649, 891));
        // 3 | type | name=q | no mires
        driver.findElement(By.name("q")).sendKeys("no mires");
        // 4 | runScript | window.scrollTo(0,0) |
        js.executeScript("window.scrollTo(0,0)");
        // 5 | sendKeys | id=suggestion-search | $(KEY_ENTER)
        driver.findElement(By.id("suggestion-search")).sendKeys("$(KEY_ENTER)");
    }
}