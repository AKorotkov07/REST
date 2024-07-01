import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorizationController {
	private final AuthorizationService service;

	public AuthorizationController(AuthorizationService service) {
		this.service = service;
	}

	@GetMapping("/authorize")
	public ResponseEntity<List<Authorities>> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
		return ResponseEntity.ok(service.getAuthorities(user, password));
	}
}
