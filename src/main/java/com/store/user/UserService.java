package com.store.user;

import java.util.Optional;

public interface UserService {

    Optional<User> getByUsername(String username);
}