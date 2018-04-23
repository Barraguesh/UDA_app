--Insertamos las personas
INSERT INTO PERSONA VALUES ('53981435S','Daniel', 'Barragues','Julian de Apraiz',18,'6C','Vitoria-Gasteiz',01012,'España',674563897);
INSERT INTO PERSONA VALUES ('90878656R','Unai', 'Puelles','Avenida Gasteiz',38,'4I','Vitoria-Gasteiz',01008,'España',634298463);
INSERT INTO PERSONA VALUES ('62346572H','Alejandro', 'Diaz de Otalora','Cercas Bajas',4,'1C','Vitoria-Gasteiz',01003,'España',623142984);

INSERT INTO PERSONA VALUES ('34576287U','Paco', 'Ortiz','Juntas Generales',34,'6C','Vitoria-Gasteiz',01012,'España',784938237);
INSERT INTO PERSONA VALUES ('38274230I','Manuel', 'Santidrian','Dato',14,'8I','Vitoria-Gasteiz',01010,'España',765438234);
INSERT INTO PERSONA VALUES ('91823490O','Zuriñe', 'Arriba','Basoa',25,'4C','Vitoria-Gasteiz',01009,'España',653987675);

INSERT INTO PERSONA VALUES ('12367487H','Marta', 'Santiago','Venezuela',24,'6C','Vitoria-Gasteiz',01012,'España',678549803);
INSERT INTO PERSONA VALUES ('90898776D','Sara', 'Martinez','Colombia',24,'6C','Vitoria-Gasteiz',01012,'España',645734543);

--Insertamos los jugadores
INSERT INTO JUGADOR VALUES ('53981435S','Javier', 'Andoniz','Cuba',24,'5D','Vitoria-Gasteiz',01567,'España',690123485);
INSERT INTO JUGADOR VALUES ('53981435S','Alfredo', 'Zulueta','El retiro',24,'8D','Madrid',45029,'España',638980123);
INSERT INTO JUGADOR VALUES ('53981435S','Manolo', 'Maneiro','La alamea',10,'9C','Bilbao',02048,'España',654987123);
INSERT INTO JUGADOR VALUES ('53981435S','Sergio', 'Fuentes','Peru',22,'7C','Vitoria-Gasteiz',01034,'España',645782345);
INSERT INTO JUGADOR VALUES ('53981435S','Alvaro', 'Heras','Santiago',55,'7D','Vitoria-Gasteiz',01012,'España',654980342);
INSERT INTO JUGADOR VALUES ('53981435S','Abi', 'Al-Hamad','Cuchilleria',15,'6I','San Sebastian',01012,'España',674534902);
INSERT INTO JUGADOR VALUES ('53981435S','Maria', 'Alpino','España',71,'8C','Vitoria-Gasteiz',01012,'España',654345678);
INSERT INTO JUGADOR VALUES ('53981435S','Laura', 'Pineiro','America',43,'5I','Vitoria-Gasteiz',01012,'España',652987090);
INSERT INTO JUGADOR VALUES ('53981435S','Sandy', 'Alvarado','Plaza Colon',34,'3D','Vitoria-Gasteiz',01012,'España',666787900);
INSERT INTO JUGADOR VALUES ('53981435S','Jon', 'Ferreiro','Parque de las Conchas',32,'2I','Jaen',01012,'España',673444532);
INSERT INTO JUGADOR VALUES ('53981435S','Jorge', 'del Pino','America Latina',34,'5D','Malaga',01012,'España',654567889);
INSERT INTO JUGADOR VALUES ('53981435S','Imanol', 'Alcampo','Alfonso XI',41,'4C','Murcia',12034,'España',765333888);
INSERT INTO JUGADOR VALUES ('53981435S','Alfonso', 'Figaro','Juderia',11,'3I','Vitoria-Gasteiz',01034,'España',654999080);
INSERT INTO JUGADOR VALUES ('53981435S','Pedro', 'Diaz','Santo Tomas',34,'10D','Madrid',45034,'España',654777657);
INSERT INTO JUGADOR VALUES ('53981435S','Mikel', 'Alday','General Alava',54,'4I','Madrid',45098,'España',678554345);

--Clasificamos cada persona por tipos
INSERT INTO ADMIN VALUES ('53981435S');
INSERT INTO ADMIN VALUES ('90878656R');
INSERT INTO ADMIN VALUES ('62346572H');

INSERT INTO DUENO VALUES ('34576287U');
INSERT INTO DUENO VALUES ('38274230I');
INSERT INTO DUENO VALUES ('91823490O');

INSERT INTO USUARIO VALUES ('12367487H');
INSERT INTO USUARIO VALUES ('90898776D');

--Creamos las cuentas
INSERT INTO CUENTA VALUES ('Barraguesh','12345Abcde','53981435S');
INSERT INTO CUENTA VALUES ('Pu3ll3s','12345Abcde','90878656R');
INSERT INTO CUENTA VALUES ('Alexddo','12345Abcde','62346572H');
INSERT INTO CUENTA VALUES ('Sandstorm','12345Abcde','34576287U');
INSERT INTO CUENTA VALUES ('Fnatic','12345Abcde','38274230I');
INSERT INTO CUENTA VALUES ('AlCapo','12345Abcde','91823490O');
INSERT INTO CUENTA VALUES ('Destroll3r','12345Abcde','12367487H');
INSERT INTO CUENTA VALUES ('KingBronx','12345Abcde','90898776D');

--Creamos los equipos
INSERT INTO EQUIPO VALUES (1,'D3STROY','Campeones de 2015. Equipo creado por el mejor ADC de toda la liga',0,3,'34576287U');
INSERT INTO EQUIPO VALUES (2,'FNATICX','Campeones de 2016. Los mas veteranos de la liga.',0,2,'38274230I');
INSERT INTO EQUIPO VALUES (3,'BIMBA','Aun no han sido campeones pero prometen dar espectaculo.',0,1,'91823490O');

--Creamos la liga
INSERT INTO LIGA VALUES (1);

--Jornadas
INSERT INTO JORNADAS VALUES (1,To_Date('23/04/18','DD/MM/YY'),To_Date('23/05/18','DD/MM/YY'),1);

--Hacemos un partido
INSERT INTO PARTIDO VALUES (1,'Vitoria-Gasteiz',To_Date('23/04/18','DD/MM/YY'),'0',1);