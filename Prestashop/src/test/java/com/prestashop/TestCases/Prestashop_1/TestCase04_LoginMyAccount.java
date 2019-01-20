package com.prestashop.TestCases.Prestashop_1;

import com.prestashop.utilities.ConfigurationReader;
import com.prestashop.utilities.TestBase;

public class TestCase04_LoginMyAccount extends TestBase {


    public void TestCase04(){

        myLibrary.openURL(ConfigurationReader.getPropery("url"));

    }
}
