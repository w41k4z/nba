package proj.tp.nba.DTO;

import java.sql.Date;

public class MatchDTO {
    private Integer idMatch;
    private Integer idEquipe1;
    private Integer idEquipe2;
    private String nomMatch;
    private Integer scoreEquipe1;
    private Integer scoreEquipe2;
    private Date dateMatch;

    public Integer getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(Integer idMatch) {
        this.idMatch = idMatch;
    }

    public Integer getIdEquipe1() {
        return idEquipe1;
    }

    public void setIdEquipe1(Integer idEquipe1) {
        this.idEquipe1 = idEquipe1;
    }

    public Integer getIdEquipe2() {
        return idEquipe2;
    }

    public void setIdEquipe2(Integer idEquipe2) {
        this.idEquipe2 = idEquipe2;
    }

    public String getNomMatch() {
        return nomMatch;
    }

    public void setNomMatch(String nomMatch) {
        this.nomMatch = nomMatch;
    }

    public Integer getScoreEquipe1() {
        return scoreEquipe1;
    }

    public void setScoreEquipe1(Integer scoreEquipe1) {
        this.scoreEquipe1 = scoreEquipe1;
    }

    public Integer getScoreEquipe2() {
        return scoreEquipe2;
    }

    public void setScoreEquipe2(Integer scoreEquipe2) {
        this.scoreEquipe2 = scoreEquipe2;
    }

    public Date getDateMatch() {
        return dateMatch;
    }

    public void setDateMatch(Date dateMatch) {
        this.dateMatch = dateMatch;
    }
}
