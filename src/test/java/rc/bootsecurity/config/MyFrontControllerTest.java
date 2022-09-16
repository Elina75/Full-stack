package rc.bootsecurity.config;

import org.apache.commons.logging.Log;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class MyFrontControllerTest {
    @Mock
    Log logger;
    @InjectMocks
    MyFrontController myFrontController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetRootConfigClasses() {
        Class<?>[] result = myFrontController.getRootConfigClasses();
        Assertions.assertNotEquals(new Class<?>[]{null}, result);
    }

    @Test
    void testGetServletConfigClasses() {
        Class<?>[] result = myFrontController.getServletConfigClasses();
        Assertions.assertNotEquals(new Class<?>[]{null}, result);
    }

    @Test
    void testGetServletMappings() {
        String[] result = myFrontController.getServletMappings();
        Assertions.assertNotEquals(new String[]{"replaceMeWithExpectedResult"}, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme