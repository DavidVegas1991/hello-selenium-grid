package com.example.junit_grid_seleniumgrid;


// Generated by Selenium IDE
//esto es junit 4
//import org.junit.Test;
//import org.junit.Before;
//import org.junit.After;
//import static org.junit.Assert.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class gridTest {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @BeforeEach
    /*public void setUp() {
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        driver = new FirefoxDriver(options);
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }*/

    public void setUp() throws MalformedURLException {
        // cambiar aqui el browser
        DesiredCapabilities capability = DesiredCapabilities.chrome();

        driver = new RemoteWebDriver(new URL("http://localhost:4444"),capability);
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void test2() {
        // Test name: test2
        // Step # | name | target | value
        // 1 | open | / |
        driver.get("https://www.google.es/");
        // 2 | setWindowSize | 858x855 |
        //driver.manage().window().setSize(new Dimension(858, 855));
        // 3 | selectFrame | index=0 |
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.switchTo().frame(0);
        // 4 | click | css=#introAgreeButton .RveJvd |
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#introAgreeButton .RveJvd")).click();
        // 5 | selectFrame | relative=parent |
        driver.switchTo().defaultContent();
        // 6 | click | name=q |
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).click();
        // 7 | type | name=q | devops
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("devops");
        // 8 | sendKeys | name=q | ${KEY_ENTER}
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
}
