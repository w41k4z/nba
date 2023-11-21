-- Data for the table TEAM
INSERT INTO TEAM (TEAM_SIMPLE_NAME, TEAM_NAME) VALUES
('PHI', 'Philadelphia 76ers'),
('BOS', 'Boston Celtics'),
('MIA', 'Miami Heat'),
('UTA', 'UTA JAZZ');

-- Data for the table PLAYER
INSERT INTO PLAYER (PLAYER_NAME, TEAM_ID, PLAYER_PHOTOS) VALUES
-- PHI
('Joel Embiid', 1, 'joel_embiid.png'),
('Tyrese Maxey', 1, 'tyrese_maxey.png'),
('Tobias Harris', 1, 'tobias_harris.png'),
('Kelly Oubre Jr.', 1, 'kelly_oubre_jr.png'),
('Patrick Beverley', 1, 'patrick_beverley.png'),
-- BOS
('Jayson Tatum', 2, 'jayson_tatum.png'),
('Jrue Holiday', 2, 'jrue_holiday.png'),
('Jaylen Brown', 2, 'jaylen_brown.png'),
('Derrick White', 2, 'derrick_white.png'),
('Kristaps Porzingis', 2, 'kristaps_porzingis.png');


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
INSERT INTO MATCH_DETAILS (PLAYER_ID, MACTH_ID, ACTION_ID, ACTION_MINUTES) VALUES
(1, 1, 1, 2.5),   -- LeBron James fait un tir à trois points manqué
(2, 1, 2, 4.8),   -- Stephen Curry fait un tir à deux points manqué
(3, 1, 3, 8.3),   -- Jayson Tatum rate un lancer franc
(4, 1, 4, 12.0),  -- Jimmy Butler réussit un lancer franc
(1, 1, 5, 15.2),  -- LeBron James fait un tir à deux points réussi
(2, 1, 6, 18.7),  -- Stephen Curry fait un tir à trois points réussi
(3, 1, 7, 22.1),  -- Jayson Tatum réalise une passe décisive
(4, 1, 8, 25.6),  -- Jimmy Butler réalise un vol de balle
(1, 1, 9, 28.9),  -- LeBron James réalise un blocage
(2, 1, 10, 32.4); -- Stephen Curry prend un rebond
