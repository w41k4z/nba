package proj.tp.nba.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proj.tp.nba.Entity.Joueur;
import proj.tp.nba.Repository.JoueurRepository;

@Service
public class CRUDJoueur {
    @Autowired
    JoueurRepository joueurrepository;

    public List<Joueur> getJoueurList() {
        return joueurrepository.findAll();
    }

    public void deleteJoueurByID(Integer id) {
        joueurrepository.deleteById(id);

    }

    public Joueur postJoueur(Joueur joueur) {
        return joueurrepository.save(joueur);
    }

    public Joueur getJoueurByID(Integer id) {
        try {
            return joueurrepository.findById(id).get();
        } catch (java.util.NoSuchElementException e) {
            return null;
        }
    }

}
