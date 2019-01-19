package com.prestashop.tests.smoke_tests;

import com.prestashop.TestCases.TestCase01_PI_Price;
import com.prestashop.TestCases.TestCase02_PI_Details;
import com.prestashop.utilities.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SmokeTest extends TestBase {


   @Test
    public void Test1(){
       TestCase01_PI_Price testCase01_pi_price = PageFactory.initElements(driver,TestCase01_PI_Price.class);
       testCase01_pi_price.TestCase1();

   }


   @Test
    public void Test2(){
       TestCase02_PI_Details testCase02_pi_details = PageFactory.initElements(driver,TestCase02_PI_Details.class);
       testCase02_pi_details.TestCase02();
   }
}
