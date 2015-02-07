package com.dyack.kopilka.repository;

import com.dyack.kopilka.entity.Country;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CountryRepository extends JpaRepository<Country, Integer> {

    @Query("select b from Country b where film_id = :id")
    public List<Country> findById(@Param("id") int id);

//    @Query(value = "SELECT country.name FROM film JOIN country JOIN country_film ON "
//            + "country_film.country_film__film_id = film.film_id AND "
//            + "country_film.country_film__country_id = country.country_id "
//            + "where film_id = :id", nativeQuery = true)
//    List<String> findCountryById(@Param("id") String id);
}
