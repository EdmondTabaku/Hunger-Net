package webapp.controller;

import backend.model.Role;
import backend.model.User;
import backend.repository.RoleRepository;
import backend.repository.UserRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/hello")
@EntityScan(basePackages = "backend")
@EnableJpaRepositories(basePackages = "backend")
public class HelloController {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public HelloController(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @GetMapping
    public String hello(){
//        User user = new User();
//        user.setUsername("sample");
//        user.setPassword("pass");
//        Role role = new Role();
//        role.setName("ROLE_MANAGER");
//        Role role1 = roleRepository.save(role);
//        Set<Role> roles = new HashSet<>();
//        Optional<Role> role2 = roleRepository.findById(role1.getId());
//        if (role2.isPresent()){
//            Role role3 = role2.get();
//            roles.add(role3);
//        }
//
//        user.setRoles(roles);
//
//        userRepository.save(user);

        return "Hello User";
    }
}
