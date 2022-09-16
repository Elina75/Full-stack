package rc.bootsecurity.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ingredients")
public class Ingredient {
    @Id
    @Column(name = "ID")
    private int ingr_id;

    @Column(name = "NAME")
    private String name;

    public Ingredient(int ingr_id, String name) {
        this.ingr_id = ingr_id;
        this.name = name;
    }

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "ing_in",
            joinColumns = @JoinColumn(name = "ingredient_id"),
            inverseJoinColumns = @JoinColumn(name = "recipes_id"))
    @JsonIgnore
    private List<Recipes> recipes;

    @Override
    public String toString() {
        return name;
    }
}
