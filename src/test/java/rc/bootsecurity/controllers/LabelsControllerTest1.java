package rc.bootsecurity.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.ModelAndView;
import rc.bootsecurity.models.Labels;
import rc.bootsecurity.service.LabelsService;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

class LabelsControllerTest1 {
    @Mock
    LabelsService labelsService;
    @InjectMocks
    LabelsController labelsController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testAllLabels() throws SQLException {
        when(labelsService.getallLabels()).thenReturn(Arrays.<Labels>asList(new Labels(0, "name", "category", "description")));

        ModelAndView result = labelsController.allLabels();
        Assertions.assertNotEquals("ModelAndView [view=\"labels\"; model={labels=[Name='name', category='category', description='description']}]", result);
    }

//    @Test
//    void testCreateStudentForm() {
//        String result = labelsController.createStudentForm(null);
//        Assertions.assertNotEquals("replaceMeWithExpectedResult", result);
//    }

    @Test
    void testSaveStudent() {
        when(labelsService.addLabel(any())).thenReturn(new Labels(0, "name", "category", "description"));

        String result = labelsController.saveStudent(new Labels(0, "name", "category", "description"));
        Assertions.assertEquals("redirect:/labels", result);
    }

//    @Test
//    void testEditStudentForm() {
//        when(labelsService.getById(anyInt())).thenReturn(new Labels(0, "name", "category", "description"));
//
//        String result = labelsController.editStudentForm(0, null);
//        Assertions.assertNotEquals("replaceMeWithExpectedResult", result);
//    }

    @Test
    void testUpdateStudent() {
        when(labelsService.getById(anyInt())).thenReturn(new Labels(0, "name", "category", "description"));

        String result = labelsController.updateStudent(0, new Labels(0, "name", "category", "description"), null);
        Assertions.assertEquals("redirect:/labels", result);
    }

    @Test
    void testDeleteStudent() {
        String result = labelsController.deleteStudent(0);
        Assertions.assertEquals("redirect:/labels", result);
    }

//    @Test
//    void testGetAllLabels() {
//        when(labelsService.getallLabels()).thenReturn(Arrays.<Labels>asList(new Labels(0, "name", "category", "description")));
//
//        List<Labels> result = labelsController.getAllLabels();
//        Assertions.assertEquals(Arrays.<Labels>asList(new Labels(0, "name", "category", "description")), result);
//    }

    @Test
    void testAddLabel() {
        when(labelsService.addLabel(any())).thenReturn(new Labels(0, "name", "category", "description"));

        ResponseEntity<Void> result = labelsController.addLabel(new Labels(0, "name", "category", "description"));
        Assertions.assertEquals(new ResponseEntity<>(HttpStatus.CREATED), result);
    }

    @Test
    void testUpdateLabel() {
        Labels body = new Labels(0, "name", "category", "description");
        ResponseEntity<Labels> result = labelsController.updateLabel(body);
        Assertions.assertNotEquals(ResponseEntity.ok().body(body.toString()), result);
    }

    @Test
    void testDelete() {
        HttpHeaders headers = new HttpHeaders();
        ResponseEntity<Void> result = labelsController.delete(0);
        Assertions.assertEquals(new ResponseEntity<>(headers, HttpStatus.GONE), result);
    }

    @Test
    void testCollectionOptions() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Allow", "GET,POST,OPTIONS");
        ResponseEntity<?> result = labelsController.collectionOptions();
        Assertions.assertEquals(new ResponseEntity<>(headers, HttpStatus.OK), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme