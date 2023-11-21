// package proj.tp.nba.Entity;

// import java.sql.Date;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.FetchType;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.ManyToOne;

// @Entity
// public class Match {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)

//     private Integer match_id;
//     @ManyToOne(optional = false, fetch = FetchType.EAGER)
//     private Team team1_id;
//     @ManyToOne(optional = false, fetch = FetchType.EAGER)
    
//     private Team team2_id;
//     @Column(length = 250)
//     private String match_description;
//     @Column(nullable = true)
//     private Integer score1;
//     @Column(nullable = true)
//     private Integer score2;
//     private Date match_date;
//     public Integer getMatch_id() {
//         return match_id;
//     }
//     public void setMatch_id(Integer match_id) {
//         this.match_id = match_id;
//     }
//     public Team getTeam1_id() {
//         return team1_id;
//     }
//     public void setTeam1_id(Team team1_id) {
//         this.team1_id = team1_id;
//     }
//     public Team getTeam2_id() {
//         return team2_id;
//     }
//     public void setTeam2_id(Team team2_id) {
//         this.team2_id = team2_id;
//     }
//     public String getMatch_description() {
//         return match_description;
//     }
//     public void setMatch_description(String match_description) {
//         this.match_description = match_description;
//     }
//     public Integer getScore1() {
//         return score1;
//     }
//     public void setScore1(Integer score1) {
//         this.score1 = score1;
//     }
//     public Integer getScore2() {
//         return score2;
//     }
//     public void setScore2(Integer score2) {
//         this.score2 = score2;
//     }
//     public Date getMatch_date() {
//         return match_date;
//     }
//     public void setMatch_date(Date match_date) {
//         this.match_date = match_date;
//     }

// }
