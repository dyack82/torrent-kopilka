package com.dyack.kopilka.repository;

import com.dyack.kopilka.entity.Comment;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

    @Query("select b from Comment b where film_id = :id")
    public List<Comment> findById(@Param("id") int id);

//    @Query(value = "SELECT userx.login, userx.image, comment.date, comment.text FROM film JOIN userx JOIN comment ON "
//            + "comment.comment__film_id = film.film_id AND "
//            + "comment.comment__userx_id = userx.userx_id "
//            + "where film_id = :id", nativeQuery = true)
//    List<String[][][][]> findCommentById(@Param("id") String id);
}
