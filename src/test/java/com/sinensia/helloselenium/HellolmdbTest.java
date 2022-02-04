package com.sinensia.helloselenium;

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

public class HellolmdbTest {
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
    public void helloImdb() {
        // Test name: HelloImdb
        // Step # | name | target | value
        // 1 | open | https://www.imdb.com/ |
        driver.get("https://www.imdb.com/");
        // 2 | setWindowSize | 1024x859 |
        driver.manage().window().setSize(new Dimension(1024, 859));
        // 3 | type | id=suggestion-search | el juego del calamar
        driver.findElement(By.id("suggestion-search")).sendKeys("el juego del calamar");
        // 4 | runScript | window.scrollTo(0,0) |
        js.executeScript("window.scrollTo(0,0)");
        // 5 | sendKeys | id=suggestion-search | ${KEY_ENTER}
        driver.findElement(By.id("suggestion-search")).sendKeys(Keys.ENTER);
        // 6 | click | linkText=Squid Game |
        driver.findElement(By.linkText("Squid Game")).click();
        // 7 | assertText | xpath=//h1 | Squid Game
        assertThat(driver.findElement(By.xpath("//h1")).getText(), is("Squid Game"));
    }
}
