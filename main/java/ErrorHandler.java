import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {

	@ExceptionHandler(InvalidCredentials.class)
	public ResponseEntity<String> handleInvalidCredentials(InvalidCredentials e) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	}

	@ExceptionHandler(UnauthorizedUser.class)
	public ResponseEntity<String> handleUnauthorizedUser(UnauthorizedUser e) {
		System.out.println(e.getMessage());
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
	}
}