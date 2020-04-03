package Security.Spring_security.Dao;

import Security.Spring_security.Entiity.Role;
import Security.Spring_security.Entiity.User;
import Security.Spring_security.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Repository
public class UserDao {
    @Autowired
    UserRepository userRepository;
    public AppUser loadUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        Set<Role> roles = user.getRoles();
        Iterator<Role> roleIterator = roles.iterator();
        String ro = null;
        List<GrantAuthorityImpl> list = new ArrayList<>();
        while (roleIterator.hasNext())
        {
            Role role = roleIterator.next();
            list.add(new GrantAuthorityImpl(role.getRole()));
        }
        System.out.println(user);
        if (username != null) {
            return new AppUser(user.getUsername(), user.getPassword(), list);
        } else {
            throw new RuntimeException();
        }
    }
}