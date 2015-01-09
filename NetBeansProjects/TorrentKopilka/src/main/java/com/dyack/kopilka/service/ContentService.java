package com.dyack.kopilka.service;

import com.dyack.kopilka.entity.Film;
import java.util.List;

public interface ContentService {

    Film addFilm(Film film);
    void delete(long id);
    Film getById(long id);
    Film getByName(String name);
    Film editFilm(Film film);
    List<Film> getAll();
    List<Film> getLastAdded();
}
