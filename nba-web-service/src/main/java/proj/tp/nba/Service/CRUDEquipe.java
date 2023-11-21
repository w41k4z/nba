package proj.tp.nba.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proj.tp.nba.Entity.Equipe;
import proj.tp.nba.Repository.EquipeRepository;

@Service
public class CRUDEquipe {

    @Autowired
    EquipeRepository equiperep;

    public List<Equipe>getEquipeList() {
        return equiperep.findAll();
    }

    public void deleteEquipeByID(Integer id) {
        equiperep.deleteById(id);

    }

    public Equipe postEquipe(Equipe equipe) {
        return equiperep.save(equipe);
    }

    public Equipe getEquipeByID(Integer id) {
        try {
            return equiperep.findById(id).get();
        } catch (java.util.NoSuchElementException e) {
            return null;
        }
    }
}
