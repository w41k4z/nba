// package proj.tp.nba.Service;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import proj.tp.nba.Entity.Team;
// import proj.tp.nba.Repository.TeamRepository;

// @Service
// public class CRUDTeam {

// @Autowired
// TeamRepository Teamrep;

// public List<Team> getTeamList() {
// return Teamrep.findAll();
// }

// public void deleteTeamByID(Integer id) {
// Teamrep.deleteById(id);

// }

// public Team postTeam(Team Team) {
// return Teamrep.save(Team);
// }

// public Team getTeamByID(Integer id) {
// try {
// return Teamrep.findById(id).get();
// } catch (java.util.NoSuchElementException e) {
// return null;
// }
// }
// }
