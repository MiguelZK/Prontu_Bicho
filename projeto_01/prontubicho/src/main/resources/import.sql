-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

-- Inserindo usuarios
insert into usuario (idUsuario, nome, userName, password, role)
values(1, 'Miguel', 'miguel', 'senha123', 'admin, user');
insert into usuario (idUsuario, nome) values(2, 'Laura');
insert into usuario (idUsuario, nome) values(3, 'Carol');

-- Inserindo animais
insert into animal (idAnimal, nomeAnimal, porteCachorro) values(1, 'Shenka', 'PEQUENO');
insert into animal (idAnimal, nomeAnimal, porteCachorro) values(2, 'Agnes', 'PEQUENO');
insert into animal (idAnimal, nomeAnimal, porteCachorro) values(3, 'Bidu', 'PEQUENO');

-- Relacionando usuarios e animais
INSERT INTO animal_usuario (idAnimal, idUsuario) VALUES (1, 1);
INSERT INTO animal_usuario (idAnimal, idUsuario) VALUES (1, 2);
INSERT INTO animal_usuario (idAnimal, idUsuario) VALUES (2, 3);
INSERT INTO animal_usuario (idAnimal, idUsuario) VALUES (3, 3);