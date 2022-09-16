package rc.bootsecurity.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HomeControllerTest {
    HomeController homeController = new HomeController();

    @Test
    void testIndex() {
        String result = homeController.index();
        Assertions.assertEquals("index", result);
    }

    @Test
    void testLogin() {
        String result = homeController.login();
        Assertions.assertEquals("login", result);
    }

    @Test
    void testHome() {
        String result = homeController.home(null);
        Assertions.assertEquals("aboutUsPage", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme