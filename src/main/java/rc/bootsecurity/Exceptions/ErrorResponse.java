package rc.bootsecurity.Exceptions;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "error")
@Data
@NoArgsConstructor
public class ErrorResponse
{
    public ErrorResponse(String message, List<String> details) {
        super();
        this.message = message;
        this.details = details;
    }


    //General error message about nature of error
    private String message;

    //Specific errors in API request processing
    private List<String> details;

}
