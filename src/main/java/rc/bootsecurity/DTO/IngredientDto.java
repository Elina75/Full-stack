package rc.bootsecurity.DTO;

import lombok.Data;

import java.io.Serializable;

@Data
public class IngredientDto implements Serializable {
    private  int ingr_id;
    private  String name;
}
