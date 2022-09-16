package rc.bootsecurity.repository;

import rc.bootsecurity.models.Labels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface LabelsRepository extends JpaRepository<Labels,Integer> {

    List<Labels> getLabelByCategory(String category);

    List<Labels> getLabelByName(String name);

    @Transactional
    @Modifying
    @Query("update Labels l set l.name = ?1, l.category = ?2, l.description = ?3 where l.label_id = ?4")
    void updateLabelById(String name, String category, String description, int label_id);


}
