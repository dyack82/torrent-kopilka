package com.dyack.secure.repository;

import com.dyack.secure.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ContentRepository extends JpaRepository<Film, Long> {

    @Query("select b from Film b where b.id = :id")
    Film findById(@Param("id") long id);

    @Query("select b from Film b where b.name = :name")
    Film findByName(@Param("name") String name);

}
