package ru.gb.tests;

import org.testng.annotations.Test;
import ru.gb.base.BaseTest;

public class ScreeShotFailTest extends BaseTest {

    @Test
    public void checkMainPageScreen(){
        openApp()
                .checkFailScreenshot();
    }
}
