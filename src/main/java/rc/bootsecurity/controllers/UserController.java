package rc.bootsecurity.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import rc.bootsecurity.Converter.Converter;
import rc.bootsecurity.models.Users;
import rc.bootsecurity.service.RegistrationService;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

//@RestController
//@RequestMapping(value = "api/users")
//@Api(value = "", tags = "Users Controller", description = "Allows to work with user data")
@Controller
@RequestMapping
public class UserController {

    RegistrationService registrationService;


    Converter converter;

    @Autowired
    public UserController(RegistrationService registrationService, Converter converter) {
        this.registrationService = registrationService;
        this.converter = converter;
    }

    @GetMapping("/profile/index")
    public String home(Model model) {
        List<Users> list =  registrationService.getAllStudent();

        model.addAttribute("list", list);
        return "profile/index";
    }

    @PostMapping("/profile/upload")
    public String fileUpload(@Param("username") String username,@RequestParam("file") MultipartFile file, Model model) throws IOException {
        registrationService.updatePhotoByUsername(file.getBytes(),username);
        model.addAttribute("success", "File Uploaded Successfully!!!");
        return "profile/index";

    }


    @GetMapping("/profile/downloadfile")
    public void downloadFile(@Param("id") int id , Model model, HttpServletResponse response) throws IOException {
        Optional<Users> temp = registrationService.findStudentById(id);
        if(temp!=null) {
            Users student = temp.get();
            response.setContentType("application/octet-stream");
            String headerKey = "Content-Disposition";
            String headerValue = "attachment";
            response.setHeader(headerKey, headerValue);
            ServletOutputStream outputStream = response.getOutputStream();
            outputStream.write(student.getPhoto());
            outputStream.close();
        }
    }

    @GetMapping("/profile/image")
    public void showImage(@Param("id") int id, HttpServletResponse response, Optional<Users> student)
            throws ServletException, IOException {

        student = registrationService.findStudentById(id);
        response.setContentType("image/jpeg; image/jpg; image/png");
        response.getOutputStream().write(student.get().getPhoto());
        response.getOutputStream().close();
    }

    @GetMapping("/profile/image1")
    public void showImage1(@Param("username") String username, HttpServletResponse response, Users student)
            throws ServletException, IOException {
        student = registrationService.findByUsername(username);
        response.setContentType("image/jpeg; image/jpg; image/png");
        response.getOutputStream().write(student.getPhoto());
        response.getOutputStream().close();
    }


//    @GetMapping
//    @ApiOperation(value = "Get all users")
//    @ResponseStatus(HttpStatus.OK)
//    public List<UserDto> getAllUsers() {
//        List<Users> users = registrationService.getAllUsers();
//        return converter.entityToDto(users);
//    }

//    @GetMapping("/{name}")
//    @ApiOperation(value = "Get user by name")
//    @ResponseStatus(HttpStatus.OK)
//    public List<UserDto> findByName(@PathVariable("name") String name) {
//        List<Users> users = registrationService.findByName(name);
//        return converter.entityToDto(users);
//    }
//
//    @GetMapping("/{age}/login/{login}")
//    @ApiOperation(value = "Get user by age more than this or login equals")
//    @ResponseStatus(HttpStatus.OK)
//    public List<UserDto> findByAgeOrRole(@PathVariable("age") int age, @PathVariable("login") String login) {
//        List<Users> users = registrationService.findByAgeOrLogin(age, login);
//        return converter.entityToDto(users);
//    }

}
