package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropDownListPage extends PageBase{

    @FindBy(id ="dropdown")
    public WebElement select;

    public DropDownListPage(WebDriver driver) {
        super(driver);
    }

    public void SelectOptionByIndex() {

        Select selectOption = new Select(select);
        selectOption.selectByIndex(1);
    }

    public void SelectOptionByValue() {

        Select selectOption = new Select(select);
        selectOption.selectByValue("1");
    }

    public void SelectOptionByVis() {

        Select selectOption = new Select(select);
        selectOption.selectByVisibleText("Option 2");
    }
}
