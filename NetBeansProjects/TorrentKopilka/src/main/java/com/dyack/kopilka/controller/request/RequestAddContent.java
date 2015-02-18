package com.dyack.kopilka.controller.request;

import com.dyack.kopilka.entity.*;
import com.dyack.kopilka.service.ContentService;
import java.util.*;
import org.joda.time.DateTime;

public class RequestAddContent {

    Film film;
    Film respFilm;
    String imagePrefix = "2015-01";
    List<Producer> arrProducer;
    Producer producer;
    List<Producer> respArrProducer;
    Category category;
    Category respCat;
    Star star;
    Star respStar;
    List<Country> arrCountry;
    Country country;
    List<Country> respArrCountry;
    List<Genre> arrGenre;
    Genre genre;
    List<Acter> arrActer;
    Acter acter;
    Trailer trailer;
    Set<Trailer> respTrailer;

    public RequestAddContent() {
    }

    public void SaveFilm(ContentService contentService, Map<String, String> request) {

        if (!"".equals(request.get("originalName"))) {
            film = new Film();
            film.setOriginalName(request.get("originalName"));
            film.setAddDate(new Date());
            film.setDownloadsCount(0);
            film.setImagePrefix(imagePrefix);
            if (!"".equals(request.get("name"))) {
                film.setName(request.get("name"));
            }
            if (!"".equals(request.get("ageGroup"))) {
                film.setAgeGroup(Integer.parseInt(request.get("ageGroup")));
            }
            if (!"".equals(request.get("description"))) {
                film.setDescription(request.get("description"));
            }
            if (!"".equals(request.get("duration"))) {
                film.setDuration(Integer.parseInt(request.get("duration")));
            }
            if (!"".equals(request.get("releaseDate"))) {
                film.setReleaseDate(new DateTime(request.get("releaseDate")).toDate());
            }
            if (!"".equals(request.get("trailerLink"))) {
                trailer = new Trailer();
                trailer.setLink(request.get("trailerLink"));
//                respTrailer = contentService.addTrailer(trailer);
                film.setTrailers(null);
            }
            if (!"".equals(request.get("category"))) {
                category = new Category();
                category.setName(request.get("category"));
                respCat = contentService.addCategory(category);
                film.setCategory(respCat);
            }
            if (!"".equals(request.get("ratingSum"))
                    && !"".equals(request.get("ratingCount"))
                    && !"".equals(request.get("ratingKinopoisk"))) {
                star = new Star();
                star.setSumma(Integer.parseInt(request.get("ratingSum")));
                star.setCount(Integer.parseInt(request.get("ratingCount")));
                star.setKinopoisk(request.get("ratingKinopoisk"));
                respStar = contentService.addStar(star);
                film.setStar(respStar);
            }
            if (!"".equals(request.get("onlineLink"))) {
                film.setOnline(request.get("onlineLink"));
            }

            respFilm = contentService.addFilm(film);

            if (!"".equals(request.get("producer1"))
                    || !"".equals(request.get("producer2"))
                    || !"".equals(request.get("producer3"))) {
                arrProducer = new ArrayList<>();
                for (int i = 1; i <= 3; i++) {
                    if (!"".equals(request.get("producer" + i))) {
                        producer = new Producer(request.get("producer" + i));
                        producer.setFilmProducer(respFilm);
                        arrProducer.add(producer);
                    }
                }
                respArrProducer = contentService.addArrProducer(arrProducer);
                Set<Producer> setRespArrProducer = new HashSet<>(respArrProducer);
                film.setProducers(setRespArrProducer);
            }
            if (!"".equals(request.get("country1"))
                    || !"".equals(request.get("country2"))
                    || !"".equals(request.get("country3"))
                    || !"".equals(request.get("country4"))
                    || !"".equals(request.get("country5"))) {
                arrCountry = new ArrayList<>();
                for (int i = 1; i <= 5; i++) {
                    if (!"".equals(request.get("country" + i))) {
                        country = new Country(request.get("country" + i));
                        country.setFilmCountry(respFilm);
                        arrCountry.add(country);
                    }
                }
                respArrCountry = contentService.addArrCountry(arrCountry);
                Set<Country> setRespArrCountry = new HashSet<>(respArrCountry);
                film.setCountrys(setRespArrCountry);
            }
            if (!"".equals(request.get("genre1"))
                    || !"".equals(request.get("genre2"))
                    || !"".equals(request.get("genre3"))
                    || !"".equals(request.get("genre4"))
                    || !"".equals(request.get("genre5"))) {
                arrGenre = new ArrayList<>();
                for (int i = 1; i <= 5; i++) {
                    if (!"".equals(request.get("genre" + i))) {
                        genre = new Genre(request.get("genre" + i));
                        genre.setFilmGenre(respFilm);
                        arrGenre.add(genre);
                    }
                }
                List<Genre> respArrGenre = contentService.addArrGenre(arrGenre);
                Set<Genre> setRespArrGenre = new HashSet<>(respArrGenre);
                film.setGenres(setRespArrGenre);
            }
            if (!"".equals(request.get("acter1"))
                    || !"".equals(request.get("acter2"))
                    || !"".equals(request.get("acter3"))
                    || !"".equals(request.get("acter4"))
                    || !"".equals(request.get("acter5"))
                    || !"".equals(request.get("acter6"))
                    || !"".equals(request.get("acter7"))
                    || !"".equals(request.get("acter8"))
                    || !"".equals(request.get("acter9"))
                    || !"".equals(request.get("acter10"))) {
                arrActer = new ArrayList<>();
                for (int i = 1; i <= 10; i++) {
                    if (!"".equals(request.get("acter" + i))) {
                        acter = new Acter(request.get("acter" + i));
                        acter.setFilmActer(respFilm);
                        arrActer.add(acter);
                    }
                }
                List<Acter> respArrActer = contentService.addArrActer(arrActer);
                Set<Acter> setRespArrActer = new HashSet<>(respArrActer);
                film.setActers(setRespArrActer);
            }

        } else {
            System.out.println("--- NO DATA REQUEST ---");
        }
    }

