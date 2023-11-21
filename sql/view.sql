-- Create a view to show the number of matches played by each team
CREATE VIEW TeamMatchCount AS
SELECT
    t.TEAM_ID,
    t.TEAM_NAME,
    COUNT(m.MACTH_ID) AS MATCH_COUNT
FROM
    TEAM t
LEFT JOIN
    Match m ON t.TEAM_ID = m.TEAM1_ID OR t.TEAM_ID = m.TEAM2_ID
GROUP BY
    t.TEAM_ID, t.TEAM_NAME;


-- Create a view to show the number of matches played by each player
-- Créer une vue pour calculer le nombre de matchs auxquels chaque joueur a participé
CREATE VIEW PlayerMatchParticipation AS
    SELECT
        p.PLAYER_ID,
        p.PLAYER_NAME,
        COUNT(mp.MATCH_ID) AS MATCH_PARTICIPATION_COUNT
    FROM
        PLAYER p
    LEFT JOIN
        MATCH_PLAYERS mp ON p.PLAYER_ID = mp.PLAYER_ID
    GROUP BY
        p.PLAYER_ID, p.PLAYER_NAME;


