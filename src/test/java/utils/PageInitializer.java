package utils;

import pages.HomePage;

public class PageInitializer {

    public  static HomePage home;


    public static void initializePageObjects(){
        home=new HomePage();
    }
}
