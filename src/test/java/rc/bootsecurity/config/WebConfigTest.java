package rc.bootsecurity.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;

class WebConfigTest {
    WebConfig webConfig = new WebConfig();

    @Test
    void testAddResourceHandlers() {
//        webConfig.addResourceHandlers(null);
    }

    @Test
    void testViewResolver() {
        InternalResourceViewResolver result = webConfig.viewResolver();
        Assertions.assertNotEquals(null, result);
    }

    @Test
    void testAddViewControllers() {
//        webConfig.addViewControllers(null);
    }

    @Test
    void testConfigureDefaultServletHandling() {
//        webConfig.configureDefaultServletHandling(null);
    }

    @Test
    void testGetViewResolver() {
        ViewResolver result = webConfig.getViewResolver();
        Assertions.assertNotEquals(null, result);
    }

    @Test
    void testGetTilesConfigurer() {
        TilesConfigurer result = webConfig.getTilesConfigurer();
        Assertions.assertNotEquals(null, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme