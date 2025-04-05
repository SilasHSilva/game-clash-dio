package dio.me.service;

import dio.me.domain.model.User;
import org.springframework.orm.ObjectOptimisticLockingFailureException;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate) throws ObjectOptimisticLockingFailureException;
}
