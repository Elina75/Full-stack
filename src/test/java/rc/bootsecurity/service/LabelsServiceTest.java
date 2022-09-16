package rc.bootsecurity.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import rc.bootsecurity.models.Labels;
import rc.bootsecurity.repository.LabelsRepository;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;

class LabelsServiceTest {
    @Mock
    LabelsRepository labels1;
    @InjectMocks
    LabelsService labelsService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetallLabels() {
        when(labelsService.getallLabels()).thenReturn(Arrays.asList(new Labels("null","null","null")));
        List<Labels> result = labelsService.getallLabels();
        Assertions.assertEquals(Arrays.asList(new Labels("null","null","null")), result);
    }

    @Test
    void testGetLabelByName() {
        when(labels1.getLabelByName(anyString())).thenReturn(Arrays.<Labels>asList(new Labels(0, "name", "category", "description")));

        List<Labels> result = labelsService.getLabelByName("name");
        Assertions.assertEquals(Arrays.<Labels>asList(new Labels(0, "name", "category", "description")), result);
    }

    @Test
    void testGetLabelByCategory() {
        when(labels1.getLabelByCategory(anyString())).thenReturn(Arrays.<Labels>asList(new Labels(0, "name", "category", "description")));

        List<Labels> result = labelsService.getLabelByCategory("category");
        Assertions.assertEquals(Arrays.<Labels>asList(new Labels(0, "name", "category", "description")), result);
    }

    @Test
    void testUpdateLabelById() {
        labelsService.updateLabelById(new Labels(0, "name", "category", "description"));
    }

    @Test
    void testAddLabel() {
        Labels result = labelsService.addLabel(new Labels(0, "name", "category", "description"));
        Assertions.assertEquals(null, result);
    }

//    @Test
//    void testDeleteLabel() {
//        labelsService.deleteLabel(0);
//    }
}

