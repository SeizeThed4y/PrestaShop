package com.prestashop.TestCases;

import com.prestashop.pages.HomePage;
import com.prestashop.pages.ProductPage;
import com.prestashop.utilities.ConfigurationReader;
import com.prestashop.utilities.TestBase;

public class TestCase01_PI_Price extends TestBase {

    HomePage homePage;
    ProductPage productPage;

    public void TestCase1() {
        homePage = new HomePage();
        productPage = new ProductPage();


        myLibrary.openURL(ConfigurationReader.getPropery("url"));
        myLibrary.clickMethod(homePage.productElement);
        myLibrary.doesContain(homePage.prestaHomePageElement, productPage.productNamePP);
        myLibrary.doesContain(homePage.prestaHomePageElement,productPage.productPricePP);



    }
}
