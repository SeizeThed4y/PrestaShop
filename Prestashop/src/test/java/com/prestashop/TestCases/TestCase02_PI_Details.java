package com.prestashop.TestCases;

import com.prestashop.pages.HomePage;
import com.prestashop.pages.ProductPage;
import com.prestashop.utilities.ConfigurationReader;
import com.prestashop.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class TestCase02_PI_Details extends TestBase {

    HomePage homePage;
    ProductPage productPage;


    public void TestCase02() {
        homePage = new HomePage();
        productPage = new ProductPage();

        myLibrary.openURL(ConfigurationReader.getPropery("url"));
        myLibrary.clickMethod(homePage.productElement);
        myLibrary.compare("1", productPage.quantityPP);
        myLibrary.compare("S", productPage.sizeDropBox);

        List<String> sizeList = new ArrayList<>();
        sizeList.add("S");
        sizeList.add("M");
        sizeList.add("L");

        Select dropbox = new Select(productPage.sizeDropBox);

        List<WebElement> options = dropbox.getOptions();

        Assert.assertTrue(options.contains(sizeList));




    }
}
