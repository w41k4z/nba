package proj.tp.nba.DTO;

public class DetailMatchDTO {
    private Integer idDetailMatch;
    private Integer idMatch;
    private Integer idJoueur;
    private Integer action;

    public Integer getIdDetailMatch() {
        return idDetailMatch;
    }

    public void setIdDetailMatch(Integer idDetailMatch) {
        this.idDetailMatch = idDetailMatch;
    }

    public Integer getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(Integer idMatch) {
        this.idMatch = idMatch;
    }

    public Integer getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(Integer idJoueur) {
        this.idJoueur = idJoueur;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }
}
