// package proj.tp.nba.Entity;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;

// @Entity
// public class Team {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Integer team_id;

//     @Column( length = 150, nullable = false)
//     private String team_name;
//     @Column( length = 150, nullable = true)
//     private String team_photos;
//     private String team_simple_name;
//     public Integer getTeam_id() {
//         return team_id;
//     }
//     public void setTeam_id(Integer team_id) {
//         this.team_id = team_id;
//     }
//     public String getTeam_name() {
//         return team_name;
//     }
//     public void setTeam_name(String team_name) {
//         this.team_name = team_name;
//     }
//     public String getTeam_photos() {
//         return team_photos;
//     }
//     public void setTeam_photos(String team_photos) {
//         this.team_photos = team_photos;
//     }
//     public String getTeam_simple_name() {
//         return team_simple_name;
//     }
//     public void setTeam_simple_name(String team_simple_name) {
//         this.team_simple_name = team_simple_name;
//     }

// }
