package one.digitalinnovation.kubernetes.repository;

import one.digitalinnovation.kubernetes.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}

