package com.prestashop.TestCases.Prestashop_1;

import com.prestashop.pages.HomePage;
import com.prestashop.pages.ProductPage;
import com.prestashop.utilities.ConfigurationReader;
import com.prestashop.utilities.TestBase;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class TestCase03_PI_AddToCart extends TestBase {
    HomePage homePage;
    ProductPage productPage;


    public void TestCase03() throws InterruptedException {
        homePage = new HomePage();
        productPage = new ProductPage();

        myLibrary.openURL(ConfigurationReader.getPropery("url"));
        String homePageProductName = homePage.productElement.getText();
        String homePageProductPrice = homePage.homePagePriceElement.getText();
        myLibrary.clickMethod(homePage.productElement);
        myLibrary.clickMethod(productPage.addCartPP);
        Thread.sleep(1200);
        String actualMessage = productPage.actualMessageElement.getText();
        Thread.sleep(1200);
        Assert.assertEquals("Product successfully added to your shopping cart", actualMessage);
        String quantity = productPage.quantityElement.getText();
        Assert.assertEquals(quantity,"1");
        Select defaultOption = new Select(productPage.sizeDropBox);
        Assert.assertEquals(defaultOption.getFirstSelectedOption().getText(),"S");
        String productPageProductName = productPage.productNamePP.getText();
        String productPageProductPrice = productPage.productPricePP.getText();
        Assert.assertEquals(homePageProductName,productPageProductName);
        Assert.assertEquals(homePageProductPrice,productPageProductPrice);



    }
}
