package rc.bootsecurity.DTO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AuthRequestTest {
    AuthRequest authRequest = new AuthRequest("username", "password");
    AuthRequest authRequest1 = new AuthRequest();

    @Test
    void testSetUsername() {
        authRequest.setUsername("username");
    }

    @Test
    void testSetPassword() {
        authRequest.setPassword("password");
    }

    @Test
    void testEquals() {
        boolean result = authRequest.equals("o");
        Assertions.assertEquals(false, result);
    }

    @Test
    void testCanEqual() {
        boolean result = authRequest.canEqual("other");
        Assertions.assertEquals(false, result);
    }

    @Test
    void testToString() {
        String result = authRequest.toString();
        Assertions.assertEquals("AuthRequest(username=username, password=password)", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme