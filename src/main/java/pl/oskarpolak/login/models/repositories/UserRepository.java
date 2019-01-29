package pl.oskarpolak.login.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.oskarpolak.login.models.entities.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
        //Za pomoca nazw metod
        //Za pomoca SQL
        //Za pomoca JPQL


        boolean existsByLogin(String oasodasndasd);
}
