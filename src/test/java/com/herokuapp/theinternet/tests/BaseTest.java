package com.herokuapp.theinternet.tests;

import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.pages.Main;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    public Main main;
    public LoginPage loginPage;

    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        main = PageFactory.initElements(driver, Main.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);

    }

    public void tearDown() {
        driver.quit();
    }

}
