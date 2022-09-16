package rc.bootsecurity.Exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

class ErrorResponseTest {
    @Mock
    List<String> details;
    @InjectMocks
    ErrorResponse errorResponse;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSetMessage() {
        errorResponse.setMessage("message");
    }

    @Test
    void testSetDetails() {
        errorResponse.setDetails(Arrays.<String>asList("String"));
    }

    @Test
    void testEquals() {
        boolean result = errorResponse.equals("o");
        Assertions.assertEquals(false, result);
    }

    @Test
    void testCanEqual() {
        boolean result = errorResponse.canEqual("other");
        Assertions.assertEquals(false, result);
    }

    @Test
    void testToString() {
        String result = errorResponse.toString();
        Assertions.assertEquals("ErrorResponse(message=null, details=details)", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme