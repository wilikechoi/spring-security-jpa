package io.javabrains.springsecurityjpa.bootstrap;

import io.javabrains.springsecurityjpa.UserRepository;
import io.javabrains.springsecurityjpa.models.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class UserLoader implements CommandLineRunner {


    private final UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user = User.builder()
                .userName("raychoi")
                .active(true)
                .id(1)
                .roles("ROLE_ADMIN")
                .password("a03135")
                .build();

        userRepository.save(user);
    }
}
