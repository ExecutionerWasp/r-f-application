package ru.server.integration.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.server.integration.application.domain.User;

/**
 * @author Alvin
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
