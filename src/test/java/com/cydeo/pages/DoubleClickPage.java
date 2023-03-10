package com.cydeo.pages;

import com.cydeo.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoubleClickPage {
    public DoubleClickPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="demo")
    public WebElement textToDoubleClick;
}
