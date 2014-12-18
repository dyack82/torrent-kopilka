package com.dyack.secure.service;

import com.dyack.secure.entity.Film;
import java.util.List;

public interface ContentService {

    Film addFilm(Film film);
    void delete(long id);
    Film getById(long id);
    Film getByName(String name);
    Film editFilm(Film film);
    List<Film> getAll();
    List<Film> get10LastAdded();
}
