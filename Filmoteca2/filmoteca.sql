CREATE DATABASE IF NOT EXISTS filmoteca;
USE filmoteca;

CREATE TABLE IF NOT EXISTS director(

director varchar(50) not null PRIMARY KEY


);

CREATE TABLE IF NOT EXISTS pelicula (

titulo varchar(100) not null PRIMARY KEY,
director varchar(50),
pais varchar(20),
duracion varchar (15),
genero varchar(25),

FOREIGN KEY (director) REFERENCES director(director)
);

INSERT INTO director VALUES ('Steven Spielberg');
INSERT INTO pelicula VALUES ('ET','Steven Spielberg','Estados Unidos','115 min','Ciencia Ficcion');

INSERT INTO director VALUES ('José Luis Cuerda');
INSERT INTO pelicula VALUES ('Amanece, que no es poco','José Luis Cuerda','España','106 min','Comedia');

INSERT INTO director VALUES ('Gérard Pirès');
INSERT INTO pelicula VALUES ('Taxi','Gérard Pirès','Francia','85 min','Comedia');

INSERT INTO director VALUES ('Pete Docter y Bob Peterson');
INSERT INTO pelicula VALUES ('Up','Pete Docter y Bob Peterson','Estados Unidos','96 min','Animacion');

INSERT INTO director VALUES ('Hayao Miyazaki');
INSERT INTO pelicula VALUES ('El viaje de Chihiro','Hayao Miyazaki','Japon','124 min','Animacion');



