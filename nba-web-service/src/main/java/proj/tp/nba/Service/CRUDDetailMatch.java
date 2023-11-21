// package proj.tp.nba.Service;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import proj.tp.nba.Entity.DetailMatch;
// import proj.tp.nba.Repository.DetailMatchRepository;

// @Service
// public class CRUDDetailMatch {
//     @Autowired
//     DetailMatchRepository detailmatchrepository;

//     public List<DetailMatch> getDetailMatchList() {
//         return detailmatchrepository.findAll();
//     }

//     public void deleteDetailMatchByID(Integer id) {
//         detailmatchrepository.deleteById(id);

//     }

//     public DetailMatch postDetailMatch(DetailMatch detailmatch) {
//         return detailmatchrepository.save(detailmatch);
//     }

//     public DetailMatch getDetailMatchByID(Integer id) {
//         try {
//             return detailmatchrepository.findById(id).get();
//         } catch (java.util.NoSuchElementException e) {
//             return null;
//         }
//     }
// }
