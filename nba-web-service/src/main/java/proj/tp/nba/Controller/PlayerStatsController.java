package proj.tp.nba.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import proj.tp.nba.Entity.PlayerStats;
import proj.tp.nba.Service.CRUDPlayerStats;

@RestController
public class PlayerStatsController {

    @Autowired
    private CRUDPlayerStats playerStats;

    @GetMapping("/stats")
    public java.util.List<PlayerStats> getStats() {
        return playerStats.getPlayerStatsRepoList();
    }

}
