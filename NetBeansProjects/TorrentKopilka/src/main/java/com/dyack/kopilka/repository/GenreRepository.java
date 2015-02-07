package com.dyack.kopilka.repository;

import com.dyack.kopilka.entity.Genre;
import java.util.List;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
    
        @Query("select b from Genre b where film_id = :id")
    public List<Genre> findById(@Param("id") int id);

//    @Query(value = "SELECT genre.name FROM film JOIN genre JOIN genre_film ON "
//            + "genre_film.genre_film__film_id = film.film_id AND "
//            + "genre_film.genre_film__genre_id = genre.genre_id "
//            + "where film_id = :id", nativeQuery = true)
//    List<String> findGenreById(@Param("id")String id); 
}