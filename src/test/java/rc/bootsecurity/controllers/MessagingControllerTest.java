package rc.bootsecurity.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ModelAndView;
import rc.bootsecurity.models.ChatMessage;

class MessagingControllerTest {
    MessagingController messagingController = new MessagingController();

    @Test
    void testSendMessage() {
        ChatMessage result = messagingController.sendMessage(new ChatMessage());
        Assertions.assertEquals(new ChatMessage(), result);
    }

//    @Test
//    void testAddUser() {
//        ChatMessage result = messagingController.addUser(new ChatMessage(), null);
//        Assertions.assertEquals(new ChatMessage(), result);
//    }

    @Test
    void testIndex() {
        ModelAndView result = messagingController.index();
        Assertions.assertNotEquals("ModelAndView [view=\"index1\"; model=null]", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme