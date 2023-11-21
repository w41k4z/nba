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

-- Data for the table Match
INSERT INTO Match (TEAM1_ID, TEAM2_ID, MATCH_DESCRPTION, score1, score2, MACTH_DATE) VALUES
(1, 2, 'Season Opener', 110, 108, '2023-01-01'),
(3, 4, 'Eastern Conference Finals', 95, 92, '2023-05-15');

-- Data for the table actions
INSERT INTO actions ( ACTION_ID,actions) VALUES
( -3,'Three-pts-MISSED'),
(-2,'Two-Pointer-MISSED'),
(-1,'Two-Pointer-MISSED'),
( 0,'LF-Pointer-MISSED'),
( 1,'LF-Pointer-OK'),
( 2,'Two-Pointer-OK'),
( 3,'Three-Pointer-OK'),
(4,'Assist'),
(5,'Steal'),
(8,'Block'),
(9,'REBOUND')

-- Data for the table MACTH_DETAILS
INSERT INTO MACTH_DETAILS (PLAYER_ID, MACTH_ID, ACTION_ID, ACTION_MINUTES) VALUES
(1, 1, 1, 12.5),
(2, 1, 1, 9.8),
(3, 2, 2, 25.0),
(4, 2, 3, 18.2);
