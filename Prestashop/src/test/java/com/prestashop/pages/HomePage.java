package com.prestashop.pages;

import com.prestashop.utilities.MyLibrary;
import com.prestashop.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {


    @FindBy(xpath = "(//a[@class='product-name'])[2]")
    public WebElement productElement;

    @FindBy(xpath = "//div[@class='columns-container']")
    public WebElement prestaHomePageElement;

    @FindBy(xpath = "(//a[@class='button ajax_add_to_cart_button btn btn-default'])[2]")
    public WebElement productAddToCart;

    @FindBy(xpath = "(//div[@class='content_price'])[4]")
    public WebElement homePagePriceElement;

    @FindBy(xpath = "//div[@class='header_user_info']")
    public WebElement singInElement;




    public HomePage() {

        PageFactory.initElements(driver, this);

    }





}
