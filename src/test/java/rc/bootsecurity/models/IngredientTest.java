package rc.bootsecurity.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

class IngredientTest {
    @Mock
    List<Recipes> recipes;
    @InjectMocks
    Ingredient ingredient;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testToString() {
        String result = ingredient.toString();
        Assertions.assertEquals(null, result);
    }

    @Test
    void testSetIngr_id() {
        ingredient.setIngr_id(0);
    }

    @Test
    void testSetName() {
        ingredient.setName("name");
    }

    @Test
    void testEquals() {
        boolean result = ingredient.equals("o");
        Assertions.assertFalse(result);
    }

    @Test
    void testCanEqual() {
        boolean result = ingredient.canEqual("other");
        Assertions.assertEquals(false, result);
    }

    @Test
    void testHashCode() {
        int result = ingredient.hashCode();
        Assertions.assertNotEquals(0, result);
    }
}

