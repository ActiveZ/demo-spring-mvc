package dev.demospringmvc.controller;

import org.springframework.web.bind.annotation.*;


@RestController //  = @Controller + @ResponseBody
@RequestMapping("plats") // requêtes en /plats
public class PlatCtrl {
    @GetMapping("hello1")
    // au total pour ma requête => GET /plats/hello1
    public String bonjour() {
        return "hello 1 depuis PlatCtrl";
    }

    @GetMapping("hello2")
    public String bonjour2(@RequestParam String prenom, @RequestParam String nom) {
        return "Hello " + prenom + " " + nom;
    }

    @GetMapping("hello3/{prenom}/{nom}/details")
    // hello3/{nom}/{prenom}/details?age=X
    public String bonjour3(@RequestParam Integer age, @PathVariable String prenom, @PathVariable String nom) {
        return "Hello " + prenom + " " + nom + " age : " + age;
    }

    @GetMapping("hello4/{prenom}/{nom}/details")
// hello4/{nom}/{prenom}/details?age=X
    public String bonjour4(
            @RequestParam Integer age,
            @PathVariable String prenom,
            @PathVariable String nom,
            @RequestHeader("User-Agent") String userAgent,
            @RequestHeader("mon-entete-a-moi") String monEntete,
            @RequestBody String texte) {
        return "Hello " + prenom + " " + nom + " age : " + age
                + "\nUser Agent : " + userAgent
                + "\nmon entête : " + monEntete
                + "\ncorps : " + texte;
    }
}