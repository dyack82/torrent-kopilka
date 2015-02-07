package com.dyack.kopilka.controller;

import com.dyack.kopilka.controller.request.RequestAddContent;
import com.dyack.kopilka.entity.Country;
import com.dyack.kopilka.entity.Film;
import com.dyack.kopilka.entity.User;
import com.dyack.kopilka.service.ContentService;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MainController {

    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    ContentService contentService;

    RequestAddContent requestAddContent;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        System.out.println("==== / ====");
        return "index";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admins(Locale locale, Model model) {
        System.out.println("==== /admin ====");
        return "admin";
    }

    @RequestMapping(value = "/newCont", method = RequestMethod.PUT, headers = "Content-Type=application/json") // , headers = "Content-Type=application/json"
    @ResponseStatus(HttpStatus.CREATED)			// 
    public void newFilm(@RequestBody Map<String, String> request) { // @RequestBody Object f // HttpServletRequest request
        System.out.println("==== /newCont ====");
        for (Map.Entry<String, String> tmp : request.entrySet()) {
            System.out.println(tmp.getKey() + " : " + tmp.getValue());
        }
        requestAddContent = new RequestAddContent(); // 
        requestAddContent.SaveFilm(contentService, request);
    }

    @RequestMapping(value = "/findLastAdded/{amount}", method = RequestMethod.GET)
    public @ResponseBody
    Page<Film> getById(@PathVariable int amount) {
        System.out.println("==== //{id} -- findAll ====");
        return contentService.findLastAdded(amount);
    }

}

//    @RequestMapping(value = "/searchContent", method = RequestMethod.GET)
//    public @ResponseBody
//    Film searchContent(@RequestParam String text) {
//        return contentService.getByName(text);
//    }
//    @RequestMapping(value = "getLast", method = RequestMethod.GET) // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    public @ResponseBody
//    List<FilmResponceById> getLast(@RequestParam int count) {
//        
////        ResponseLastCount rlc = new ResponseLastCount();
////         contentServiceResponse.getIdLastAddedOnCount(count);
//        return new ResponseLastCount(contentService, contentServiceResponse, count).getRespList();
//    }
//    @RequestMapping(value = "getAll", method = RequestMethod.GET) // vse filmi /value = ""(tolko JSON)
//    public @ResponseBody
//    List<Film> getAll() {
//        return contentService.getAll();
//    }
//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public void createFilm() {
//        film = new Film();
//        film.setName("Mat");
//        film.setOriginalName("Matrix");
//        contentService.addFilm(film);
//    }
//    @RequestMapping(value = "/lastAdded", method = RequestMethod.GET)
//    public @ResponseBody
//    List<Film> getLastAdded() {
//        return contentService.getLastAdded();
//    }
//    @RequestMapping(value = "/findAll/{x}", method = RequestMethod.GET) // kolichestvo vozvrashennih filmov
//    public @ResponseBody
//    Page<Film> getLastX(@PathVariable int x) {
//
//        return contentService.findAll(x);
//    }
//    @RequestMapping({"/login2"})  // GET
//    public String showLoginPage2() {
//        return "login2";
//    }
//    public String postHandler(@RequestParam(value = "email") String email, @RequestParam(value = "password") String password)  {
//        System.err.println("********************************************************");
//        System.err.println("password=" + password);
//        System.err.println("email=" + email);
//        System.err.println("********************************************************");
//        if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
//            return "index";
//        }
//        return null;
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
//}
