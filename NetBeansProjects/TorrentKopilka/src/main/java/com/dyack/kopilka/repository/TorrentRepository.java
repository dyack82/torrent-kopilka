package com.dyack.kopilka.repository;

import com.dyack.kopilka.entity.Torrent;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TorrentRepository extends JpaRepository<Torrent, Integer> {

    @Query("select b from Torrent b where film_id = :id")
    public List<Torrent> findById(@Param("id") int id);

    @Query(value = "select * from torrent where film_id = :id", nativeQuery = true)
    public List<Torrent> findTorrentByFilmId(@Param("id") int id);

}
