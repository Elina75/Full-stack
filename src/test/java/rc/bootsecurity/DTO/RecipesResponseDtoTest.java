package rc.bootsecurity.DTO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

class RecipesResponseDtoTest {
    @Mock
    List<IngredientDto> ingredients;
    @InjectMocks
    RecipesResponseDto recipesResponseDto;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSetRecipe_id() {
        recipesResponseDto.setRecipe_id(0);
    }

    @Test
    void testSetTitle() {
        recipesResponseDto.setTitle("title");
    }

    @Test
    void testSetTime() {
        recipesResponseDto.setTime(0);
    }

    @Test
    void testSetPortions() {
        recipesResponseDto.setPortions(0);
    }

    @Test
    void testSetNotice() {
        recipesResponseDto.setNotice("notice");
    }

    @Test
    void testSetProcess() {
        recipesResponseDto.setProcess("process");
    }

    @Test
    void testSetIngredients() {
        recipesResponseDto.setIngredients(Arrays.<IngredientDto>asList(new IngredientDto()));
    }

    @Test
    void testEquals() {
        boolean result = recipesResponseDto.equals("o");
        Assertions.assertEquals(false, result);
    }

    @Test
    void testCanEqual() {
        boolean result = recipesResponseDto.canEqual("other");
        Assertions.assertEquals(false, result);
    }

    @Test
    void testToString() {
        String result = recipesResponseDto.toString();
        Assertions.assertEquals("RecipesResponseDto(recipe_id=0, title=null, time=0, portions=0, notice=null, process=null, ingredients=ingredients)", result);
    }
}
