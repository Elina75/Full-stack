package rc.bootsecurity.service;

import rc.bootsecurity.models.Users;
import rc.bootsecurity.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RegistrationService {

    private RegistrationRepository registrationRepository;

    @Autowired
    public void setRegistrationRepository(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

//    @Transactional(readOnly = true)
//    public List<Users> getAllUsers() {
//        return registrationRepository.getAllUsers();
//    }


    public Users createStudent(Users student) {
        return registrationRepository.save(student);

    }
    public List<Users> getAllStudent(){
        return registrationRepository.findAll();

    }

    public void updatePhotoByUsername(byte[] photo, String username){
        registrationRepository.updatePhotoByUsername(photo, username);
    }

    public Users findByUsername(String username){
        return registrationRepository.findByUsername(username);
    }

    public Optional<Users> findStudentById(int id){
        return registrationRepository.findById(id);
    }

//    @Transactional(propagation = Propagation.REQUIRES_NEW)
//    public List<Users> findByName(String first) {
//        return registrationRepository.findByName(first);
//    }
//
//    @Transactional(timeout = 40)
//    public List<Users> findByAgeOrLogin(int age, String login) {
//        return registrationRepository.findByAgeOrLogin(age, login);
//    }
//
//    @Transactional(rollbackFor = NullPointerException.class)
//    public List<Users> findByFirstnameStartingWith(String first) {
//        return registrationRepository.findByFirstnameStartingWith(first);
//    }
//
}
