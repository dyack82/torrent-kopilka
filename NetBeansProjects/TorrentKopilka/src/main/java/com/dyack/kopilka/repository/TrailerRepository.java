package com.dyack.kopilka.repository;

import com.dyack.kopilka.entity.Trailer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TrailerRepository extends JpaRepository<Trailer, Integer> {

    @Query("select b from Trailer b where film_id = :id")
    public List<Trailer> findById(@Param("id") int id);

//    @Query("select b from Trailer b where b.film_film_id = :id")
//    List<Trailer> findTrailerByFilmId(@Param("id") int id);
}
