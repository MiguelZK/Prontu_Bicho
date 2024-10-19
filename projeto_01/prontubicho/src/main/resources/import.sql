-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

-- Inserindo usuarios
insert into usuario (idUsuario, nomeCompleto, userName, password, role)
values(1, 'Miguel', 'miguel', 'senha123', 'admin, user');
insert into usuario (idUsuario, nomeCompleto, userName, password, role)
values(2, 'Laura', 'laura', 'senha456', 'user');
insert into usuario (idUsuario, nomeCompleto, userName, password, role)
values(3, 'Carol', 'carol', 'senha789', 'user');

-- Inserindo animais
insert into animal (idAnimal, nomeAnimal, porteCachorro) values(1, 'Shenka', 'PEQUENO');
insert into animal (idAnimal, nomeAnimal, porteCachorro) values(2, 'Agnes', 'PEQUENO');
insert into animal (idAnimal, nomeAnimal, porteCachorro) values(3, 'Bidu', 'PEQUENO');

-- Relacionando usuarios e animais
INSERT INTO animal_usuario (idAnimal, idUsuario) VALUES (1, 1);
INSERT INTO animal_usuario (idAnimal, idUsuario) VALUES (1, 2);
INSERT INTO animal_usuario (idAnimal, idUsuario) VALUES (2, 3);
INSERT INTO animal_usuario (idAnimal, idUsuario) VALUES (3, 3);