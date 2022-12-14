package rc.bootsecurity.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "labels")
public class Labels {
    public static final String FIND_ALL = "Labels.findAll";
    public static final String FIND_LABEL_BY_CATEGORY = "Labels.findByCategory";
    public static final String FIND_LABEL_BY_NAME = "Labels.findByName";

    @Id
    @ApiModelProperty(name = "id",required = false,hidden = false, example = "123", notes = "label's unique code.It's autogenerated")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int label_id;

    @NotNull(message = "Name must not be null")
    @NotBlank(message = "Name must contains of different characters not only space")
    @NotEmpty(message = "Name must not be empty. It must contain at least 1 character")
    @ApiModelProperty(name = "name",required = true, example = "E-125", notes = "label's name")
    @Column(name = "NAME")
    private String name;

    @NotNull(message = "Category must not be null")
    @NotBlank(message = "Category must contains of different characters not only space")
    @NotEmpty(message = "Category must not be empty. It must contain at least 1 character")
    @ApiModelProperty(name = "category",required = true, example = "healthy/toxic", notes = "label's category")
    @Column(name = "CATEGORY")
    private String category;

    @NotNull(message = "Description must not be null")
    @NotBlank(message = "Description must contains of different characters not only space")
    @NotEmpty(message = "Description must not be empty. It must contain at least 1 character")
    @ApiModelProperty(name = "description",required = true, example = "Karmin. Red dye", notes = "description of the label, what is it ")
    @Column(name = "DESCRIPTION")
    private String description;


    public Labels(String name, String category, String description) {
        this.name = name;
        this.category = category;
        this.description = description;
    }

    public Labels(int label_id) {
        this.label_id = label_id;
    }


    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'';
    }
}
