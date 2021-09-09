CREATE TABLE Podcast(
    podcast_id INT,
    podcast_episodios INT,
    podcast_temporadas INT,
    FOREIGN KEY(podcast_id) REFERENCES Servicio(servicio_id)
);
INSERT INTO Podcast VALUES (1006, 153, 11);
INSERT INTO Podcast VALUES (1007, 80, 3);
INSERT INTO Podcast VALUES (1008, 30, 3);
INSERT INTO Podcast VALUES (1009, 31, 4);
INSERT INTO Podcast VALUES (1010, 236, 10);
INSERT INTO Podcast VALUES (1011, 170, 8);
INSERT INTO Podcast VALUES (1012, 279, 12);
INSERT INTO Podcast VALUES (1013, 79, 6);