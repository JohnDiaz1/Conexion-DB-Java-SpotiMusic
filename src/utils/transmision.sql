CREATE TABLE Transmision(
    transmision_id INT PRIMARY KEY AUTO_INCREMENT,
    transmision_username CHAR(40),
    transmision_servicio INT,
    transmision_fecha DATETIME,
    FOREIGN KEY(transmision_username) REFERENCES Cliente(cliente_username),
    FOREIGN KEY(transmision_servicio) REFERENCES Servicio(servicio_id)
);
INSERT INTO Transmision VALUES (01, "deadofwrite", 1001, '2017-10-25 20:00:00');
INSERT INTO Transmision VALUES (02, "deadofwrite", 1004, '2019-03-15 18:30:00');
INSERT INTO Transmision VALUES (03, "deadofwrite", 1009, '2019-05-20 20:30:00');
INSERT INTO Transmision VALUES (04, "inkandfable", 1001, '2018-05-20 20:30:00');
INSERT INTO Transmision VALUES (05, "inkandfable", 1008, '2020-01-20 20:30:00');
INSERT INTO Transmision VALUES (06, "true.living", 1002, '2019-05-20 20:30:00');
INSERT INTO Transmision VALUES (07, "true.living", 1003, '2018-06-22 21:30:00');
INSERT INTO Transmision VALUES (08, "true.living", 1006, '2020-03-17 15:30:20');
INSERT INTO Transmision VALUES (09, "dreamer", 1006, '2020-03-17 15:30:20');
INSERT INTO Transmision VALUES (10, "dreamer", 1007, '2020-04-10 18:30:20');
INSERT INTO Transmision VALUES (011, "iamwellandgood", 1008, '2020-02-17 20:30:20');
INSERT INTO Transmision VALUES (012, "iamwellandgood", 1009, '2020-02-20 16:30:20');
INSERT INTO Transmision VALUES (013, "iamwellandgood", 1011, '2020-03-27 18:30:20');
INSERT INTO Transmision VALUES (014, "rose", 1010, '2020-03-20 21:30:20');
INSERT INTO Transmision VALUES (015, "loversland", 1007, '2020-01-10 17:30:20');
INSERT INTO Transmision VALUES (016, "loversland", 1010, '2020-03-17 18:30:20');