package com.ludoed.service;

import com.ludoed.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final Map<Long, User> users = new HashMap<>();
    Long id = 0L;

    public User createUser(User user) {
        users.put(setId(), user);
        return user;
    }

    public Optional<User> getUserById(Long id) {
        return Optional.ofNullable(users.get(id));
    }

    public void deleteUser(Long id) {
        users.remove(id);
    }

    private Long setId() {
        if (!users.isEmpty()) {
            id++;
        }
        return (id);
    }
}
