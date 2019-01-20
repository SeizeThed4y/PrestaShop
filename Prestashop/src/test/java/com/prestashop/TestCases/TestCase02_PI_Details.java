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

         Select sizeBox = new Select(productPage.sizeDropBox);

         String defaultSize = sizeBox.getFirstSelectedOption().getText();

         myLibrary.compareStrings(defaultSize,"S");


        List<String> options = new ArrayList<>();

        options.add("S");
        options.add("M");
        options.add("L");


        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(sizeBox.getOptions().get(i).getText(), options.get(i));
        }




    }
}
