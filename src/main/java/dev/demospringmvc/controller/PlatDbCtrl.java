package dev.demospringmvc.controller;

import dev.demospringmvc.entities.Plat;
import dev.demospringmvc.services.PlatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("plats")
public class PlatDbCtrl {

    private PlatService platService;

    public PlatDbCtrl(PlatService platService) {
        this.platService = platService;
    }

    @GetMapping
    public List<Plat> lister() {
        return this.platService.listerPlats();
    }

    @PostMapping
    public Plat creer(@RequestBody Plat plat) {
        return this.platService.creerPlat(plat);
    }
}