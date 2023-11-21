package proj.tp.nba.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proj.tp.nba.Entity.PlayerStats;

import proj.tp.nba.Repository.PlayerStatsRepo;

@Service
public class CRUDPlayerStats {
    @Autowired
    PlayerStatsRepo playerStatsRepo;

    public List<PlayerStats> getPlayerStatsRepoList() {
        return playerStatsRepo.findAll();
    }

}
