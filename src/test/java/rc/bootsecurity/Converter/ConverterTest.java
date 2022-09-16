//package rc.bootsecurity.Converter;
//
//import kz.iitu.itse1910.afanasyeva.DTO.IngredientDto;
//import kz.iitu.itse1910.afanasyeva.DTO.RecipesRequestDto;
//import kz.iitu.itse1910.afanasyeva.DTO.RecipesResponseDto;
//import kz.iitu.itse1910.afanasyeva.models.Ingredient;
//import kz.iitu.itse1910.afanasyeva.models.Recipes;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.test.util.ReflectionTestUtils;
//
//import java.util.Arrays;
//import java.util.List;
//
//class ConverterTest {
//    Converter converter = new Converter();
//
////    @Test
////    void testDtoToEntity() {
////        Users result = converter.dtoToEntity(new UserDto());
////        Assertions.assertNotEquals(new Users(0, "null", "null", 0, "null", new Authorisation(0, "login", "password", null)), result);
////    }
//
//    @Test
//    void testDtoToRecipe() {
//        RecipesRequestDto recipesRequestDto = new RecipesRequestDto();
//        recipesRequestDto.setTitle("test");
//        recipesRequestDto.setNotice("test");
//        recipesRequestDto.setProcess("test");
//        recipesRequestDto.setPortions(5);
//        recipesRequestDto.setTime(10);
//        ReflectionTestUtils.setField(recipesRequestDto, "title", "test1");
//        Recipes result = converter.dtoToRecipe(recipesRequestDto);
//        Assertions.assertEquals(new Recipes(0, "test1", 10, 5, "test", "test"), result);
//        Assertions.assertTrue(recipesRequestDto.getTitle().equals("test1"));
//    }
//
////    @Test
////    void testEntityToDto() {
////        UserDto result = converter.entityToDto(new Users(0, "null", "null", 0, "null", new Authorisation(0, "login", "password", null)));
////        Assertions.assertNotEquals(new UserDto(), result);
////    }
//
//    @Test
//    void testEntityRecipeToDto() {
//        RecipesResponseDto responseDto = new RecipesResponseDto();
//        responseDto.setTitle("test");
//        responseDto.setNotice("test");
//        responseDto.setProcess("test");
//        responseDto.setPortions(50);
//        responseDto.setTime(10);
//        responseDto.setIngredients(Arrays.asList(new IngredientDto()));
//        RecipesResponseDto result = converter.entityRecipeToDto(new Recipes(0, "test", 10,
//                50, "test",testEntityToIngrDto(Arrays.asList(new Ingredient(0,"null"))),
//                "test"));
//        Assertions.assertNotEquals(responseDto, result);
//    }
//
//    private <T> List<Ingredient> testEntityToIngrDto(List<T> name) {
//        IngredientDto ingredientDto = new IngredientDto();
//        ingredientDto.setIngr_id(0);
//        ingredientDto.setName("null");
//        Ingredient result = converter.dtoToIngr(ingredientDto);
//        Assertions.assertEquals(new Ingredient(0, "null"), result);
//        return Arrays.asList(new Ingredient(0,"null"));
//    }
//
//    @Test
//    void testDtoToIngr() {
//        IngredientDto ingredientDto = new IngredientDto();
//        ingredientDto.setIngr_id(0);
//        ingredientDto.setName("name");
//        Ingredient result = converter.dtoToIngr(ingredientDto);
//        Assertions.assertEquals(new Ingredient(0, "name"), result);
//    }
//
//    @Test
//    void testEntityToIngrDto() {
//        IngredientDto ingredientDto = new IngredientDto();
//        ingredientDto.setIngr_id(0);
//        ingredientDto.setName("name");
//        IngredientDto result = converter.entityToIngrDto(new Ingredient(0, "name"));
//        Assertions.assertEquals(ingredientDto, result);
//    }
//
//    @Test
//    void testEntityToIngrDto2() {
//        Ingredient ingredient = new Ingredient();
//        List<IngredientDto> result = converter.entityToIngrDto(Arrays.asList(ingredient));
//        Assertions.assertEquals(Arrays.<IngredientDto>asList(new IngredientDto()), result);
//    }
//
//    @Test
//    void testEntityRecipeToDto2() {
//        RecipesResponseDto responseDto = new RecipesResponseDto();
//        IngredientDto ingredientDto = new IngredientDto();
//        ingredientDto.setIngr_id(0);
//        ingredientDto.setName("null");
//        responseDto.setIngredients(Arrays.asList(ingredientDto));
//        Recipes recipes = new Recipes(0, "null", 0, 0, "null",testEntityToIngrDto(Arrays.asList(new Ingredient(0,"null"))), "null");
//        List<RecipesResponseDto> result = converter.entityRecipeToDto(Arrays.asList(new Recipes(0, "null", 0, 0, "null",testEntityToIngrDto(Arrays.asList(new Ingredient(0,"null"))), "null")));
//        Assertions.assertNotEquals(Arrays.<RecipesResponseDto>asList(responseDto), result);
//    }
//
////    @Test
////    void testEntityToDto2() {
////        List<UserDto> result = converter.entityToDto(Arrays.<Users>asList(new Users(0, "null", "null", 0, "null", new Authorisation(0, "login", "password", null))));
////        Assertions.assertNotEquals(Arrays.<UserDto>asList(new UserDto()), result);
////    }
////
////    @Test
////    void testDtoToEntity2() {
////        List<Users> result = converter.dtoToEntity(Arrays.<UserDto>asList(new UserDto()));
////        Assertions.assertNotEquals(Arrays.<Users>asList(new Users(0, "null", "null", 0, "null", new Authorisation(0, "login", "password", null))), result);
////    }
//}
//
