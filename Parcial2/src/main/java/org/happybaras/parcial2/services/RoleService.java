package org.happybaras.parcial2.services;

import org.happybaras.parcial2.domain.entities.Role;
import org.happybaras.parcial2.domain.entities.User;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<Role> findRolesByUsers(List<User> users);
    Optional<Role> findByName(String role);
}
