-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

insert into usuario (idUsuario, nome)
values(1, 'Miguel');

insert into usuario (idUsuario, nome)
values(2, 'Laura');

insert into usuario (idUsuario, nome)
values(3, 'Carol');

insert into animal (idAnimal, nomeAnimal, porteCachorro)
values(1, 'Shenka', 'PEQUENO');

insert into animal (idAnimal, nomeAnimal, porteCachorro)
values(1, 'Agnes', 'PEQUENO');

insert into animal (idAnimal, nomeAnimal, porteCachorro)
values(1, 'Bidu', 'PEQUENO');

INSERT INTO animal_usuario (idAnimal, idUsuario) VALUES (1, 1);

INSERT INTO animal_usuario (idAnimal, idUsuario) VALUES (1, 2);

INSERT INTO animal_usuario (idAnimal, idUsuario) VALUES (2, 3);

INSERT INTO animal_usuario (idAnimal, idUsuario) VALUES (3, 3);