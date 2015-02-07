package com.dyack.kopilka.service;

import com.dyack.kopilka.entity.*;
import java.util.List;
import java.util.Set;
import org.springframework.data.domain.Page;

public interface ContentService {

    Film addFilm(Film film);
    void delete(int id);
    Film getById(int id);
    Film getByName(String name);
    Film editFilm(Film film);
    List<Film> getAll();

    Acter addActer(Acter acter);   
    Category addCategory(Category category);
    Producer addProducer(Producer producer);
    Country addCountry(Country country);
    Genre addGenre(Genre genre);
        
    List<Genre> addArrGenre(List<Genre> genres);
    List<Acter> addArrActer(List<Acter> acters);
        List<Producer> addArrProducer(List<Producer> producers);   
    List<Country> addArrCountry(List<Country> countrys);
    List<Trailer> addArrTrailer(List<Trailer> trailers);
    List<Comment> addArrComment(List<Comment> comments);
    List<Torrent> addArrTorrent(List<Torrent> torrents);
    
        Comment addComment(Comment comment);
    
    List<Genre> getGenresById(int id);
    List<Producer> getProducersById(int id);
    List<Country> getCountrysById(int id);
    List<Trailer> getTrailersById(int id);
    List<Comment> getCommentsById(int id);
    List<Torrent> getTorrentsById(int id);
    
    List<User> getUserById(int id);
    
    Film getMinFilmById(int id);
    
//    List<Comment> addArrComment(Set<Comment> comments);

//    Image addImage(Image image);

    Star addStar(Star star);
//
//    public List<User> getUser(int id);

    public List<Category> getCategoryByFilmId(int id);
    
    Page<Film> findLastAdded(int amount); // id - kol-vo vivodimih suchnostey


}
