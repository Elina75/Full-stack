package rc.bootsecurity.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ManagementControllerTest {
    ManagementController managementController = new ManagementController();

    @Test
    void testIndex() {
        String result = managementController.index();
        Assertions.assertEquals("management/index", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme