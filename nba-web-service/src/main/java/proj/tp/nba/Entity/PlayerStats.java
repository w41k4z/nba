package proj.tp.nba.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "playerstatistics")
public class PlayerStats {

    @Id
    private Integer playerId;
    private String playerName;
    private Integer teamId;
    private Double threePointersPercentage;
    private Double twoPointersPercentage;
    private Integer freeThrowsPercentage;
    private Integer totalAssists;
    private Integer totalRebounds;
    private Integer totalBlocks;
    private Integer totalSteals;

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Double getThreePointersPercentage() {
        return threePointersPercentage;
    }

    public void setThreePointersPercentage(Double threePointersPercentage) {
        this.threePointersPercentage = threePointersPercentage;
    }

    public Double getTwoPointersPercentage() {
        return twoPointersPercentage;
    }

    public void setTwoPointersPercentage(Double twoPointersPercentage) {
        this.twoPointersPercentage = twoPointersPercentage;
    }

    public Integer getFreeThrowsPercentage() {
        return freeThrowsPercentage;
    }

    public void setFreeThrowsPercentage(Integer freeThrowsPercentage) {
        this.freeThrowsPercentage = freeThrowsPercentage;
    }

    public Integer getTotalAssists() {
        return totalAssists;
    }

    public void setTotalAssists(Integer totalAssists) {
        this.totalAssists = totalAssists;
    }

    public Integer getTotalRebounds() {
        return totalRebounds;
    }

    public void setTotalRebounds(Integer totalRebounds) {
        this.totalRebounds = totalRebounds;
    }

    public Integer getTotalBlocks() {
        return totalBlocks;
    }

    public void setTotalBlocks(Integer totalBlocks) {
        this.totalBlocks = totalBlocks;
    }

    public Integer getTotalSteals() {
        return totalSteals;
    }

    public void setTotalSteals(Integer totalSteals) {
        this.totalSteals = totalSteals;
    }

}
