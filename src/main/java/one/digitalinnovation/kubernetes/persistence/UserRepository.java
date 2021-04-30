package one.digitalinnovation.kubernetes.persistence;

import one.digitalinnovation.kubernetes.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}

