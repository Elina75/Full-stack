package rc.bootsecurity.config;

import org.apache.commons.logging.Log;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.context.ApplicationContext;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.accept.ContentNegotiationStrategy;

import javax.sql.DataSource;

import static org.mockito.Mockito.*;

class SecurityConfigurationTest {
    @Mock
    DataSource dataSource;
    @Mock
    BCryptPasswordEncoder encoder;
    @Mock
    Log logger;
    @Mock
    ApplicationContext context;
    @Mock
    ContentNegotiationStrategy contentNegotiationStrategy;
    @Mock
    ObjectPostProcessor<Object> objectPostProcessor;
    @Mock
    AuthenticationConfiguration authenticationConfiguration;
    @Mock
    AuthenticationManagerBuilder authenticationBuilder;
    @Mock
    AuthenticationManagerBuilder localConfigureAuthenticationBldr;
    @Mock
    AuthenticationManager authenticationManager;
    @Mock
    AuthenticationTrustResolver trustResolver;
    //Field http of type HttpSecurity - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    @InjectMocks
    SecurityConfiguration securityConfiguration;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testConfigureGlobal() throws Exception {
//        securityConfiguration.configureGlobal(null);
    }

    @Test
    void testConfigure() throws Exception {
//        securityConfiguration.configure((HttpSecurity) null);
    }

    @Test
    void testPasswordEncoder() {
        PasswordEncoder result = securityConfiguration.passwordEncoder();
        Assertions.assertNotEquals(null, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme