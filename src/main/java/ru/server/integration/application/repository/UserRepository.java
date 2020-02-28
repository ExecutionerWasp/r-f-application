package ru.server.integration.application.repository;

import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.server.integration.application.domain.User;

import java.util.Optional;

/**
 * @author Alvin
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByLoginAndPassword(@NonNull String login, @NonNull String password);

    Boolean existsByLogin(@NonNull String login);
}
