package rc.bootsecurity.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecipesRequestDto implements Serializable {
    private  String title;
    private  int time;

    @Min(value = 5, message = "not less than 5")
    @ApiModelProperty
    private  int portions;

    @NotNull(message = "dfghj")
    @NotEmpty(message = "dfghjk")
    @ApiModelProperty
    private  String notice;
    private  String process;
}