    public void SaveTorrent(ContentService contentService, Map<String, String> request) {
        System.out.println("============================");
        Film respTorrent = contentService.getByName(request.get("nameFilm"));
        System.out.println("****************************************** " + respTorrent);

        List<Torrent> arrTorrent = new ArrayList<>();
        Torrent torrent = new Torrent();
        if (!"".equals(request.get("kachestvo"))) {
            torrent.setQuality(request.get("kachestvo"));
        }
        if (!"".equals(request.get("format"))) {
            torrent.setFormat(request.get("format"));
        }
        if (!"".equals(request.get("videoCodec"))) {
            torrent.setVideoCodec(request.get("videoCodec"));
        }
        if (!"".equals(request.get("sizeTorrentFile"))) {
            torrent.setSizeFile(request.get("sizeTorrentFile"));
        }
        if (!"".equals(request.get("perevod"))) {
            torrent.setAudioTransfer(request.get("perevod"));
        }
        if (!"".equals(request.get("subtitlesTorrent"))) {
            torrent.setSubtitles(request.get("subtitlesTorrent"));
        }
        if (!"".equals(request.get("audioCodec"))) {
            torrent.setAudioCodec(request.get("audioCodec"));
        }
        if (!"".equals(request.get("linkTorrent"))) {
            torrent.setTorrentLink("torrents/2015-01/" + request.get("linkTorrent"));
        }
        torrent.setAudio("");
        torrent.setVideo("");
        torrent.setFilmTorrent(respTorrent);
        arrTorrent.add(torrent);
//        torrent.setQuality("DVDScr-");
//        torrent.setFormat("AVI-");
//        torrent.setSizeFile("1,37 Gb-");
////        torrent.setSubtitles("–усские, јнглийские");
//        torrent.setTorrentLink("torrents/2015-01/The Imitation Game.torrent");
//        torrent.setAudio("MP3 2 ch, 256  бит/с");
//        torrent.setAudioCodec("MPEG Audio");
//        torrent.setAudioTransfer("–усский, ƒублированный");
//        torrent.setVideo("1910  бит/с, 720x304");
//        torrent.setVideoCodec("XviD");
//        torrent.setFilmTorrent(respFilm2);
//        arrTorrent.add(torrent);

        List<Torrent> respArrTorrent = contentService.addArrTorrent(arrTorrent);
        respTorrent.setTorrents(respArrTorrent);
        
        arrTorrent = null;
        torrent = null;
    }

}
