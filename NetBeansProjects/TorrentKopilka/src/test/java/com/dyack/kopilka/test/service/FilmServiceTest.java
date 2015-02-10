package com.dyack.kopilka.test.service;

import com.dyack.kopilka.entity.*;
import com.dyack.kopilka.service.ContentService;
import com.dyack.kopilka.test.config.TestDataBaseConfig;
//import com.dyack.kopilka.test.util.FilmUtil;
import java.util.*;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import org.springframework.beans.factory.annotation.Autowired;

@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDataBaseConfig.class)
@WebAppConfiguration
public class FilmServiceTest {

    @Autowired
    private ContentService contentService;

    @Test
    public void testSaveFilm() throws Exception {

//        Category category = new Category();
//        category.setName("Художественный фильм");
//        Category respCat = contentService.addCategory(category);
//
//        Star star = new Star();
//        star.setSumma(779);
//        star.setCount(100);
//        star.setKinopoisk("635772");
//        Star respStar = contentService.addStar(star);
//
//        Film film = new Film();
//        film.setName("Игра в имитацию");
//        film.setOriginalName("The Imitation Game");
//        film.setAgeGroup(12);
//        film.setDuration(114);
//        film.setDescription("Английский математик и логик Алан Тьюринг помогает взломать код Enigma во время Второй мировой войны.");
//        film.setDownloadsCount(0);
//        film.setImagePrefix("2015-01");
//        film.setAddDate(new Date());
//        film.setReleaseDate(new DateTime("2014-08-29").toDate());
//        film.setCategory(respCat);
//        film.setStar(respStar);
//        film.setOnline("http://www.tvcok.ru/film/igra-v-imitatsiyu.html");
//        Film respFilm = contentService.addFilm(film);
//
//        List<Genre> arrGenre = new ArrayList<>();
//        Genre genre = new Genre("триллер");
//        genre.setFilmGenre(respFilm);
//        arrGenre.add(genre);
//        genre = new Genre("драма");
//        genre.setFilmGenre(respFilm);
//        arrGenre.add(genre);
//        genre = new Genre("военный");
//        genre.setFilmGenre(respFilm);
//        arrGenre.add(genre);
//        genre = new Genre("биографический");
//        genre.setFilmGenre(respFilm);
//        arrGenre.add(genre);
//        List<Genre> respArrGenre = (contentService.addArrGenre(arrGenre));
//        Set<Genre> setRespArrGenre = new HashSet<>(respArrGenre);
//        film.setGenres(setRespArrGenre);
//
//        List<Acter> arrActer = new ArrayList<>();
//        Acter acter = new Acter("Бенедикт Камбербэтч");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        acter = new Acter("Кира Найтли");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        acter = new Acter("Мэттью Гуд");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        acter = new Acter("Рори Киннер");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        acter = new Acter("Аллен Лич");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        acter = new Acter("Мэттью Бирд");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        acter = new Acter("Чарльз Дэнс");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        acter = new Acter("Марк Стронг");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        acter = new Acter("Джеймс Норткот");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        acter = new Acter("Том Гудман-Хилл");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        List<Acter> respArrActer = contentService.addArrActer(arrActer);
//        Set<Acter> setRespArrActer = new HashSet<>(respArrActer);
//        film.setActers(setRespArrActer);
//
//        List<Producer> arrProducer = new ArrayList<>();
//        Producer producer = new Producer("Мортен Тильдум");
//        producer.setFilmProducer(respFilm);
//        arrProducer.add(producer);
//        List<Producer> respArrProducer = contentService.addArrProducer(arrProducer);
//        Set<Producer> setRespArrProducer = new HashSet<>(respArrProducer);
//        film.setProducers(setRespArrProducer);
//
//        List<Country> arrCountry = new ArrayList<>();
//        Country country = new Country("Великобритания");
//        country.setFilmCountry(respFilm);
//        arrCountry.add(country);
//        country = new Country("США");
//        country.setFilmCountry(respFilm);
//        arrCountry.add(country);
//        List<Country> respArrCountry = contentService.addArrCountry(arrCountry);
//        Set<Country> setRespArrCountry = new HashSet<>(respArrCountry);
//        film.setCountrys(setRespArrCountry);
//
//        List<Trailer> arrTrailer = new ArrayList<>();
//        Trailer trailer = new Trailer();
//        trailer.setLink("http://youtu.be/Kd0mHntFGH0");
//        trailer.setDescription("Русский, Дублированный");
//        trailer.setFilmTrailer(respFilm);
//        arrTrailer.add(trailer);
//        List<Trailer> respArrTrailer = contentService.addArrTrailer(arrTrailer);
//        Set<Trailer> setRespArrTrailer = new HashSet<>(respArrTrailer);
//        film.setTrailers(setRespArrTrailer);
//
//        List<Comment> arrComment = new ArrayList<>();
//        Comment comment = new Comment();
//        comment.setTextComment("Качество хорошее. Фильм очень понравился, но на любителя. \"Иногда не значимые люди могут сделать много значимого\". "
//                + "Человек реально мог бы много чего достичь....... А теперь у них и законы поменялись только умов не прибавилось.");
//        comment.setUsername("Валерий Антонович");
//        comment.setAddDate(new Date());
//        comment.setFilmComment(respFilm);
//        arrComment.add(comment);
//        List<Comment> respArrComment = contentService.addArrComment(arrComment);
//        Set<Comment> setRespArrComment = new HashSet<>(respArrComment);
//        film.setComments(setRespArrComment);
//
//        List<Torrent> arrTorrent = new ArrayList<>();
//        Torrent torrent = new Torrent();
//        torrent.setQuality("DVDRip 3");
//        torrent.setFormat("MKV 3");
//        torrent.setSizeFile("1,36 Gb 3");
//        torrent.setSubtitles("Русские, Английские 3");
//        torrent.setTorrentLink("torrents/2015-01/Torrent-Kopilka-x.torrent 3");
//        torrent.setAudio("mp2, 2 ch, 256 kbit/c 3");
//        torrent.setAudioCodec("MPEG Audio");
//        torrent.setAudioTransfer("Русский, Дублированный 3");
//        torrent.setVideo("MPEG-4 AVC, 5000 kbit/c, 1920x1080 3");
//        torrent.setVideoCodec("H.26x 3");
//        torrent.setFilmTorrent(respFilm);
//        arrTorrent.add(torrent);
//      
//        torrent = new Torrent();
//        torrent.setQuality("BDRip 4");
//        torrent.setFormat("AVI 4");
//        torrent.setSizeFile("4,20 Gb 4");
//        torrent.setSubtitles("Нет 4");
//        torrent.setTorrentLink("torrents/2015-01/Torrent-Kopilka-x.torrent 4");
//        torrent.setAudio("mp2, 2 ch, 256 kbit/c  4");
//        torrent.setAudioCodec("MPEG Audio 4");
//        torrent.setAudioTransfer("Оригинальная дорожка 4");
//        torrent.setVideo("MPEG-4 AVC, 5000 kbit/c, 320x240 4");
//        torrent.setVideoCodec("H.26x 4");
//        torrent.setFilmTorrent(respFilm);
//        arrTorrent.add(torrent);
//        List<Torrent> respArrTorrent = contentService.addArrTorrent(arrTorrent);
//        film.setTorrents(respArrTorrent);

        
        
        
//int id = 1;
//        List<Object> respAllFilms = new ArrayList<>();
//        respAllFilms.add(contentService.findAll(id));
////        respAllFilms.add(contentService.getMinFilmById(id));
////        respAllFilms.add(contentService.getCategoryByFilmId(id));
////        System.out.println(contentService.findAll(id));
//        for (Object tmp : respAllFilms) {
//            System.out.println("---" + tmp);
//        }
    }
}
