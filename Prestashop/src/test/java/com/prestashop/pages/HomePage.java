package com.prestashop.pages;

import com.prestashop.utilities.MyLibrary;
import com.prestashop.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase{



    @FindBy(xpath = "(//a[@class='product-name'])[2]")
    public WebElement productElement;

    @FindBy(xpath = "//div[@class='columns-container']")
    public WebElement prestaHomePageElement;



    public HomePage() {

        PageFactory.initElements(driver, this);

    }








}
