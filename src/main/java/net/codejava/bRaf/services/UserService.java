package net.codejava.bRaf.services;

import net.codejava.bRaf.models.Role;
import net.codejava.bRaf.models.User;
import net.codejava.bRaf.repos.RoleRepository;
import net.codejava.bRaf.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    RoleRepository roleRepo;

    @Autowired
    PasswordEncoder passwordEncoder;

    public void registerDefaultUser(User user) {
        Role roleUser = roleRepo.findByName("User");
        user.addRole(roleUser);

        userRepo.save(user);
    }
    public List<User> listAll() {
        return userRepo.findAll();
    }
    public User get(Long id) {
        return userRepo.findById(id).get();
    }

    public List<Role> listRoles() {
        return roleRepo.findAll();
    }
    public void save(User user) {
        userRepo.save(user);
    }

}