package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class HomePage extends CommonMethods{

    /*@Given("the user navigates to the Genomics England homepage")
        public void the_user_navigates_to_the_genomics_england_homepage() {
        openBrowser();
        click(home.acceptCookies);
   }*/

    @Then("the title is {string}")
    public void the_title_is(String actualTitle) {
        click(home.acceptCookies);
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @Then("the following navigation options are displayed")
    public void the_following_navigation_options_are_displayed(DataTable dataTable) {

//        get all the navigational buttons from the website
        List<WebElement> listOfallOptions = home.navigationalButtons;

//        get the data table as a list of maps
        List<Map<String, String>> options = dataTable.asMaps();
        int count = 0;
//        iterate over to get one map entry at a time
        for( Map<String,String> option:options){
//            get the option text one by one from listofalloptions
            String actualOption = listOfallOptions.get(count).getText();

//            extract option from data table
            String expectedOption = option.get("options");

//            compare both
            Assert.assertEquals(actualOption,expectedOption);
            count=count+1;
        }

    }
}
