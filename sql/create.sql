create database nba ;


create table TEAM (
    TEAM_ID SERIAL primary key,
    TEAM_SIMPLE_NAME varchar(50) , -- (GSW)
    TEAM_NAME varchar(50), -- (GOLDEN STATE WARRIORS),
    TEAM_PHOTOS varchar(250)
);

create table PLAYER (
    PLAYER_ID SERIAL primary key,
    PLAYER_NAME varchar (50),
    TEAM_ID INT,
    PLAYER_PHOTOS varchar(250),
    FOREIGN KEY (TEAM_ID) references TEAM(TEAM_ID)
);
create table Match(
    MACTH_ID SERIAL primary key,
    TEAM1_ID INT,
    TEAM2_ID INT,
    MATCH_DESCRPTION varchar(250),
    score1 int ,
    score2 int,
    MACTH_DATE DATE,
    FOREIGN KEY (TEAM1_ID) references TEAM(TEAM_ID),
    FOREIGN KEY (TEAM2_ID) references TEAM(TEAM_ID)
);
create table actions (
    ACTION_ID int  primary key,
    actions varchar(250)
);
create table MATCH_DETAILS (
    MATCH_DETAILS_ID SERIAL primary key ,
    PLAYER_ID INT ,
    MACTH_ID INT ,
    ACTION_ID int ,
    ACTION_MINUTES double precision,
    FOREIGN KEY (PLAYER_ID) references PLAYER(PLAYER_ID),
    FOREIGN KEY (ACTION_ID) references actions(ACTION_ID)
);


-- Créer une nouvelle table pour enregistrer les joueurs participants à un match
CREATE TABLE MATCH_PLAYERS (
    MATCH_PLAYER_ID SERIAL PRIMARY KEY,
    MATCH_ID INT references match(MACTH_ID),
    PLAYER_ID INT references player(PLAYER_ID),
    TEAM_ID int references team(TEAM_ID)

);


-- create view crossjoin_action_player as select  idjoueur , actions  , points , idactions  , idequipe from joueur cross join  actions where idactions !='9' and idactions !='8' ;
-- create view crossJoinTest as select crossjoin_action_player.idjoueur, match.idmatch  , crossjoin_action_player.actions  , crossjoin_action_player.points , crossjoin_action_player.idactions   from crossjoin_action_player join match on crossjoin_action_player.idequipe = match.idequipe1 UNION select crossjoin_action_player.idjoueur, match.idmatch  , crossjoin_action_player.actions  , crossjoin_action_player.points , crossjoin_action_player.idactions   from crossjoin_action_player join match on crossjoin_action_player.idequipe = match.idequipe2 
-- create view countActions as select IDMATCH ,IDJOUEUR , idactions, count(idactions) as nbr from detailsMatch group by IDMATCH, IDJOUEUR ,idactions order by IDMATCH, IDJOUEUR ,idactions;
-- create view statsG as select crossJoinTest.idjoueur , crossJoinTest.idMatch , crossJoinTest.actions , crossJoinTest.points , nvl(nbr,0) as nbre from crossJoinTest left join countActions on countActions.idJoueur= crossJoinTest.idjoueur and countActions.idMatch= crossJoinTest.idMatch and crossJoinTest.idactions = countActions.idactions order by crossJoinTest.idjoueur , crossJoinTest.idMatch , crossJoinTest.actions ;

-- create view statsPointsMarque as select idjoueur , idmatch, sum (points*nbre) as points from statsG where actions like 'tir%' and actions!='tir' group by idjoueur , idmatch; ;
-- create view tirTente as select IDJOUEUR ,IDMATCH ,sum(NBRE) as tentative from statsG where actions like 'tir%'  group by IDJOUEUR ,IDMATCH;
-- create view tirReussi as select IDJOUEUR ,IDMATCH ,sum(NBRE) as reussi from statsG where actions like 'tir%' and actions !='tir'  group by IDJOUEUR ,IDMATCH;
-- create view passeD as select idjoueur , idmatch , nbre as passe_decisive from statsG where actions ='passeD';
-- create view rebondoff as select idjoueur , idmatch , nbre as rebond_offensif from statsG where actions ='rebondOff';
-- create view rebondDef as select idjoueur , idmatch , nbre as rebond_defensif from statsG where actions ='rebondDef';
-- create view three as select idjoueur , idmatch , nbre as tir_3points from statsG where actions ='tir3';
-- create view lf as select idjoueur , idmatch , nbre as tir_LF from statsG where actions ='tirLF';
-- create view panier as select idjoueur , idmatch , nbre as panier from statsG where actions ='tir2';

