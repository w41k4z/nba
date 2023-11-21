package proj.tp.nba.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proj.tp.nba.Entity.Joueur;

@Repository
public interface JoueurRipository extends JpaRepository<Joueur, Integer> {

}
