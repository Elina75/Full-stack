package rc.bootsecurity.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rc.bootsecurity.models.Labels;
import rc.bootsecurity.repository.LabelsRepository;

import java.util.List;

@Service
@Transactional
public class LabelsService {

    private LabelsRepository labels1;

    @Autowired
    public void setLabels1(LabelsRepository labels1) {
        this.labels1 = labels1;
    }

    public List<Labels> getallLabels() {
        return labels1.findAll();
    }


    public List<Labels> getLabelByName(String name) {
        return labels1.getLabelByName(name);
    }

    public Labels getById(int id){
        return labels1.findById(id).get();
    }


    public List<Labels> getLabelByCategory(String category) {
        return labels1.getLabelByCategory(category);
    }

    public void updateLabelById(Labels labels) {
        labels1.updateLabelById(labels.getName(),labels.getCategory(),labels.getDescription(),labels.getLabel_id());
    }

    public Labels addLabel(Labels labels) {
        return labels1.save(labels);
    }

    public void deleteLabel(int id) {
        labels1.deleteById(id);
    }

}
