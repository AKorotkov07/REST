import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
	public List<Authorities> getUserAuthorities(String user, String password) {
		if ("admin".equals(user) && "adminPass".equals(password)) {
			List<Authorities> authorities = new ArrayList<>();
			authorities.add(Authorities.READ);
			authorities.add(Authorities.WRITE);
			authorities.add(Authorities.DELETE);
			return authorities;
		} else {
			return new ArrayList<>();
		}
	}
}