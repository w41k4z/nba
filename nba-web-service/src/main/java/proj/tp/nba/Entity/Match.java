package proj.tp.nba.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMatch;
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Equipe equipe1;
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Equipe equipe2;
    @Column(length = 250)
    private String nomMatch;
    @Column(nullable = true)
    private Integer scoreEquipe1;
    @Column(nullable = true)
    private Integer scoreEquipe2;
    private Date dateMatch;

    public Integer getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(Integer idMatch) {
        this.idMatch = idMatch;
    }

    public Equipe getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
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
