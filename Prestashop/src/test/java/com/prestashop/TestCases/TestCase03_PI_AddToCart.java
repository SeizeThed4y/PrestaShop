package com.prestashop.TestCases;

import com.prestashop.pages.HomePage;
import com.prestashop.pages.ProductPage;
import com.prestashop.utilities.ConfigurationReader;
import com.prestashop.utilities.TestBase;
import org.testng.Assert;


public class TestCase03_PI_AddToCart extends TestBase {
    HomePage homePage;
    ProductPage productPage;


    public void TestCase03() throws InterruptedException {
        homePage = new HomePage();
        productPage = new ProductPage();

        myLibrary.openURL(ConfigurationReader.getPropery("url"));
        myLibrary.clickMethod(homePage.productElement);
        myLibrary.clickMethod(productPage.addCartPP);
        Thread.sleep(1200);
        String actualMessage = productPage.actualMessageElement.getText();
        Thread.sleep(1200);
        Assert.assertEquals("Product successfully added to your shopping cart", actualMessage);


    }
}
