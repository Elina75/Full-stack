package rc.bootsecurity.service;

import rc.bootsecurity.models.Recipes;
import rc.bootsecurity.repository.RecipesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class RecipesService {
    private RecipesRepository recipesRepository;

    @Autowired
    public void setRecipesRepository(RecipesRepository recipesRepository) {
        this.recipesRepository = recipesRepository;
    }

    public Recipes save(Recipes recipes) {
        return recipesRepository.save(recipes);
    }

    @Transactional(readOnly = true)
    public List<Recipes> getallRecipes() {
        return recipesRepository.findAll();
    }

//    public List<Recipes> getRecipesWith(Ingredient products) {
//         return recipesRepository.getWith(products.getName());
//        }

    public List<Recipes> categoryRecipes(String notice) {
        return recipesRepository.getByNotice(notice);
    }

//    public List<Recipes> getRecipesWithOut(Ingredient products) {
//      return recipesRepository.getByIngredients_NameNotEqualsIgnoreCase(products.getName());
//    }

    @Transactional(noRollbackFor = NullPointerException.class)
    public List<Recipes> timeRecipes(int min) throws NullPointerException {
        if (recipesRepository.getByTimeIsLessThan(min).isEmpty() == false) {
            return recipesRepository.getByTimeIsLessThan(min);
        }
        throw new NullPointerException();

    }

    public List<Recipes> getAllRecipesPage(Integer pageNo, Integer pageSize, String sortBy)
    {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

        Page<Recipes> pagedResult = recipesRepository.findAll(paging);

        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Recipes>();
        }
    }
}