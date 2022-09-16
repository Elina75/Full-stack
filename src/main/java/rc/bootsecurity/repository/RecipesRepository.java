package rc.bootsecurity.repository;

import rc.bootsecurity.models.Recipes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipesRepository extends JpaRepository<Recipes, Integer> {

    List<Recipes> getByNotice(String notice);

    List<Recipes> findAll();

    List<Recipes> getByTimeIsLessThan(int time);


    List<Recipes> getByIngredients_NameEqualsIgnoreCase(String name);




}
