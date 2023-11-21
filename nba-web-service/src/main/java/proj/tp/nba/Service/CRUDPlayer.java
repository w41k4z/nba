// package proj.tp.nba.Service;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import proj.tp.nba.Entity.Player;

// import proj.tp.nba.Repository.PlayerRepository;

// @Service
// public class CRUDPlayer {
//     @Autowired
//     PlayerRepository Playerrepository;

//     public List<Player> getPlayerList() {
//         return Playerrepository.findAll();
//     }

//     public void deletePlayerByID(Integer id) {
//         Playerrepository.deleteById(id);

//     }

//     public Player postPlayer(Player Player) {
//         return Playerrepository.save(Player);
//     }

//     public Player getPlayerByID(Integer id) {
//         try {
//             return Playerrepository.findById(id).get();
//         } catch (java.util.NoSuchElementException e) {
//             return null;
//         }
//     }

// }
