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
CREATE VIEW PlayerMatchCount AS
SELECT
    p.PLAYER_ID,
    p.PLAYER_NAME,
    COUNT(md.MATCH_DETAILS_ID) AS MATCH_COUNT
FROM
    PLAYER p
LEFT JOIN
    MATCH_DETAILS md ON p.PLAYER_ID = md.PLAYER_ID
GROUP BY
    p.PLAYER_ID, p.PLAYER_NAME;
