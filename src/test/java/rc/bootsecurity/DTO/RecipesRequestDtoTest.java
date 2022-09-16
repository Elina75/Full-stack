package rc.bootsecurity.DTO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RecipesRequestDtoTest {
    RecipesRequestDto recipesRequestDto = new RecipesRequestDto("title", 0, 0, "notice", "process");

    @Test
    void testSetTitle() {
        recipesRequestDto.setTitle("title");
    }

    @Test
    void testSetTime() {
        recipesRequestDto.setTime(0);
    }

    @Test
    void testSetPortions() {
        recipesRequestDto.setPortions(0);
    }

    @Test
    void testSetNotice() {
        recipesRequestDto.setNotice("notice");
    }

    @Test
    void testSetProcess() {
        recipesRequestDto.setProcess("process");
    }

    @Test
    void testEquals() {
        boolean result = recipesRequestDto.equals("o");
        Assertions.assertEquals(false, result);
    }

    @Test
    void testCanEqual() {
        boolean result = recipesRequestDto.canEqual("other");
        Assertions.assertEquals(false, result);
    }

    @Test
    void testToString() {
        String result = recipesRequestDto.toString();
        Assertions.assertEquals("RecipesRequestDto(title=title, time=0, portions=0, notice=notice, process=process)", result);
    }
}
