CREATE TABLE Cantante(
	cantante_id  INT PRIMARY KEY AUTO_INCREMENT,
    cantante_nombre  CHAR(20),
    cantante_apellido CHAR(20),
    cantante_nacionalidad  CHAR(40)
);
INSERT INTO Cantante VALUES (101, "Taylor","Swift", "estadounidense");
INSERT INTO Cantante VALUES (102, "Madonna Louise", "Ciccone", "estadounidense");
INSERT INTO Cantante VALUES (103, "Ella Marija", "Lani", "neozelandesa");
INSERT INTO Cantante VALUES (104, "Amy", "Lee", "estadounidense");
INSERT INTO Cantante VALUES (105, "Joe", "Arroyo", "colombiano");