package rc.bootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import rc.bootsecurity.models.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RegistrationRepository extends JpaRepository<Users, Integer> {
    @Transactional
    @Modifying
    @Query("update Users u set u.photo = ?1 where u.username = ?2")
    void updatePhotoByUsername(byte[] photo, String username);

    Users findByUsername(String username);


//    @Query("select u from #{#entityName} u")
//    List<Users> getAllUsers();
//
//    @Query("select u from Users u where u.first = ?1")
//    List<Users> findByName(String first);
//
//    @Query("select u from #{#entityName} u where u.age >= ?1 or u.login=?2")
//    List<Users> findByAgeOrLogin(int age, String login);
//
//    @Query("select u from #{#entityName} u where u.first like ?1%")
//    List<Users> findByFirstnameStartingWith(String first);
//


//    @Query("select u from Users u where u.id = ?1 and u.authorisation.userId = ?2")
//    @Query(value = "select u.role, au.login, au.password from Users u inner join Authorization au on u.id=au.user_id ", nativeQuery = true)
//    AuthorisationDto findByIdAndAuthorisation_UserId(int id, int userId);




}
