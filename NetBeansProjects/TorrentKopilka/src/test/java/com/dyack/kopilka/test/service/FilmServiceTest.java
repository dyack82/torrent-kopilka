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
//        category.setName("�������������� �����");
//        Category respCat = contentService.addCategory(category);
//
//        Star star = new Star();
//        star.setSumma(779);
//        star.setCount(100);
//        star.setKinopoisk("635772");
//        Star respStar = contentService.addStar(star);
//
//        Film film = new Film();
//        film.setName("���� � ��������");
//        film.setOriginalName("The Imitation Game");
//        film.setAgeGroup(12);
//        film.setDuration(114);
//        film.setDescription("���������� ��������� � ����� ���� ������� �������� �������� ��� Enigma �� ����� ������ ������� �����.");
//        film.setDownloadsCount(40);
//        film.setImagePrefix("2015-01");
//        film.setAddDate(new Date());
//        film.setReleaseDate(new DateTime("2014-08-29").toDate());
//        film.setCategory(respCat);
//        film.setStar(respStar);
//        film.setOnline("http://www.tvcok.ru/film/igra-v-imitatsiyu.html");
//        Film respFilm = contentService.addFilm(film);
//
//        List<Genre> arrGenre = new ArrayList<>();
//        Genre genre = new Genre("�������");
//        genre.setFilmGenre(respFilm);
//        arrGenre.add(genre);
//        genre = new Genre("�����");
//        genre.setFilmGenre(respFilm);
//        arrGenre.add(genre);
//        genre = new Genre("�������");
//        genre.setFilmGenre(respFilm);
//        arrGenre.add(genre);
//        genre = new Genre("��������������");
//        genre.setFilmGenre(respFilm);
//        arrGenre.add(genre);
//        List<Genre> respArrGenre = (contentService.addArrGenre(arrGenre));
//        Set<Genre> setRespArrGenre = new HashSet<>(respArrGenre);
//        film.setGenres(setRespArrGenre);
//
//        List<Acter> arrActer = new ArrayList<>();
//        Acter acter = new Acter("�������� ����������");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        acter = new Acter("���� ������");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        acter = new Acter("������ ���");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        acter = new Acter("���� ������");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        acter = new Acter("����� ���");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        acter = new Acter("������ ����");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        acter = new Acter("������ ����");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        acter = new Acter("���� ������");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        acter = new Acter("������ �������");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        acter = new Acter("��� ������-����");
//        acter.setFilmActer(respFilm);
//        arrActer.add(acter);
//        List<Acter> respArrActer = contentService.addArrActer(arrActer);
//        Set<Acter> setRespArrActer = new HashSet<>(respArrActer);
//        film.setActers(setRespArrActer);
//
//        List<Producer> arrProducer = new ArrayList<>();
//        Producer producer = new Producer("������ �������");
//        producer.setFilmProducer(respFilm);
//        arrProducer.add(producer);
//        List<Producer> respArrProducer = contentService.addArrProducer(arrProducer);
//        Set<Producer> setRespArrProducer = new HashSet<>(respArrProducer);
//        film.setProducers(setRespArrProducer);
//
//        List<Country> arrCountry = new ArrayList<>();
//        Country country = new Country("��������������");
//        country.setFilmCountry(respFilm);
//        arrCountry.add(country);
//        country = new Country("���");
//        country.setFilmCountry(respFilm);
//        arrCountry.add(country);
//        List<Country> respArrCountry = contentService.addArrCountry(arrCountry);
//        Set<Country> setRespArrCountry = new HashSet<>(respArrCountry);
//        film.setCountrys(setRespArrCountry);
//
//        List<Trailer> arrTrailer = new ArrayList<>();
//        Trailer trailer = new Trailer();
//        trailer.setLink("http://youtu.be/Kd0mHntFGH0");
//        trailer.setDescription("�������, �������������");
//        trailer.setFilmTrailer(respFilm);
//        arrTrailer.add(trailer);
//        List<Trailer> respArrTrailer = contentService.addArrTrailer(arrTrailer);
//        Set<Trailer> setRespArrTrailer = new HashSet<>(respArrTrailer);
//        film.setTrailers(setRespArrTrailer);
//
//        List<Comment> arrComment = new ArrayList<>();
//        Comment comment = new Comment();
//        comment.setTextComment("�������� �������. ����� ����� ����������, �� �� ��������. \"������ �� �������� ���� ����� ������� ����� ���������\". "
//                + "������� ������� ��� �� ����� ���� �������....... � ������ � ��� � ������ ���������� ������ ���� �� �����������.");
//        comment.setUsername("������� ���������");
//        comment.setAddDate(new Date());
//        comment.setFilmComment(respFilm);
//        arrComment.add(comment);
//        List<Comment> respArrComment = contentService.addArrComment(arrComment);
//        Set<Comment> setRespArrComment = new HashSet<>(respArrComment);
//        film.setComments(setRespArrComment);
//
//        List<Torrent> arrTorrent = new ArrayList<>();
//        Torrent torrent = new Torrent();
//        torrent.setQuality("DVDScr");
//        torrent.setFormat("AVI");
//        torrent.setSizeFile("1,37 Gb");
////        torrent.setSubtitles("�������, ����������");
//        torrent.setTorrentLink("torrents/2015-01/The Imitation Game.torrent");
//        torrent.setAudio("MP3 2 ch, 256 ����/�");
//        torrent.setAudioCodec("MPEG Audio");
//        torrent.setAudioTransfer("�������, �������������");
//        torrent.setVideo("1910 ����/�, 720x304");
//        torrent.setVideoCodec("XviD");
//        torrent.setFilmTorrent(respFilm);
//        arrTorrent.add(torrent);
//      
////        torrent = new Torrent();
////        torrent.setQuality("BDRip");
////        torrent.setFormat("AVI");
////        torrent.setSizeFile("4,20 Gb");
////        torrent.setSubtitles("���");
////        torrent.setTorrentLink("torrents/2015-01/Torrent-Kopilka-x.torrent");
////        torrent.setAudio("mp2, 2 ch, 256 kbit/c ");
////        torrent.setAudioCodec("MPEG Audio");
////        torrent.setAudioTransfer("������������ �������");
////        torrent.setVideo("MPEG-4 AVC, 5000 kbit/c, 320x240");
////        torrent.setVideoCodec("H.26x");
////        torrent.setFilmTorrent(respFilm);
////        arrTorrent.add(torrent);
//        
//        List<Torrent> respArrTorrent = contentService.addArrTorrent(arrTorrent);
//        film.setTorrents(respArrTorrent);

    }
}
