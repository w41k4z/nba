package proj.tp.nba.Entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DetailMatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetailMatch;
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Match match;
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Joueur joueur;
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Action action;

    private double actionMinutes;

    public Integer getIdDetailMatch() {
        return idDetailMatch;
    }

    public void setIdDetailMatch(Integer idDetailMatch) {
        this.idDetailMatch = idDetailMatch;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public double getActionMinutes() {
        return actionMinutes;
    }

    public void setActionMinutes(double actionMinutes) {
        this.actionMinutes = actionMinutes;
    }
}
