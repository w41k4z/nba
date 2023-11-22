import {
  IonBackButton,
  IonButtons,
  IonContent,
  IonHeader,
  IonItem,
  IonLabel,
  IonList,
  IonPage,
  IonTitle,
  IonToolbar,
} from "@ionic/react";
import React from "react";
import { useParams } from "react-router-dom";

interface TeamParams {
  acronym: string;
}

interface TeamInterface {
  name: string;
  acronym: string;
  logo: string;
  members: Array<{
    name: string;
    position: string;
    number: number;
  }>;
}

const Team = () => {
  const { acronym } = useParams<TeamParams>();

  const staticTeamData = [
    {
      name: "Boston Celtics",
      acronym: "BOS",
      logo: "BOS.png",
      members: [
        {
          name: "Kemba Walker",
          position: "PG",
          number: 8,
        },
        {
          name: "Jaylen Brown",
          position: "SG",
          number: 7,
        },
        {
          name: "Jayson Tatum",
          position: "SF",
          number: 0,
        },
        {
          name: "Gordon Hayward",
          position: "PF",
          number: 20,
        },
        {
          name: "Daniel Theis",
          position: "C",
          number: 27,
        },
      ],
    },
    {
      name: "Philadelphia 76ers",
      acronym: "PHI",
      logo: "PHI.jpeg",
      members: [
        {
          name: "Ben Simmons",
          position: "PG",
          number: 25,
        },
        {
          name: "Josh Richardson",
          position: "SG",
          number: 0,
        },
        {
          name: "Tobias Harris",
          position: "SF",
          number: 12,
        },
        {
          name: "Al Horford",
          position: "PF",
          number: 42,
        },
        {
          name: "Joel Embiid",
          position: "C",
          number: 21,
        },
      ],
    },
  ];
  const [team, setTeam] = React.useState<TeamInterface>(staticTeamData[0]);
  React.useEffect(() => {
    const team = staticTeamData.find((team) => team.acronym === acronym);
    if (team) {
      setTeam(team);
    }
  }, [acronym]);

  return (
    <IonPage>
      <IonHeader>
        <IonToolbar>
          <IonButtons slot="start">
            <IonBackButton defaultHref="/" />
            <IonTitle>{acronym} details</IonTitle>
          </IonButtons>
        </IonToolbar>
      </IonHeader>
      <IonContent className="ion-padding">
        <IonList>
          {team.members.map((member) => {
            return (
              <IonItem key={member.number}>
                <IonLabel>
                  {member.name} - {member.position} - #{member.number}
                </IonLabel>
              </IonItem>
            );
          })}
        </IonList>
      </IonContent>
    </IonPage>
  );
};

export default Team;
