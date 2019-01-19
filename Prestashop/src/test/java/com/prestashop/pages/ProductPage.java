package com.prestashop.pages;

import com.prestashop.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends TestBase {


    @FindBy(xpath = "//div[@class='pb-center-column col-xs-12 col-sm-4']//h1")
   public  WebElement productNamePP;

    @FindBy(xpath = "//p[@class='our_price_display']//span")
   public WebElement productPricePP;


    @FindBy(xpath = "//input[@id='quantity_wanted']")
    public WebElement quantityPP;

    @FindBy(xpath = "//select[@id='group_1']")
    public WebElement sizeDropBox;



    public ProductPage(){
        PageFactory.initElements(driver,this);

    }









}
