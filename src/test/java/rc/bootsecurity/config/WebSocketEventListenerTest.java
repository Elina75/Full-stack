package rc.bootsecurity.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.messaging.simp.SimpMessageSendingOperations;

import static org.mockito.Mockito.*;

class WebSocketEventListenerTest {
    @Mock
    Logger logger;
    @Mock
    SimpMessageSendingOperations messagingTemplate;
    @InjectMocks
    WebSocketEventListener webSocketEventListener;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testHandleWebSocketConnectListener() {
        webSocketEventListener.handleWebSocketConnectListener(null);
    }

    @Test
    void testHandleWebSocketDisconnectListener() {
//        webSocketEventListener.handleWebSocketDisconnectListener();
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme