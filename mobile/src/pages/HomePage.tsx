import {
  IonCard,
  IonCardContent,
  IonCardHeader,
  IonCardSubtitle,
  IonCardTitle,
  IonContent,
  IonHeader,
  IonPage,
  IonTitle,
  IonToolbar,
} from "@ionic/react";

import BOS from "../assets/images/BOS.png";
import PHI from "../assets/images/PHI.jpeg";

const HomePage = () => {
  return (
    <IonPage>
      <IonHeader translucent={true}>
        <IonToolbar>
          <IonTitle>NBA Team Stat App</IonTitle>
        </IonToolbar>
      </IonHeader>
      <IonContent fullscreen className="ion-padding">
        <IonCard onClick={() => {}}>
          <img alt="Boston Celtics" src={BOS} width="200px" height="200px" />
          <IonCardHeader>
            <IonCardTitle>BOS</IonCardTitle>
            <IonCardSubtitle>Boston Celtics</IonCardSubtitle>
          </IonCardHeader>

          <IonCardContent>
            Joueur 1, Joueur 2, Joueur 3, Joueur 4, Joueur 5
          </IonCardContent>
        </IonCard>
        <IonCard onClick={() => {}}>
          <img alt="Boston Celtics" src={PHI} width="200px" height="200px" />
          <IonCardHeader>
            <IonCardTitle>PHI</IonCardTitle>
            <IonCardSubtitle>Philadelphia 76ers</IonCardSubtitle>
          </IonCardHeader>

          <IonCardContent>
            Joueur 1, Joueur 2, Joueur 3, Joueur 4, Joueur 5
          </IonCardContent>
        </IonCard>
      </IonContent>
    </IonPage>
  );
};

export default HomePage;
