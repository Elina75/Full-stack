package rc.bootsecurity.DTO;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RecipesResponseDto implements Serializable {
    private int recipe_id;
    private String title;
    private int time;
    private int portions;
    private String notice;
    private String process;
    private List<IngredientDto> ingredients;

}
