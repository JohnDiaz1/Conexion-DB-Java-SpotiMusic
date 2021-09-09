CREATE TABLE Cancion(
    cancion_id INT,
    cancion_resenia CHAR(255),
    cancion_anio INT,
    cancion_cantante INT,
    FOREIGN KEY(cancion_id) REFERENCES Servicio(servicio_id),
    FOREIGN KEY(cancion_cantante) REFERENCES Cantante(cantante_id)
);
INSERT INTO Cancion VALUES (1001, "Es la prueba de que Madonna es capaz de hacer algo que más que lucirse en la pista de baile. Este es su disco más aclamado por la crítica, con el que ganó montones de premios y nominaciones a los Grammy, un trabajo de madurez con un pop exquisito", 2012, 102);
INSERT INTO Cancion VALUES (1002, "Un tema desolador, triste, auténtico, descarnada, ideal para la persona que está pasando por una situación similar y necesita algo con que desahogarse", 2017, 103);
INSERT INTO Cancion VALUES (1003, "La historia lubrica el paisajístico clima de una pareja paradigmática (Aunque un poco cliché) bueno para adornarse con el nombre de Romeo y Julieta, los amantes de Verona", 2008, 101);
INSERT INTO Cancion VALUES (1004, "El tema más representativo de todo el grupo: ambiente gótico, desesperación y dolor, lo que veníamos catando en sus álbumes anteriores", 2011, 104);
INSERT INTO Cancion VALUES (1005, "Es una voz de protesta ante la indiferencia de siempre ante las atrocidades cometidas contra un pueblo. Describe el esclavismo despiadado y el poblamiento de Cartagena de Indias con esclavos traídos del continente africano y su sometimiento sangriento", 1998, 105);