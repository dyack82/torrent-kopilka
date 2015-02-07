package com.dyack.kopilka.test.util;

import com.dyack.kopilka.entity.*;
import java.util.*;

public class FilmUtil {

    public static Film createFilm() {
        Film f = new Film();
        f.setName("Buratino");
//        f.setAdd_date(new Date());
//        
//        List<Category> c = new ArrayList<>();
//        Category cat = new Category();
//        cat.setName("triller");
////        cat.setFilms((Set<Film>) f);
//        c.add(cat);
//        
////        Set<Category> categori;
////        categori = c;
//        f.setCategories(c);

        return f;
    }

}
