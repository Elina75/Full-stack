package rc.bootsecurity.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

class RecipesTest {
    @Mock
    List<Ingredient> ingredients;
    @InjectMocks
    Recipes recipes;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testToString() {
        String result = recipes.toString();
        Assertions.assertEquals("Recipe: title='null', time_min=0, portions=0, notice='null', ingredients=ingredients, process='null'", result);
    }

    @Test
    void testIsGoodRecipe() {
        boolean result = recipes.isGoodRecipe();
        Assertions.assertEquals(false, result);
    }

    @Test
    void testSetRecipeId() {
        recipes.setRecipeId(0);
    }

    @Test
    void testSetTitle() {
        recipes.setTitle("title");
    }

    @Test
    void testSetTime() {
        recipes.setTime(0);
    }

    @Test
    void testSetPortions() {
        recipes.setPortions(0);
    }

    @Test
    void testSetNotice() {
        recipes.setNotice("notice");
    }

    @Test
    void testSetProcess() {
        recipes.setProcess("process");
    }

    @Test
    void testEquals() {
        boolean result = recipes.equals("o");
        Assertions.assertEquals(false, result);
    }

    @Test
    void testCanEqual() {
        boolean result = recipes.canEqual("other");
        Assertions.assertEquals(false, result);
    }

}

