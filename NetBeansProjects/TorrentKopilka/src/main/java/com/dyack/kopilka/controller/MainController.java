package com.dyack.kopilka.controller;

import com.dyack.kopilka.controller.responce.FilmResponce;
import com.dyack.kopilka.controller.responce.Response;
import com.dyack.kopilka.entity.Film;
import com.dyack.kopilka.service.ContentService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.apache.log4j.Logger;

@Controller
@RequestMapping("/")
public class MainController {

//    private static final Logger logger = Logger.getLogger(MainController.class);
    @Autowired
    ContentService contentService;

    Film film;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home2(Locale locale, Model model) {
        return "index";
    }

    @RequestMapping(value = "/searchContent", method = RequestMethod.GET)
    public @ResponseBody
    Film searchContent(@RequestParam String text) {
        return contentService.getByName(text);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public @ResponseBody
    List<Film> getAll() {
        return contentService.getAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public void createFilm() {
        film = new Film();
//        film.setName("Matrix5");
//        film.setReleased("2012");
//        film.setCountry("Australia");
        contentService.addFilm(film);
    }

    @RequestMapping(value = "/lastAdded", method = RequestMethod.GET)
    public @ResponseBody
    List<Film> getLastAdded() {
        return contentService.getLastAdded();
    }

//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public String createBank(ModelMap model) {
////        Bank 
//        bank = new Bank();
//        bank.setId(5);
//        bank.setName("Privat123");
//
//        bankService.addBank(bank);
//        return "indexS";
//    }
//        @RequestMapping(value = "/getAll", method = RequestMethod.GET)
//    public @ResponseBody
//    Film getAll() {
//        System.err.println("**********************");
//        System.err.println("getAll =========== ");
////        FilmResponce filmResponse = new FilmResponce();
//            film = new Film();
//            film = contentService.getById(1);           
////            filmResponse.setName(film.getName());
//        return film;
//    }
//    @RequestMapping(value = "/searchContent", method = RequestMethod.GET)
//    public @ResponseBody
//    Response getCharNum(@RequestParam String text) {
//        Response result = new Response();
//        if (text != null) {
//            bank = new Bank();
//            bank = bankService.getById(Long.parseLong(text));        
//            result.setText(bank.getName());
//            result.setCount(text.length());
//        }
//        return result;
//    }
    //    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public String getAllMovie(ModelMap model) {
//
//        Bank bank = new Bank();
////        bank.setId(1);
//        bank.setName("Privat");
//
//        BankService b = new BankServiceImpl();
//        b.addBank(bank);
//
//        model.addAttribute("name", "MainController - WORK - no name");
//        model.addAttribute("janr", "Triller ...");
//        model.addAttribute("kach", "HDRip");
//        model.addAttribute("size", "1.36GB");
//        model.addAttribute("movie", "*** ");
//        return "indexS";
//    }
//    private static Logger logger = Logger.getLogger(MainController.class.getName());
    // @Autowired - ???
//    private EntityDao entity;
//    
////    @Inject 
////    @Autowired
//    public MainController(){
//        this.entity = new EntityDaoImpl();
//    }
//    
//    @RequestMapping(method = RequestMethod.GET)
//    public String getAllMovie(ModelMap model) { 
//        model.addAttribute("name", "MainController - WORK - no name");
//        model.addAttribute("janr", "Triller ...");
//        model.addAttribute("kach", "HDRip");
//        model.addAttribute("size", "1.36GB");
//        model.addAttribute("movie", "...");
//        return "indexS";
//    }
//    
//    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
//    public String getMovie(@PathVariable String name, ModelMap model) { 
//        
////        entity = new EntityDaoImpl();
//       model.addAttribute("name", "MainController - WORK + " + "*** " + name);
//        model.addAttribute("movie", "(MainController)/.name***() - " + entity.getName(name));
//        return "indexS";
//    }
//        @RequestMapping(method = RequestMethod.POST) 	// Обрабатывает POST-запросы			// Возвращает ответ HTTP 201
//    public @ResponseBody Spittle createSpittle(@Valid Spittle spittle, BindingResult result, HttpServletResponse response) throws BindException {
//        if (result.hasErrors()) {
//            throw new BindException(result);
//        }
//        spitterService.saveSpittle(spittle);
//        response.setHeader("Location", "/spittles/" + spittle.getId()); 	// Указать местоположение ресурса
//        return spittle; 		// Вернуть ресурс
//    }
}
