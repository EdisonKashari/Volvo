package com.volvo.pages;


import com.volvo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ElementsPage extends Base {
    public ElementsPage(){

PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy (className = "menu-list")

    public static List<WebElement> listOfElements;


    public static void chooseElement(String elementName) {
        for (WebElement element : listOfElements) {
            if (element.getText().equals(elementName)) {
                element.click();
            }

        }
    }

    @FindBy (id = "userName")

    public WebElement fullName;

    @FindBy (id = "userEmail")

    public WebElement userEmail;

    @FindBy (id = "currentAddress")

    public WebElement currentAddress;

    @FindBy (id = "permanentAddress")

    public WebElement permanentAddress;

    @FindBy(className = "rct-checkbox")

    public WebElement checkBox;


    @FindBy(className = "rct-checkbox")

    public WebElement radioBtn;

    @FindBy(id="yesRadio")

    public WebElement radioBtnYes;

    @FindBy(id ="impressiveRadio")

    public WebElement radioBtnImpressive;

    @FindBy(id="noRadio")

    public WebElement radioBtnNo;


    @FindBy(id="addNewRecordButton")
    public WebElement addNewRecord;



    @FindBy(id="searchBox")
    public WebElement searchBox;

    @FindBy(id="basic-addon2")
    public WebElement search;

    @FindBy(xpath ="//div[@class='rt-resizable-header-content' and contains(text(),'First Name')]")
    public WebElement firstNameHeader;

    @FindBy(xpath ="//div[@class='rt-resizable-header-content' and contains(text(),'Last Name')]")
    public WebElement lastNameHeader;


    @FindBy(xpath ="//div[@class='rt-resizable-header-content' and contains(text(),'Age')]")
    public WebElement ageHeader;


    @FindBy(xpath ="//div[@class='rt-resizable-header-content' and contains(text(),'Email')]")
    public WebElement emailHeader;


    @FindBy(xpath ="//div[@class='rt-resizable-header-content' and contains(text(),'Salary')]")
    public WebElement salaryHeader;

    @FindBy(xpath ="//div[@class='rt-resizable-header-content' and contains(text(),'Department')]")
    public WebElement departmentHeader;


    @FindBy(xpath ="//div[@class='rt-resizable-header-content' and contains(text(),'Action')]")
    public WebElement action;

    @FindBy(xpath ="//div[@class='rt-resizable-header-content' and contains(text(),'Age')]")
    public WebElement Ald3en;

}
