package com.cydeo.pages;

import com.cydeo.utulities.Driver;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
