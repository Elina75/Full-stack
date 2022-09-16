//package rc.bootsecurity.controllers;
//
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import rc.bootsecurity.Converter.Converter;
//import rc.bootsecurity.DTO.RecipesResponseDto;
//import rc.bootsecurity.models.Recipes;
//import rc.bootsecurity.service.RecipesService;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.logging.Logger;
//
//import static org.mockito.Mockito.when;
//
//class RecipesControllerTest {
//    @Mock
//    RecipesService recipesService;
//    @Mock
//    Converter converter;
//    @Mock
//    Logger log;
//    @InjectMocks
//    RecipesController recipesController;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//
////    @Test
////    void testGetAllRecipes() {
////        when(recipesService.getallRecipes()).thenReturn(Arrays.asList(new Recipes()));
////        when(converter.entityRecipeToDto(Arrays.asList(new Recipes()))).thenReturn(Arrays.<RecipesResponseDto>asList(new RecipesResponseDto()));
////        RecipesResponseDto responseDto = new RecipesResponseDto();
////        List<Recipes> recipes = recipesService.getallRecipes();
////        List<RecipesResponseDto> ex= converter.entityRecipeToDto(recipes);
////
////        List<RecipesResponseDto> result = recipesController.getAllRecipes();
////        Assertions.assertEquals(ex, Arrays.asList(responseDto));
////    }
//
////    @Test
////    void testGetAllEmployees() {
////        when(recipesService.getAllRecipesPage(anyInt(), anyInt(), anyString())).thenReturn(Arrays.<Recipes>asList(new Recipes(0, "title", 0, 0, "notice", Arrays.<Ingredient>asList(new Ingredient(0, "name", Arrays.<Recipes>asList(null))), "process")));
////      //  when(converter.entityRecipeToDto(any())).thenReturn(Arrays.<RecipesResponseDto>asList(new RecipesResponseDto()));
////
////        ResponseEntity<List<RecipesResponseDto>> result = recipesController.getAllEmployees(Integer.valueOf(0), Integer.valueOf(0), "sortBy");
////        Assertions.assertEquals(null, result);
////    }
//
//    @Test
//    void testFindByCategory() {
//        Recipes recipe1 = new Recipes(6,"string",10,7,"string","string");
//        RecipesResponseDto responseDto= new RecipesResponseDto();
//        responseDto.setRecipe_id(6);
//        responseDto.setTitle("string");
//        responseDto.setPortions(7);
//        responseDto.setNotice("string");
//        responseDto.setProcess("string");
//        responseDto.setTime(10);
//        when(recipesService.categoryRecipes("string")).thenReturn(Arrays.<Recipes>asList(recipe1));
//        when(converter.entityRecipeToDto(Arrays.asList(recipe1))).thenReturn(Arrays.<RecipesResponseDto>asList(responseDto));
//
//        List<Recipes> recipes = recipesService.categoryRecipes("string");
//        List<RecipesResponseDto> dtos = converter.entityRecipeToDto(recipes);
//
//      //  List<RecipesResponseDto> result = recipesController.findByCategory("string");
//        Assertions.assertEquals(dtos, Arrays.asList(responseDto));
//    }
//
//    @Test
//    void testListAllHeaders() {
//        HttpHeaders headers = new HttpHeaders();
//        ResponseEntity<String> result = recipesController.listAllHeaders(new HashMap<String, String>() {{
//            put("String", "String");
//        }});
//        Assertions.assertEquals(new ResponseEntity<>("Listed 1 headers",headers, HttpStatus.OK), result);
//    }
//
////    @Test
////    void testFindByTime() {
////        Recipes recipe1 = new Recipes(6,"string",10,7, "string","string");
////        RecipesResponseDto responseDto= new RecipesResponseDto();
////        responseDto.setRecipe_id(6);
////        responseDto.setTitle("string");
////        responseDto.setPortions(7);
////        responseDto.setNotice("string");
////        responseDto.setProcess("string");
////        responseDto.setTime(10);
////        when(recipesService.timeRecipes(20)).thenReturn(Arrays.<Recipes>asList(recipe1));
////        when(converter.entityRecipeToDto(Arrays.asList(recipe1))).thenReturn(Arrays.<RecipesResponseDto>asList(responseDto));
////
////        List<Recipes> recipes = recipesService.timeRecipes(20);
////        List<RecipesResponseDto> dtos = converter.entityRecipeToDto(recipes);
////
////        List<RecipesResponseDto> result = recipesController.findByTime(20);
////        Assertions.assertEquals(Arrays.<RecipesResponseDto>asList(responseDto), Arrays.asList(responseDto));
////    }
////
////    @Test
////    void testSave() {
////        when(recipesService.save(any())).thenReturn(new Recipes(0, "title", 0, 0, "notice", Arrays.<Ingredient>asList(new Ingredient(0, "name", Arrays.<Recipes>asList(null))), "process"));
////        when(converter.dtoToRecipe(any())).thenReturn(new Recipes(0, "title", 0, 0, "notice", Arrays.<Ingredient>asList(new Ingredient(0, "name", Arrays.<Recipes>asList(null))), "process"));
////
////        ResponseEntity<Void> result = recipesController.save(new RecipesRequestDto());
////        Assertions.assertEquals(null, result);
////    }
//}
//
