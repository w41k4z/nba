package proj.tp.nba.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proj.tp.nba.Entity.PlayerStats;

public interface PlayerStatsRepo extends JpaRepository<PlayerStats, Integer> {

}
