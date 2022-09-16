package rc.bootsecurity.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "recipes")
public class Recipes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int recipeId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "TIME")

    private int time;

    @Column(name = "PORTIONS")
    @Min(value = 5, message = "not less than 5")
    private int portions;

    @Column(name = "NOTICE")
    @NotNull(message = "dfghj")
    @NotEmpty(message = "dfghjk")
    private String notice;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "ing_in",
            joinColumns = @JoinColumn(name = "recipes_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
    private List<Ingredient> ingredients;

    @Column(name = "PROCESS")
    private String process;


    @Override
    public String toString() {
        return "Recipe:" +
                " title='" + title + '\'' +
                ", time_min=" + time +
                ", portions=" + portions +
                ", notice='" + notice + '\'' +
                ", ingredients=" + ingredients +
                ", process='" + process + '\'';
    }

    public Recipes(int recipeId, String title, int time, int portions, String notice, String process) {
        this.recipeId = recipeId;
        this.title = title;
        this.time = time;
        this.portions = portions;
        this.notice = notice;
        this.process = process;
    }

    @AssertTrue(message = "ERROR! Recipe should have time not less than 5 and process with notice must be defined")
            public boolean isGoodRecipe(){
        boolean result =  true;
        if (time < 5 || (process ==  null || notice ==  null)) {
            result = false;
        }
        return result;
            }
}
