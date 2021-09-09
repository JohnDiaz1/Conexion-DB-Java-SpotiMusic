CREATE TABLE Cliente(
    cliente_username CHAR(20) PRIMARY KEY,
    cliente_nombre CHAR(20),
    cliente_apellido CHAR(20),
    cliente_email CHAR(30),
    cliente_celular BIGINT,
    cliente_clave CHAR(20),
    cliente_fecha_nacimiento DATE
);
INSERT INTO Cliente VALUES("deadofwrite", "Luis", "Lopez", "deado@gmail.com", 3124534332, "password", '01-7-25');
INSERT INTO Cliente VALUES("dreamer", "Pedro", "Andres", "dreamer@gmail.com", 3214554634, "01234", '16-8-16');
INSERT INTO Cliente VALUES("iamwellandgood", "Luis", "Cruz", "iamwe@gmail.com", 3008766543, "soyuntipazo", '19-7-06');
INSERT INTO Cliente VALUES("inkandfable", "Jorge", "Diaz", "inkan@hotmail.com", 3113450987, "inkan123", '02-3-19');
INSERT INTO Cliente VALUES("loversland", "Maria", "Perez", "lovers@hotmail.com", 3057891200, "Maria21", '15-5-01');
INSERT INTO Cliente VALUES("neon", "Claudia", "Mendez", "neon@hotmail.com", 3224528307, "N30n", '11-9-06');
INSERT INTO Cliente VALUES("rose", "Nelly", "Rodriguez", "rose@yahoo.com", 3007329834, "roseNelly", '24-12-10');
INSERT INTO Cliente VALUES("true.living", "Ana", "Rojas", "living@yahoo.com", 3227896509, "C0ntrasenia", '29-11-19');
