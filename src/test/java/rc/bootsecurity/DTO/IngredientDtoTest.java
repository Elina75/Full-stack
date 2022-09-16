package rc.bootsecurity.DTO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IngredientDtoTest {
    IngredientDto ingredientDto = new IngredientDto();

    @Test
    void testSetIngr_id() {
        ingredientDto.setIngr_id(0);
    }

    @Test
    void testSetName() {
        ingredientDto.setName("name");
    }

    @Test
    void testEquals() {
        boolean result = ingredientDto.equals("o");
        Assertions.assertEquals(false, result);
    }

    @Test
    void testCanEqual() {
        boolean result = ingredientDto.canEqual("other");
        Assertions.assertEquals(false, result);
    }

    @Test
    void testToString() {
        String result = ingredientDto.toString();
        Assertions.assertEquals("IngredientDto(ingr_id=0, name=null)", result);
    }
}

