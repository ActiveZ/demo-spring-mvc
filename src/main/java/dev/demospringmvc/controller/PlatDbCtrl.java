package dev.demospringmvc.controller;

import dev.demospringmvc.entities.Plat;
import dev.demospringmvc.services.PlatService;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> creer(@RequestBody Plat plat) {
        return ResponseEntity.status(201)
                .header("en-tete1","mon en-tete")
                .body(this.platService.creerPlat(plat));
//        return this.platService.creerPlat(plat);
    }
}