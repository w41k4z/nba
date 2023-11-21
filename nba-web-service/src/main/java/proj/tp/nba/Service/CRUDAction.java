// package proj.tp.nba.Service;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import proj.tp.nba.Entity.Action;
// import proj.tp.nba.Repository.ActionRepository;

// @Service
// public class CRUDAction {
//     @Autowired
//     ActionRepository actionrepository;

//     public List<Action> getActionList() {
//         return actionrepository.findAll();
//     }

//     public void deleteActionByID(Integer id) {
//         actionrepository.deleteById(id);

//     }

//     public Action postAction(Action action) {
//         return actionrepository.save(action);
//     }

//     public Action getActionByID(Integer id) {
//         try {
//             return actionrepository.findById(id).get();
//         } catch (java.util.NoSuchElementException e) {
//             return null;
//         }
//     }
// }
