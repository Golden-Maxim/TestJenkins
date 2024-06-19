package org.example;


import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void goTo(){
        Selenide.open("https://gemini.google.com/app");
        Selenide.sleep(10000);

    }


}
