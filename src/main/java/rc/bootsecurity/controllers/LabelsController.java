package rc.bootsecurity.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import rc.bootsecurity.models.Labels;
import rc.bootsecurity.service.LabelsService;

import javax.validation.Valid;
import java.sql.SQLException;

@Controller
@RequestMapping
@Api(value = "a", tags = "Labels Controller", description = "Allows to work with labels data")
public class LabelsController {

    LabelsService labelsService;


    @Autowired
    public LabelsController(LabelsService labelsService) {
        this.labelsService = labelsService;
    }


    @RequestMapping ("/labels")
    public ModelAndView allLabels() throws SQLException {
        ModelAndView mv =new ModelAndView();
        mv.addObject("labels", labelsService.getallLabels());
        mv.setViewName("labels");
        return mv;
    }

    @GetMapping("/labels/new")
    public String createStudentForm(Model model) {

        // create student object to hold student form data
        Labels labels = new Labels();
        model.addAttribute("label", labels);
        return "create_label";

    }

    @PostMapping("/labels")
    public String saveStudent(@ModelAttribute("label") Labels labels) {
        labelsService.addLabel(labels);
        return "redirect:/labels";
    }



    @GetMapping("/labels/edit/{id}")
    public String editStudentForm(@PathVariable int id, Model model) {
        model.addAttribute("label", labelsService.getById(id));
        return "edit_label";
    }

    @PostMapping("/labels/{id}")
    public String updateStudent(@PathVariable int id,
                                @ModelAttribute("label") Labels labels,
                                Model model) {

        // get student from database by id
        Labels existingStudent = labelsService.getById(id);
        existingStudent.setLabel_id(id);
        existingStudent.setName(labels.getName());
        existingStudent.setCategory(labels.getCategory());
        existingStudent.setDescription(labels.getDescription());

        // save updated student object
        labelsService.updateLabelById(existingStudent);
        return "redirect:/labels";
    }

    // handler method to handle delete student request

    @GetMapping("/labels/{id}")
    public String deleteStudent(@PathVariable int id) {
        labelsService.deleteLabel(id);
        return "redirect:/labels";
    }




    //-----------------------------------------------------------------------

    @PostMapping("/addLabel")
    @ApiOperation(value = "Add a new label")
    public ResponseEntity<Void> addLabel(@RequestBody @Valid Labels labels) {
        labelsService.addLabel(labels);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @PutMapping("/updateLabel")
    @ApiOperation(value = "Update label by id ")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Label was updated"),
            @ApiResponse(code = 304, message = "Label was not modified")})
    @ResponseBody
    public ResponseEntity<Labels> updateLabel(@RequestBody @Valid Labels labels) {
        try {
            labelsService.updateLabelById(labels);
            return new ResponseEntity<Labels>(labels, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Labels>(labels, HttpStatus.NOT_MODIFIED);
        }

    }

    @DeleteMapping("/deleteLabel/{id}")
    @ApiOperation(value = "Delete label")
    @ApiResponses(value = {
            @ApiResponse(code = 404, message = "Not found"),
            @ApiResponse(code = 410, message = "Deleted")})
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        try {
            labelsService.deleteLabel(id);
            return new ResponseEntity<Void>(HttpStatus.GONE);
        } catch (Exception e) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "", method = RequestMethod.OPTIONS)
    ResponseEntity<?> collectionOptions() {
        return ResponseEntity
                .ok()
                .allow(HttpMethod.GET, HttpMethod.POST, HttpMethod.OPTIONS)
                .build();
    }


}
