//package rc.bootsecurity.service;
//
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import rc.bootsecurity.models.Users;
//import rc.bootsecurity.repository.RegistrationRepository;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.mockito.Mockito.*;
//
//class RegistrationServiceTest {
//    @Mock
//    RegistrationRepository registrationRepository;
//    @InjectMocks
//    RegistrationService registrationService;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
////    @Test
////    void testGetAllUsers() {
////        when(registrationRepository.getAllUsers()).thenReturn(Arrays.<Users>asList(new Users(0, "first", "last", 0, "role", new Authorisation(0, "login", "password", null))));
////
////        List<Users> result = registrationService.getAllUsers();
////        Assertions.assertEquals(Arrays.<Users>asList(new Users(0, "first", "last", 0, "role", new Authorisation(0, "login", "password", null))), result);
////    }
//
//    @Test
//    void testFindByName() {
//        Users user1 = new Users(1,"Elina","Afanasyeva",20,"admin");
//        when(registrationRepository.findByName("Elina")).thenReturn(Arrays.<Users>asList(user1));
//        List<Users> result = registrationService.findByName("Elina");
//        Assertions.assertEquals(Arrays.<Users>asList(user1), result);
//    }
//
//    @Test
//    void testFindByAgeOrRole() {
//        Users user1 = new Users(1,"Elina","Afanasyeva",20,"admin");
//        Users user2 = new Users(6,"Mozart","Amodey",145,"user");
//
//        List<Users> users = new ArrayList<>();
//        users.add(user1);
//        users.add(user2);
//        when(registrationRepository.findByAgeOrRole(145, "admin")).thenReturn(users);
//
//        List<Users> result = registrationService.findByAgeOrRole(145, "admin");
//        Assertions.assertEquals(users, result);
//    }
//
//    @Test
//    void testFindByFirstnameStartingWith() {
//        Users user1 = new Users(1,"Elina","Afanasyeva",20,"admin");
//        when(registrationRepository.findByFirstnameStartingWith("E")).thenReturn(Arrays.<Users>asList(user1));
//
//        List<Users> result = registrationService.findByFirstnameStartingWith("E");
//        Assertions.assertEquals(Arrays.<Users>asList(user1), result);
//    }
//}
