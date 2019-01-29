package pl.oskarpolak.login.models.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.oskarpolak.login.models.entities.UserEntity;
import pl.oskarpolak.login.models.repositories.UserRepository;

@Service
public class UserService {

    final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public boolean addUser(String login, String password, String email) {
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(email);
        userEntity.setPassword(password);
        userEntity.setLogin(login);

        return userRepository.save(userEntity) != null;
    }

}
