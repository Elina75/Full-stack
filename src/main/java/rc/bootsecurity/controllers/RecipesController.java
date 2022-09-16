package rc.bootsecurity.controllers;//package kz.iitu.itse1910.afanasyeva.controllers;
//
//import io.swagger.annotations.*;
//import kz.iitu.itse1910.afanasyeva.Converter.Converter;
//import kz.iitu.itse1910.afanasyeva.DTO.RecipesRequestDto;
//import kz.iitu.itse1910.afanasyeva.models.Recipes;
//import kz.iitu.itse1910.afanasyeva.DTO.RecipesResponseDto;
//import kz.iitu.itse1910.afanasyeva.service.RecipesService;
//import lombok.extern.java.Log;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import javax.annotation.security.RolesAllowed;
//import javax.validation.Valid;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping(value = "api/recipes")
//@Api(value = "",tags = "Recipes Controller", description = "Allows to work with recipe data")
//@Log
//public class RecipesController {
//
//    RecipesService recipesService;
//
//    @Autowired
//    Converter converter;
//
//    @Autowired
//    public RecipesController(RecipesService recipesService) {
//        this.recipesService = recipesService;
//    }
//
//    @GetMapping
//    @ApiOperation(value = "Get all recipes")
//    @ResponseStatus(HttpStatus.OK)
//    @RolesAllowed("admin")
//    public List<RecipesResponseDto> getAllRecipes() {
//        List<Recipes> recipes = recipesService.getallRecipes();
//        return converter.entityRecipeToDto(recipes);
//    }
//
//    @GetMapping("/page")
//    public ResponseEntity<List<RecipesResponseDto>> getAllRecipesPae(
//            @RequestParam(defaultValue = "0") Integer pageNo,
//            @RequestParam(defaultValue = "10") Integer pageSize,
//            @RequestParam(defaultValue = "recipeId") String sortBy)
//    {
//        List<Recipes> recipes = recipesService.getAllRecipesPage(pageNo, pageSize, sortBy);
//        List<RecipesResponseDto> responseDtos = converter.entityRecipeToDto(recipes);
//        return new ResponseEntity<List<RecipesResponseDto>>(responseDtos, new HttpHeaders(), HttpStatus.OK);
//    }
//
//    @GetMapping("/category/{category}")
//    @ApiOperation(value = "Get recipe by category")
//    @ResponseStatus(HttpStatus.OK)
//    public List<RecipesResponseDto> findByCategory(@RequestHeader("category") @PathVariable("category") String category) {
//        List<Recipes> recipes = recipesService.categoryRecipes(category);
//        return converter.entityRecipeToDto(recipes);
//    }
//
//    //@GetMapping("/listHeaders")
//    @RequestMapping(value="/listHeaders", method=RequestMethod.HEAD)
//    public ResponseEntity<String> listAllHeaders(
//            @RequestHeader Map<String, String> headers) {
//        headers.forEach((key, value) -> {
//            log.info(String.format("Header '%s' = %s", key, value));
//        });
//
//        return new ResponseEntity<String>(
//                String.format("Listed %d headers", headers.size()), HttpStatus.OK);
//    }
//
//    @GetMapping("/{time}")
//    @ApiOperation(value = "Get recipe which time for cooking is less than")
//    @ResponseStatus(HttpStatus.OK)
//    public List<RecipesResponseDto> findByTime(@PathVariable("time") int time) {
//        List<Recipes> recipes = recipesService.timeRecipes(time);
//        return converter.entityRecipeToDto(recipes);
//    }
//
//    //Add new project
//    @PostMapping("/addRecipe")
//    @ApiOperation(value = "Add new recipe")
//    @ApiResponse(code = 409, message = "Unexpected error")
//    public ResponseEntity<Void> save(@ApiParam(value = "Adding new recipe. Id field is unnecessary, you may skip it.  Check the model before creating body") @Valid @RequestBody RecipesRequestDto dto) {
//        try {
//            Recipes recipe = converter.dtoToRecipe(dto);
//            recipesService.save(recipe);
//            return new ResponseEntity<Void>(HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
//        }
//    }
//
//}
