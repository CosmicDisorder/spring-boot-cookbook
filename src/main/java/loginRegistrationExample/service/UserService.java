package loginRegistrationExample.service;

import loginRegistrationExample.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
