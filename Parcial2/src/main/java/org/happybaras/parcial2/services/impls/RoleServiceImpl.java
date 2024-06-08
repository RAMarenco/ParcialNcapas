package org.happybaras.parcial2.services.impls;

import org.happybaras.parcial2.domain.entities.Role;
import org.happybaras.parcial2.domain.entities.User;
import org.happybaras.parcial2.repositories.RoleRepository;
import org.happybaras.parcial2.services.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> findRolesByUsers(List<User> users) {
        return roleRepository.findRolesByUsers(users);
    }

    @Override
    public Optional<Role> findByName(String role) {
        return roleRepository.findByName(role);
    }
}
