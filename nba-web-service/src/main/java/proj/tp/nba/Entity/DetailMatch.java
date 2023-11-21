// package proj.tp.nba.Entity;

// import javax.persistence.Entity;
// import javax.persistence.FetchType;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.ManyToOne;
// import javax.persistence.Table;

// @Entity

// public class DetailMatch {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Integer match_details_id;
//     @ManyToOne(optional = false, fetch = FetchType.EAGER)
//     private Match match_id;
//     @ManyToOne(optional = false, fetch = FetchType.EAGER)
//     private Player player_id;
//     @ManyToOne(optional = false, fetch = FetchType.EAGER)
//     private Action action_id;

//     private double action_minutes;
//     private Team equipe;

//     public Integer getMatch_details_id() {
//         return match_details_id;
//     }

//     public void setMatch_details_id(Integer match_details_id) {
//         this.match_details_id = match_details_id;
//     }

//     public Match getMatch_id() {
//         return match_id;
//     }

//     public void setMatch_id(Match match_id) {
//         this.match_id = match_id;
//     }

//     public Player getPlayer_id() {
//         return player_id;
//     }

//     public void setPlayer_id(Player player_id) {
//         this.player_id = player_id;
//     }

//     public Action getAction_id() {
//         return action_id;
//     }

//     public void setAction_id(Action action_id) {
//         this.action_id = action_id;
//     }

//     public double getAction_minutes() {
//         return action_minutes;
//     }

//     public void setAction_minutes(double action_minutes) {
//         this.action_minutes = action_minutes;
//     }

//     public Team getEquipe() {
//         return equipe;
//     }

//     public void setEquipe(Team equipe) {
//         this.equipe = equipe;
//     }

// }
