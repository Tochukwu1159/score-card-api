package com.decagon.scorecardapi.repository;

import com.decagon.scorecardapi.enums.Role;
import com.decagon.scorecardapi.model.Pod;
import com.decagon.scorecardapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
     Optional<User> findByEmail(String email);
     Optional<User> findFirstByRole(Role role);
     Optional<User> findById(Long id);
     Optional<User> findUserByIdAndRole(Long id, Role role);


}
