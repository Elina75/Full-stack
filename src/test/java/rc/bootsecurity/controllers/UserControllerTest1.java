package rc.bootsecurity.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import rc.bootsecurity.Converter.Converter;
import rc.bootsecurity.models.Users;
import rc.bootsecurity.service.RegistrationService;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.Arrays;

import static org.mockito.Mockito.*;

class UserControllerTest1 {
    @Mock
    RegistrationService registrationService;
    @Mock
    Converter converter;
    @InjectMocks
    UserController userController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testHome() {
        when(registrationService.getAllStudent()).thenReturn(Arrays.<Users>asList(new Users(0, "first", "last", 0, "password", "username", new byte[]{(byte) 0})));

        String result = userController.home(null);
        Assertions.assertEquals("profile/index", result);
    }

    @Test
    void testFileUpload() throws IOException {
//        String result = userController.fileUpload("username", null, null);
//        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testDownloadFile() throws IOException {
        when(registrationService.findStudentById(anyInt())).thenReturn(null);

        userController.downloadFile(0, null, null);
    }

    @Test
    void testShowImage() throws ServletException, IOException {
//        when(registrationService.findStudentById(anyInt())).thenReturn(null);
//
//        userController.showImage(0, null, null);
    }

    @Test
    void testShowImage1() throws ServletException, IOException {
//        when(registrationService.findByUsername(anyString())).thenReturn(new Users(0, "first", "last", 0, "password", "username", new byte[]{(byte) 0}));
//
//        userController.showImage1("username", null, new Users(0, "first", "last", 0, "password", "username", new byte[]{(byte) 0}));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme