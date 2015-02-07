package com.dyack.kopilka.service.impl;

import com.dyack.kopilka.entity.*;
import com.dyack.kopilka.repository.*;
import com.dyack.kopilka.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    private ActerRepository acterRepository;

    @Autowired
    private ProducerRepository producerRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private GenreRepository genreRepository;

    @Autowired
    private TrailerRepository trailerRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private StarRepository starRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private TorrentRepository torrentRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Film addFilm(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public void delete(int id) {
        filmRepository.delete(id);
    }

    @Override
    public Film getById(int id) {
        return filmRepository.findById(id);
    }

    @Override
    public Film getByName(String name) {
        return filmRepository.findByName(name);
    }

    @Override
    public Film editFilm(Film film) {
        return filmRepository.saveAndFlush(film);
    }

    @Override
    public List<Film> getAll() {
        return filmRepository.findAll();
    }

    @Override
    public Acter addActer(Acter acter) {
        return acterRepository.saveAndFlush(acter);
    }

    @Override
    public Producer addProducer(Producer producer) {
        return producerRepository.saveAndFlush(producer);
    }

    @Override
    public Country addCountry(Country country) {
        return countryRepository.saveAndFlush(country);
    }

    @Override
    public Genre addGenre(Genre genre) {
        return genreRepository.saveAndFlush(genre);
    }
//    @Override
//    public Category addCategory(Category category) {
//        return categoryRepository.saveAndFlush(category);
//    }

    @Override
    public List<Genre> addArrGenre(List<Genre> genres) {
        return genreRepository.save(genres);
    }

    @Override
    public List<Trailer> addArrTrailer(List<Trailer> trailers) {
        return trailerRepository.save(trailers);
    }

    @Override
    public Comment addComment(Comment comment) {
        return commentRepository.saveAndFlush(comment);
    }

    @Override
    public Star addStar(Star star) {
        return starRepository.saveAndFlush(star);
    }

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.saveAndFlush(category);
    }

    @Override
    public List<Acter> addArrActer(List<Acter> acters) {
        return acterRepository.save(acters);
    }

    @Override
    public List<Producer> addArrProducer(List<Producer> producers) {
        return producerRepository.save(producers);
    }

    @Override
    public List<Country> addArrCountry(List<Country> countrys) {
        return countryRepository.save(countrys);
    }

    @Override
    public List<Comment> addArrComment(List<Comment> comments) {
        return commentRepository.save(comments);
    }

    @Override
    public List<Torrent> addArrTorrent(List<Torrent> torrents) {
        return torrentRepository.save(torrents);
    }

    @Override
    public List<Genre> getGenresById(int id) {
        return genreRepository.findById(id);
    }

    @Override
    public List<Producer> getProducersById(int id) {
        return producerRepository.findById(id);
    }

    @Override
    public List<Country> getCountrysById(int id) {
        return countryRepository.findById(id);
    }

    @Override
    public List<Trailer> getTrailersById(int id) {
        return trailerRepository.findById(id);
    }

    @Override
    public List<Comment> getCommentsById(int id) {
        return commentRepository.findById(id);
    }

    @Override
    public List<Torrent> getTorrentsById(int id) {
        return torrentRepository.findById(id);
    }

    @Override
    public List<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public Film getMinFilmById(int id) {
        return filmRepository.getMinFilmById(id);
    }

    @Override
    public List<Category> getCategoryByFilmId(int id) {
        return categoryRepository.getCategoryByFilmId(id);
    }

    @Override
    public Page<Film> findLastAdded(int amount) {
        final PageRequest page = new PageRequest(0, amount, Direction.ASC, "id");//1-x
        return filmRepository.findAll(page);
    }
}
