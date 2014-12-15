package com.dyack.secure.service.impl;

import com.dyack.secure.entity.Film;
import com.dyack.secure.repository.ContentRepository;
import com.dyack.secure.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentRepository contentRepository;

    @Override
    public Film addFilm(Film film) {
//        Film savedFilm = contentRepository.saveAndFlush(film);
        return contentRepository.saveAndFlush(film);
    }

    @Override
    public void delete(long id) {
        contentRepository.delete(id);
    }
 
    @Override
    public Film getById(long id) {
        return contentRepository.findById(id);
    }

    @Override
    public Film getByName(String name) {
        return contentRepository.findByName(name);
    }

    @Override
    public Film editFilm(Film film) {
        return contentRepository.saveAndFlush(film);
    }

    @Override
    public List<Film> getAll() {
       return contentRepository.findAll();
    }

}
