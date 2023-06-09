package homework.pages;

import homework.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownPage {


    public DropdownPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "dropdown")
    public WebElement dropDown;

    @FindBy(xpath = "//option[@value='1']")
    public WebElement option1;

    @FindBy(xpath = "//option[@value='2']")
    public WebElement option2;
}
