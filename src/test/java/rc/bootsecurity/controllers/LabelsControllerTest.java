//package rc.bootsecurity.controllers;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import rc.bootsecurity.models.Labels;
//import rc.bootsecurity.service.LabelsService;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.mockito.Mockito.any;
//import static org.mockito.Mockito.when;
//
//class LabelsControllerTest {
//    @Mock
//    LabelsService labelsService;
//    @InjectMocks
//    LabelsController labelsController;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    void testGetAllLabels() {
//        when(labelsService.getallLabels()).thenReturn(Arrays.<Labels>asList(new Labels(0, "name", "category", "description")));
//
//        List<Labels> result = labelsController.getAllLabels();
//        Assertions.assertEquals(Arrays.<Labels>asList(new Labels(0, "name", "category", "description")), result);
//    }
//
//    @Test
//    void testAddLabel() {
//        when(labelsService.addLabel(any())).thenReturn(new Labels(0, "name", "category", "description"));
//
//        ResponseEntity<Void> result = labelsController.addLabel(new Labels(0, "name", "category", "description"));
//        Assertions.assertEquals(new ResponseEntity<>(HttpStatus.CREATED), result);
//    }
//
//    @Test
//    void testUpdateLabel() {
//        Labels body = new Labels(0,"name","category","description");
//        ResponseEntity<Labels> result = labelsController.updateLabel(body);
//        Assertions.assertNotEquals(ResponseEntity.ok().body(body.toString()),result);
//    }
//
//    @Test
//    void testDelete() {
//        HttpHeaders headers = new HttpHeaders();
//        ResponseEntity<Void> result = labelsController.delete(0);
//        Assertions.assertEquals(new ResponseEntity<>(headers, HttpStatus.GONE), result);
//    }
//
//    @Test
//    void testCollectionOptions() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Allow", "GET,POST,OPTIONS");
//        ResponseEntity<?> result = labelsController.collectionOptions();
//        Assertions.assertEquals(new ResponseEntity<>(headers, HttpStatus.OK), result);
//    }
//}
//
