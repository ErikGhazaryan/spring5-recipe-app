package guru.springframework.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by jt on 7/13/17.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
	String messageTrial = "this is my message for 404"; 
    public NotFoundException() {
        super();
    }

    public NotFoundException(String message) {
        super("this is my message for 404");
    }

    public NotFoundException(String messageTrial, Throwable cause) {
        super(messageTrial, cause);
    }

}
