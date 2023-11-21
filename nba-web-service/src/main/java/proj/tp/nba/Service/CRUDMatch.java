package proj.tp.nba.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proj.tp.nba.Entity.Match;
import proj.tp.nba.Repository.MatchRepository;

@Service
public class CRUDMatch {
    @Autowired
    MatchRepository matchrepository;

    public List<Match> getMatchList() {
        return matchrepository.findAll();
    }

    public void deleteMatchByID(Integer id) {
        matchrepository.deleteById(id);

    }

    public Match postMatch(Match match) {
        return matchrepository.save(match);
    }

    public Match getMatchByID(Integer id) {
        try {
            return matchrepository.findById(id).get();
        } catch (java.util.NoSuchElementException e) {
            return null;
        }
}
}


