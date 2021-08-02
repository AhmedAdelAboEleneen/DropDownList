package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.DropDownListPage;

public class DropDownListTest extends TestBase {
    DropDownListPage dropDownListPage;

    @Test
    public void Test() {

        dropDownListPage = new DropDownListPage(driver);
        dropDownListPage.SelectOptionByVis();
        dropDownListPage.select.getSize().equals(3);
        Assert.assertFalse(dropDownListPage.select.isSelected());
    }
}
