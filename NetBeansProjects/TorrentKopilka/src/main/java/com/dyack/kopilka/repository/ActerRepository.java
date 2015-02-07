package com.dyack.kopilka.repository;

import com.dyack.kopilka.entity.Acter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActerRepository extends JpaRepository<Acter, Integer> {

//    @Query(value = "SELECT acter.name FROM film JOIN acter JOIN acter_film ON "
//            + "acter_film.acter_film__film_id = film.film_id AND "
//            + "acter_film.acter_film__acter_id = acter.acter_id "
//            + "where film_id = :id", nativeQuery = true)
//    List<String> findActerById(@Param("id") String id); 
//
//    @Query("select a from Acter a where a.name = :name")
//    Acter findByName(@Param("name") String name);
  
}
