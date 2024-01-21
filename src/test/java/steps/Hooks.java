package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks {

    @Before
    public void start(){
        CommonMethods.openBrowser();
    }

    @After
    public  void end(Scenario sceanrio){
        byte[] pic;
        if(sceanrio.isFailed()){
            pic= CommonMethods.takeScreenshot("failed"+sceanrio.getName());
        }
        else {
            pic=CommonMethods.takeScreenshot("passed"+sceanrio.getName());
        }
        sceanrio.attach(pic,"image/png", sceanrio.getName());
        CommonMethods.closeBrowser();

    }
}
