package com.dyack.kopilka.repository;

import com.dyack.kopilka.entity.Producer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProducerRepository extends JpaRepository<Producer, Integer> {
    
    @Query("select b from Producer b where film_id = :id")
    public List<Producer> findById(@Param("id") int id);
    
//    @Query(value = "SELECT directed_bi.name FROM film JOIN directed_bi JOIN directed_bi_film ON "
//            + "directed_bi_film.directed_bi_film__film_id = film.film_id AND "
//            + "directed_bi_film.directed_bi_film__directed_bi_id = directed_bi.directed_bi_id "
//            + "where film_id = :id", nativeQuery = true)
//    List<String> findDirected_biById(@Param("id")String id); 
}