package com.volvo.pages;


import com.volvo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  abstract class Base {
    public Base(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText ="https://demoqa.com")

    public WebElement toolsQA;

    @FindBy (linkText ="https://www.toolsqa.com/selenium-training/")
    public WebElement traning;


    @FindBy (xpath ="//h5[.='Elements']" )

    public WebElement elements;

    @FindBy (xpath ="//h5[.='Forms']" )

    public WebElement forms;

    @FindBy(xpath ="//h5[.='Alerts, Frame & Windows']" )

    public WebElement alerts;

    @FindBy (xpath ="//h5[.='Widgets']" )

    public WebElement widgets;


    @FindBy (xpath ="//h5[.='Interactions']" )
    public WebElement interactions;

    @FindBy (xpath ="//h5[.='Book Store Application']" )
    public WebElement bookStoreApps;
}
