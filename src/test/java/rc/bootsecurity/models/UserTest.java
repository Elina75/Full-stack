//package rc.bootsecurity.models;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//class UserTest {
//    @Mock
//    Authorisation authorisation;
//    @InjectMocks
//    Users users;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    void testToString() {
//        String result = users.toString();
//        Assertions.assertEquals("Users{id=0, first='null', last='null', age=0, role='null'}", result);
//    }
//
//    @Test
//    void testEquals() {
//        boolean result = users.equals("o");
//        Assertions.assertEquals(false, result);
//    }
//
//    @Test
//    void testSetId() {
//        users.setId(0);
//    }
//
//    @Test
//    void testSetFirst() {
//        users.setFirst("first");
//    }
//
//    @Test
//    void testSetLast() {
//        users.setLast("last");
//    }
//
//    @Test
//    void testSetAge() {
//        users.setAge(0);
//    }
//
////    @Test
////    void testSetRole() {
////        users.setRole("role");
////    }
////
////    @Test
////    void testSetAuthorisation() {
////        users.setAuthorisation(new Authorisation(0, "login", "password", new Users(0, "first", "last", 0, "role", null)));
////    }
//}
//
