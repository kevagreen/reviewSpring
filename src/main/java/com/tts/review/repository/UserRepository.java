package com.tts.review.repository;

import com.tts.review.model.Role;
import com.tts.review.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
   User findByRole(String role);
   User findByUsername(String username);
   User save(User user);
   User saveNewUser(User user);
   User getLoggedInUser();


}