-- create view statsJoueur as select  statsPointsMarque.idmatch,equipe.nomEquipe,joueur.nomJoueur,statsPointsMarque.idjoueur, statsPointsMarque.points, tirTente.tentative ,tirReussi.reussi , passeD.passe_decisive as PD,rebondOff.rebond_offensif as RO,rebondDef.rebond_defensif as RD  from statsPointsMarque join tirTente on  statsPointsMarque.idjoueur = tirTente.idjoueur and statsPointsMarque.idmatch=tirTente.idmatch
-- left join tirReussi on  statsPointsMarque.idjoueur = tirReussi.idjoueur  and statsPointsMarque.idmatch= tirReussi.idmatch
-- left join passeD on  statsPointsMarque.idjoueur = passeD.idjoueur  and statsPointsMarque.idmatch= passeD.idmatch
-- left join rebondOff on  statsPointsMarque.idjoueur = rebondOff.idjoueur  and statsPointsMarque.idmatch= rebondOff.idmatch
-- left join rebondDef on  statsPointsMarque.idjoueur = rebondDef.idjoueur and statsPointsMarque.idmatch= rebondDef.idmatch
-- left join joueur on statsPointsMarque.idjoueur = joueur.idjoueur
-- left join equipe on equipe.idequipe = joueur.idequipe
-- order by statsPointsMarque.idjoueur , equipe.idequipe ;

-- create view POINTSBYIDEQUIPE as select idequipe , idmatch,sum( points) as points from statsPointsMarque join joueur on statsPointsMarque.idjoueur = joueur.idjoueur group by idequipe ,idmatch ;
-- create view SCOREEQUIPEMATCH as select pointsByIdEquipe.idequipe ,nomequipe , points from pointsByIdEquipe join equipe on pointsByIdEquipe.idequipe= equipe.idequipe ;
-- create view detailstime as  select detailsmatch.idjoueur ,joueur.idequipe , idmatch , idactions , dateaction from detailsmatch JOIN joueur on detailsmatch.idjoueur = joueur.idjoueur where idactions ='8' or idactions ='9' order by iddetailmatch , idactions;

--  select distinct (statsjoueur.idjoueur) , joueur.idequipe from statsjoueur join joueur on statsjoueur.idjoueur = joueur.idjoueur  where idmatch ='1' order by idjoueur;

-- Insert into equipe (IDEQUIPE,NOMEQUIPE) values ('1','equipe1');
-- Insert into equipe (IDEQUIPE,NOMEQUIPE) values ('2','equipe2');


-- Insert into match (IDMATCH,IDEQUIPE1,IDEQUIPE2,NOMMATCH,SCORE1,SCORE2,DATEMATCH) values ('1','1','2','equipe1 vs equipe2','0','0','02/12/2022');
-- Insert into joueur (IDJOUEUR,NOMJOUEUR,IDEQUIPE) values ('j1','j1','1');
-- Insert into joueur (IDJOUEUR,NOMJOUEUR,IDEQUIPE) values ('j2','j2','1');
-- Insert into joueur (IDJOUEUR,NOMJOUEUR,IDEQUIPE) values ('j3','j3','1');
-- Insert into joueur (IDJOUEUR,NOMJOUEUR,IDEQUIPE) values ('j4','j4','1');
-- Insert into joueur (IDJOUEUR,NOMJOUEUR,IDEQUIPE) values ('j5','j5','1');
-- Insert into joueur (IDJOUEUR,NOMJOUEUR,IDEQUIPE) values ('ja1','ja1','2');
-- Insert into joueur (IDJOUEUR,NOMJOUEUR,IDEQUIPE) values ('ja2','ja2','2');
-- Insert into joueur (IDJOUEUR,NOMJOUEUR,IDEQUIPE) values ('ja3','ja3','2');
-- Insert into joueur (IDJOUEUR,NOMJOUEUR,IDEQUIPE) values ('ja4','ja4','2');
-- Insert into joueur (IDJOUEUR,NOMJOUEUR,IDEQUIPE) values ('ja5','ja5','2');