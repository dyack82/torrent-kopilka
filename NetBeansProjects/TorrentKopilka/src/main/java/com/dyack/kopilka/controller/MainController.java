package com.dyack.kopilka.controller;

import com.dyack.kopilka.controller.request.RequestAddContent;
import com.dyack.kopilka.entity.Country;
import com.dyack.kopilka.entity.Film;
import com.dyack.kopilka.entity.Torrent;
import com.dyack.kopilka.entity.User;
import com.dyack.kopilka.service.ContentService;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import org.springframework.web.bind.annotation.RequestParam;
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
    
    @RequestMapping(value = "/newTorrent", method = RequestMethod.PUT, headers = "Content-Type=application/json") // , headers = "Content-Type=application/json"
    @ResponseStatus(HttpStatus.CREATED)			// 
    public void newTorrent(@RequestBody Map<String, String> request) { 
        System.out.println("==== /newTorrent ====");
        for (Map.Entry<String, String> tmp : request.entrySet()) {
            System.out.println(tmp.getKey() + " : " + tmp.getValue());
        }
        requestAddContent = new RequestAddContent(); // 
        requestAddContent.SaveTorrent(contentService, request);
    }

    @RequestMapping(value = "/getLastAdded/{amount}", method = RequestMethod.GET)
    public @ResponseBody
    Page<Film> getById(@PathVariable int amount) {
        System.out.println("==== /getLastAdded/{amount} ====");
        return contentService.findLastAdded(amount);
    }

    @RequestMapping(value = "/getTorrentByFilmId", method = RequestMethod.GET)
    public @ResponseBody
    List<Torrent> getTorrentByFilmId(@RequestParam int id) {
        System.out.println("==== /getTorrentByFilmId ==== id = " + id);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contentService.findTorrentByFilmId(id);
    }
    
    @RequestMapping(value = "/getTopDownloads", method = RequestMethod.GET)
    public @ResponseBody
    List<Object> getTopDownloads() {
        System.out.println("==== /getTopDownloads ");
        return contentService.findTopDownloads();
    }
    
    

}
