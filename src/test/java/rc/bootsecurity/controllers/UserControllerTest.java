package rc.bootsecurity.controllers;//package kz.iitu.itse1910.afanasyeva.controllers;
//
//import kz.iitu.itse1910.afanasyeva.Converter.Converter;
//import kz.iitu.itse1910.afanasyeva.DTO.UserDto;
//import kz.iitu.itse1910.afanasyeva.models.Authorisation;
//import kz.iitu.itse1910.afanasyeva.models.Users;
//import kz.iitu.itse1910.afanasyeva.service.RegistrationService;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.mockito.Mockito.*;
//
//class UserControllerTest {
//    @Mock
//    RegistrationService registrationService;
//    @Mock
//    Converter converter;
//    @InjectMocks
//    UserController userController;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
////    @Test
////    void testGetAllUsers() {
////        when(registrationService.getAllUsers()).thenReturn(Arrays.<Users>asList(new Users(0, "first", "last", 0, "role", new Authorisation(0, "login", "password", null))));
////        when(converter.entityToDto(Arrays.asList(new Users()))).thenReturn(Arrays.<UserDto>asList(new UserDto()));
////
////        List<Users> users = registrationService.getAllUsers();
////        List<UserDto> ex= converter.entityToDto(users);
////
////        List<UserDto> result = userController.getAllUsers();
////        Assertions.assertEquals(ex, result);
////    }
//
//    @Test
//    void testFindByName() {
//        Users user1 = new Users(1,"Elina","Afanasyeva",20,"admin");
//        UserDto userDto = new UserDto();
//        userDto.setFirst("Elina");
//        userDto.setLast("Afanasyeva");
//        userDto.setAge(20);
//        userDto.setRole("admin");
//        when(registrationService.findByName("Elina")).thenReturn(Arrays.asList(user1));
//        when(converter.entityToDto(Arrays.asList(user1))).thenReturn(Arrays.asList(userDto));
//
//        List<Users> user = registrationService.findByName("Elina");
//        List<UserDto> result =converter.entityToDto(user);
//
//        List<UserDto> ex =userController.findByName("Elina");
//        Assertions.assertEquals(result, ex);
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
//
//        UserDto userDto = new UserDto();
//        userDto.setAge(20);
//        userDto.setRole("admin");
//        userDto.setLast("Afanasyeva");
//        userDto.setFirst("Elina");
//        userDto.setId(1);
//
//        UserDto userDto2 = new UserDto();
//        userDto.setAge(145);
//        userDto.setRole("user");
//        userDto.setLast("Amodey");
//        userDto.setFirst("Mozart");
//        userDto.setId(6);
//
//        List<UserDto> userDtos = new ArrayList<>();
//        userDtos.add(userDto);
//        userDtos.add(userDto2);
//        when(registrationService.findByAgeOrRole(145, "admin")).thenReturn(users);
//        when(converter.entityToDto(users)).thenReturn(userDtos);
//
//        List<Users> users1 = registrationService.findByAgeOrRole(145, "admin");
//        List<UserDto> ex = converter.entityToDto(users1);
//
//        List<UserDto> result = userController.findByAgeOrRole(145, "admin");
//        Assertions.assertEquals(ex, result);
//    }
//}