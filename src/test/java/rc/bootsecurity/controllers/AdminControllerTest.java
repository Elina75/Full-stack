package rc.bootsecurity.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdminControllerTest {
    AdminController adminController = new AdminController();

    @Test
    void testIndex() {
        String result = adminController.index();
        Assertions.assertEquals("admin/index", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme