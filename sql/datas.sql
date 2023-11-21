-- Data for the table TEAM
INSERT INTO TEAM (TEAM_SIMPLE_NAME, TEAM_NAME) VALUES
('GSW', 'Golden State Warriors'),
('LAL', 'Los Angeles Lakers'),
('BOS', 'Boston Celtics'),
('MIA', 'Miami Heat'),
('UTA', 'UTA JAZZ');

-- Data for the table PLAYER
INSERT INTO PLAYER (PLAYER_NAME, TEAM_ID) VALUES
('Stephen Curry', 1),
('LeBron James', 2),
('Jayson Tatum', 3),
('Jimmy Butler', 4);

INSERT INTO PLAYER (PLAYER_NAME, TEAM_ID) VALUES
('Dylan',5);
-- Data for the table Match
INSERT INTO Match (TEAM1_ID, TEAM2_ID, MATCH_DESCRPTION, score1, score2, MACTH_DATE) VALUES
(1, 2, 'Season Opener', 110, 108, '2023-01-01'),
(3, 4, 'Eastern Conference Finals', 95, 92, '2023-05-15');

-- Data for the table actions
-- Données pour la table actions
INSERT INTO actions (ACTION_ID, actions) VALUES
(1, 'Three-Pointer-MISSED'),
(2, 'Two-Pointer-MISSED'),
(3, 'Free Throw-MISSED'),
(4, 'Free Throw-OK'),
(5, 'Two-Pointer-OK'),
(6, 'Three-Pointer-OK'),
(7, 'Assist'),
(8, 'Steal'),
(9, 'Block'),
(10, 'REBOUND');

-- Insérer des joueurs participants au match avec l'identifiant 1
INSERT INTO MATCH_PLAYERS (MATCH_ID, PLAYER_ID, TEAM_ID) VALUES
(1, 1, 1), -- LeBron James, équipe LAL
(1, 2, 2), -- Stephen Curry, équipe GSW
(1, 3, 3), -- Jayson Tatum, équipe BOS
(1, 4, 4); -- Jimmy Butler, équipe MIA


-- Data for the table MACTH_DETAILS-- Données pour le match avec l'identifiant 1 (inclus toutes les variations d'actions)
-- Données fictives pour la table MATCH_DETAILS
INSERT INTO MATCH_DETAILS (PLAYER_ID, TEAM_ID, MACTH_ID, ACTION_ID, ACTION_MINUTES) VALUES
(1, 1, 1, 1, 2.5),  
(2, 2, 1, 2, 4.8),  
-- (3, 3, 1, 3, 8.3),  
-- (4, 4, 1, 4, 1.2),  
(1, 1, 1, 5, 5.7),  
(2, 2, 1, 6, 7.4),  
-- (3, 3, 1, 7, 3.1),  
-- (4, 4, 1, 8, 6.6),  
(1, 1, 1, 9, 2.0),  
(2, 2, 1, 10, 4.5); 


INSERT INTO MATCH_DETAILS (PLAYER_ID, TEAM_ID, MACTH_ID, ACTION_ID, ACTION_MINUTES) VALUES (2, 2, 1, 5, 4.8),  

select macth_id , match_details.player_id , PLAYER_NAME  from match_details join player on player.PLAYER_ID = match_details.player_id where ACTION_ID = 6 ;