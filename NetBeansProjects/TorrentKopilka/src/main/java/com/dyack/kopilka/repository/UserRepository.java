package com.dyack.kopilka.repository;

import com.dyack.kopilka.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select b from User b where id = :id")
    public List<User> findById(@Param("id") int id);

}