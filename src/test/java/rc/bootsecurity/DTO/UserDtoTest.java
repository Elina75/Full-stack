package rc.bootsecurity.DTO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserDtoTest {
    UserDto userDto = new UserDto();

    @Test
    void testSetId() {
        userDto.setId(0);
    }

    @Test
    void testSetFirst() {
        userDto.setFirst("first");
    }

    @Test
    void testSetLast() {
        userDto.setLast("last");
    }

    @Test
    void testSetAge() {
        userDto.setAge(0);
    }

    @Test
    void testSetRole() {
        userDto.setUsername("role");
    }

    @Test
    void testEquals() {
        boolean result = userDto.equals("o");
        Assertions.assertEquals(false, result);
    }

    @Test
    void testCanEqual() {
        boolean result = userDto.canEqual("other");
        Assertions.assertEquals(false, result);
    }


    @Test
    void testToString() {
        String result = userDto.toString();
        Assertions.assertEquals("UserDto(id=0, first=null, last=null, age=0, username=null, photo=null)", result);
    }
}
