package com.prestashop.pages;

import com.prestashop.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends TestBase {


    @FindBy(xpath = "//div[@class='pb-center-column col-xs-12 col-sm-4']//h1")
    public WebElement productNamePP;

    @FindBy(xpath = "//p[@class='our_price_display']//span")
    public WebElement productPricePP;


    @FindBy(xpath = "//input[@id='quantity_wanted']")
    public WebElement quantityPP;

    @FindBy(id = "group_1")
    public WebElement sizeDropBox;

    @FindBy(id = "add_to_cart")
    public WebElement addCartPP;


    @FindBy(xpath = "//div[@class='layer_cart_product col-xs-12 col-md-6']//h2")
    public WebElement actualMessageElement;


    @FindBy(id = "layer_cart_product_quantity")
    public WebElement quantityElement;

    @FindBy(id = "layer_cart_product_attributes")
    public WebElement sizeElement;








    public ProductPage() {
        PageFactory.initElements(driver, this);

    }


}
