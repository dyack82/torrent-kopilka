package com.dyack.kopilka.repository;

import com.dyack.kopilka.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ContentRepository extends JpaRepository<Film, Long> {

    @Query("select b from Film b where b.id = :id")
    Film findById(@Param("id") long id);

    @Query("select b from Film b where b.name = :name")
    Film findByName(@Param("name") String name);

    @Query("select b from Film b where b.name = Titanic")
    List<Film> get10LastAdded();

}
