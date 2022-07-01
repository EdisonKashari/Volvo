package com.volvo.pages;


import com.volvo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PracticeForm extends Base{

    public PracticeForm() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//h5[.='Student Registration Form']")

    public WebElement studentHeader;


    @FindBy(css = "input[id='firstName']")

    public WebElement firstName;

    @FindBy(id = "lastName")

    public WebElement lastName;

    @FindBy(id = "serEmail-wrapper")

    public WebElement emailStudentForm;


    @FindBy(xpath = "//input[@name='gender']")

    public List<WebElement> genderList;


    public void chooseGender(String gender) {
        for (WebElement genderOption : genderList) {
            if (genderOption.getAttribute("value").equals(gender))
                genderOption.click();
        }

    }

    public void chooseGender2(String gender2) {
        //input[@value='+gender1']")
        String locator = "input[@value='" + gender2 + "']";
WebElement allGender=Driver.getDriver().findElement(By.xpath(locator));
allGender.click();
    }


        @FindBy(css ="input[id='userNumber']")

        public WebElement userNumber ;




    @FindBy(id ="dateOfBirthInput")

    public WebElement dateOfBirth ;



    @FindBy(xpath ="(//div[@class='css-1g6gooi'])[1]" )

    public WebElement subject ;




    @FindBy(id = "hobbies-checkbox-1")

    public WebElement sportsCheckBox ;


    @FindBy(id = "hobbies-checkbox-2")

    public WebElement readingCheckBox ;


    @FindBy(id = "hobbies-checkbox-3")

    public WebElement musicCheckBox ;



    @FindBy( id="uploadPicture")

    public WebElement uploadPicture ;


    @FindBy( id="currentAddress")

    public WebElement currentAddress ;


    }