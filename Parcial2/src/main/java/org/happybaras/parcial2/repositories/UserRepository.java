package org.happybaras.parcial2.repositories;

import org.happybaras.parcial2.domain.entities.Role;
import org.happybaras.parcial2.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByUsernameOrEmail(String username, String email);

    // Get users by roles
    List<User> findUsersByRoles(List<Role> roles);
}
