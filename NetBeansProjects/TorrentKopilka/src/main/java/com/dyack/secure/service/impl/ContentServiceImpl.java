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
        Film savedFilm = contentRepository.saveAndFlush(film);
        return savedFilm;
    }

    @Override
    public void delete(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Film> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
