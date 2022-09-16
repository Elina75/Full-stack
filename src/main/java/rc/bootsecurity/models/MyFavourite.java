package rc.bootsecurity.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MyFavourite {
    private int user_cart_id;
    private int recipe_id;
    private String title;
    private String daytime;


}
