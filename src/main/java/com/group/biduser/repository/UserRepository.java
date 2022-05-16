package com.group.biduser.repository;

import com.group.biduser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findAll();

    List<User> findUserById(Long id);

    List<User> deleteUserById(Long id);

}
