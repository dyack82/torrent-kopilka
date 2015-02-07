package com.dyack.kopilka.repository;

import com.dyack.kopilka.entity.Category;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @Query(value = "SELECT category.name AS category_name FROM category JOIN film ON film.category_id = category.id WHERE film.id = :id", nativeQuery = true)
    public List<Category> getCategoryByFilmId(int id);

}
