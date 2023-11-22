import {
  IonCard,
  IonCardContent,
  IonCardHeader,
  IonCardSubtitle,
  IonCardTitle,
  IonContent,
  IonHeader,
  IonItem,
  IonList,
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
        <IonCard routerLink="/team/BOS" routerDirection="back">
          <img alt="Boston Celtics" src={BOS} width="100%" height="100%" />
          <IonCardHeader>
            <IonCardTitle>BOS</IonCardTitle>
            <IonCardSubtitle>Boston Celtics</IonCardSubtitle>
          </IonCardHeader>
        </IonCard>
        <IonCard routerLink="/team/PHI" routerDirection="back">
          <img alt="Philadelphia" src={PHI} width="100%" height="100%" />
          <IonCardHeader>
            <IonCardTitle>PHI</IonCardTitle>
            <IonCardSubtitle>Philadelphia 76ers</IonCardSubtitle>
          </IonCardHeader>
        </IonCard>
      </IonContent>
    </IonPage>
  );
};

export default HomePage;
