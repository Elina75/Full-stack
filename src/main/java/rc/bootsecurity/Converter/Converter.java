package rc.bootsecurity.Converter;

import rc.bootsecurity.DTO.IngredientDto;
import rc.bootsecurity.DTO.RecipesRequestDto;
import rc.bootsecurity.DTO.RecipesResponseDto;
import rc.bootsecurity.DTO.UserDto;
import rc.bootsecurity.models.Ingredient;
import rc.bootsecurity.models.Recipes;
import rc.bootsecurity.models.Users;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Converter {

//    public Users dtoToEntity(UserDto userDto) {
//        Users users = new Users();
//        users.setFirst(userDto.getFirst());
//        users.setLast(userDto.getLast());
//        users.setAge(userDto.getAge());
//        users.setLogin(userDto.getUsername());
//        return users;
//    }

    public Recipes dtoToRecipe(RecipesRequestDto userDto) {
        Recipes recipes = new Recipes();
        recipes.setNotice(userDto.getNotice());
        recipes.setProcess(userDto.getProcess());
        recipes.setPortions(userDto.getPortions());
        recipes.setTime(userDto.getTime());
        recipes.setTitle(userDto.getTitle());
        return recipes;
    }

    public UserDto entityToDto(Users users) {
        UserDto userDto = new UserDto();
        userDto.setId(users.getId());
        userDto.setFirst(users.getFirst());
        userDto.setLast(users.getLast());
        userDto.setAge(users.getAge());
        //userDto.setUsername(users.getLogin());
        userDto.setPhoto(users.getPhoto());
        return userDto;
    }

    public RecipesResponseDto entityRecipeToDto(Recipes recipe) {
        RecipesResponseDto responseDto = new RecipesResponseDto();
        responseDto.setRecipe_id(recipe.getRecipeId());
        responseDto.setTitle(recipe.getTitle());
        responseDto.setTime(recipe.getTime());
        responseDto.setNotice(recipe.getNotice());
        responseDto.setPortions(recipe.getPortions());
        responseDto.setProcess(recipe.getProcess());
        responseDto.setIngredients(entityToIngrDto(recipe.getIngredients()));
        return responseDto;
    }

    public Ingredient dtoToIngr(IngredientDto dto){
        Ingredient ingredient= new Ingredient();
        ingredient.setIngr_id(dto.getIngr_id());
        ingredient.setName(dto.getName());
        return ingredient;
    }

    public IngredientDto entityToIngrDto(Ingredient ingredient){
        IngredientDto ingredientDto = new IngredientDto();
        ingredientDto.setIngr_id(ingredient.getIngr_id());
        ingredientDto.setName(ingredient.getName());
        return ingredientDto;
    }

    public List<IngredientDto> entityToIngrDto(List<Ingredient> ingredients) {
        return ingredients.stream().map(x -> entityToIngrDto(x)).collect(Collectors.toList());
    }



    public List<RecipesResponseDto> entityRecipeToDto(List<Recipes> recipes) {
        return recipes.stream().map(x -> entityRecipeToDto(x)).collect(Collectors.toList());
    }

    //Convert the List of Task entity into TaskDto
    public List<UserDto> entityToDto(List<Users> users) {
        return users.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
    }

    //Convert the List of TaskDto into Task entity
//    public List<Users> dtoToEntity(List<UserDto> dto) {
//        return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
//    }
}
