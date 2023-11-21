package proj.tp.nba.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proj.tp.nba.Entity.Action;

@Repository
public interface ActionRepository extends JpaRepository<Action, Integer> {

}
