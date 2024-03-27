package orgtk.Stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import orgtk.BaseClass;


public class Hooks extends BaseClass {


    @Before
    public void setup(){
        initializeDriver();


    }

    @After
    public void close(){
       closeDriver();

    }
}
