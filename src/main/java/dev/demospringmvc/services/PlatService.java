package dev.demospringmvc.services;

import dev.demospringmvc.entities.Plat;
import dev.demospringmvc.repositories.PlatRepo;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PlatService {

    private PlatRepo platRepo;

    public PlatService(PlatRepo platRepo){
        this.platRepo=platRepo;
    }

    public List<Plat> listerPlats() {
        return this.platRepo.findAll(Sort.sort(Plat.class).by(Plat::getNom));
    }

    @Transactional // remplace le begin transaction et commit
    public Plat creerPlat(Plat plat) {
        return this.platRepo.save(plat);
    }
}
