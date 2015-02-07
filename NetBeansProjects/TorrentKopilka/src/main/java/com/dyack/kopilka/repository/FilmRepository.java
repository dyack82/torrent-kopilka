package com.dyack.kopilka.repository;

import com.dyack.kopilka.entity.Film;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FilmRepository extends JpaRepository<Film, Integer> {

    @Query("select b from Film b where b.id = :id")
    public Film findById(@Param("id") int id);

    @Query("select b from Film b where b.name = :name")
    public Film findByName(@Param("name") String name);

    @Query(value = "SELECT film.id, film.name, original_name, age_group, duration, description, image_prefix, release_date, category_id "
            + "FROM film WHERE film.id = :id", nativeQuery = true)
    public Film getMinFilmById(int id);
    
    @Override
    public Page<Film> findAll(Pageable pgbl);

}
