package rc.bootsecurity.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import rc.bootsecurity.Converter.Converter;
import rc.bootsecurity.DTO.RecipesResponseDto;
import rc.bootsecurity.models.Recipes;
import rc.bootsecurity.repository.RecipesRepository;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

class RecipesServiceTest {
    @Mock
    RecipesRepository recipesRepository;
    @InjectMocks
    RecipesService recipesService;
    @Mock
    Converter converter;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSave() {
        Recipes recipe1 = new Recipes(6,"string",10,7,"string","string");
        when(recipesService.save(recipe1)).thenReturn(recipe1);
        Recipes result = recipesService.save(recipe1);
        Assertions.assertSame(recipe1, result);
    }

    @Test
    void testGetallRecipes() {
        when(recipesService.getallRecipes()).thenReturn(Arrays.asList(new Recipes()));
        List<Recipes> result = recipesService.getallRecipes();
        Assertions.assertEquals(Arrays.<Recipes>asList(new Recipes()), result);
    }

    @Test
    void testCategoryRecipes() {
        Recipes recipe1 = new Recipes(6,"string",10,7,"string","string");
        RecipesResponseDto responseDto= new RecipesResponseDto();
        responseDto.setRecipe_id(6);
        responseDto.setTitle("string");
        responseDto.setPortions(7);
        responseDto.setNotice("string");
        responseDto.setProcess("string");
        responseDto.setTime(10);
        when(recipesRepository.getByNotice("string")).thenReturn(Arrays.<Recipes>asList(recipe1));
        when(converter.entityRecipeToDto(Arrays.asList(recipe1))).thenReturn(Arrays.<RecipesResponseDto>asList(responseDto));


        List<Recipes> result = recipesService.categoryRecipes("string");
        Assertions.assertEquals(Arrays.asList(recipe1), result);
    }

    @Test
    void testTimeRecipes() {
        Recipes recipe1 = new Recipes(6,"string",10,7,"string","string");

        when(recipesRepository.getByTimeIsLessThan(20)).thenReturn(Arrays.<Recipes>asList(recipe1));

        List<Recipes> result = recipesService.timeRecipes(20);
        Assertions.assertEquals(Arrays.<Recipes>asList(recipe1),result);
    }

//    @Test
//    void testGetAllRecipesPage() {
//        Ingredient ingredient1 = new Ingredient(1,"Potato");
//        Ingredient ingredient2 = new Ingredient(2,"E-220");
//        Ingredient ingredient3 = new Ingredient(3,"salt");
//        Ingredient ingredient4 = new Ingredient(4,"milk");
//        List<Ingredient> ingredients = new ArrayList<>();
//        ingredients.add(ingredient1);
//        ingredients.add(ingredient2);
//        ingredients.add(ingredient3);
//        ingredients.add(ingredient4);
//        Recipes recipe1 = new Recipes(1,"Smashed potato",30,3,"not vegan",ingredients,"Lorem ipsum dolor sit amet, consectetur adipiscing elit");
//        when(recipesService.getAllRecipesPage(1,1, "recipeId")).thenReturn(Arrays.asList(recipe1));
//        List<Recipes> result = recipesService.getAllRecipesPage(1,1, "recipeId");
////        Throwable exception = Assertions.assertThrows(NullPointerException.class, () -> {
////            throw new NullPointerException();
////        });
//        Assertions.assertEquals(recipe1, result);
//    }
}

