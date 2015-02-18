package com.dyack.kopilka.service;

import com.dyack.kopilka.entity.*;
import java.util.List;
import java.util.Set;
import org.springframework.data.domain.Page;

public interface ContentService {

    public Film addFilm(Film film);
    public void delete(int id);
    public Film getById(int id);
    public Film getByName(String name);
    public Film editFilm(Film film);
    public List<Film> getAll();

    public Acter addActer(Acter acter);   
    public Category addCategory(Category category);
    public Producer addProducer(Producer producer);
    public Country addCountry(Country country);
    public Genre addGenre(Genre genre);
    public Trailer addTrailer(Trailer trailer);
        
    public List<Genre> addArrGenre(List<Genre> genres);
    public List<Acter> addArrActer(List<Acter> acters);
    public List<Producer> addArrProducer(List<Producer> producers);   
    public List<Country> addArrCountry(List<Country> countrys);
    public List<Trailer> addArrTrailer(List<Trailer> trailers);
    public List<Comment> addArrComment(List<Comment> comments);
    public List<Torrent> addArrTorrent(List<Torrent> torrents);
    
    public Comment addComment(Comment comment);
    
    public List<Genre> getGenresById(int id);
    public List<Producer> getProducersById(int id);
    public List<Country> getCountrysById(int id);
    public List<Trailer> getTrailersById(int id);
    public List<Comment> getCommentsById(int id);
    public List<Torrent> getTorrentsById(int id);
    
    public List<User> getUserById(int id);
    
    public Film getMinFilmById(int id);
    
//    List<Comment> addArrComment(Set<Comment> comments);

//    Image addImage(Image image);

    public Star addStar(Star star);
//
//    public List<User> getUser(int id);

    public List<Category> getCategoryByFilmId(int id);
    
    public Page<Film> findLastAdded(int amount); // id - kol-vo vivodimih suchnostey
    public List<Torrent> findTorrentByFilmId(int id);

    public List<Object> findTopDownloads();

    

}
