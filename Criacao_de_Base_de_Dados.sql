DROP DATABASE IF EXISTS `basket_6735639`;
CREATE DATABASE `basket_6735639`;
USE `basket_6735639`;

CREATE TABLE `bolas` (
	`ID` INT(11) NOT NULL AUTO_INCREMENT,
	`Nome` VARCHAR(50) NOT NULL DEFAULT '0' COLLATE 'utf8mb4_general_ci',
	`Preco` DECIMAL(8,2) NOT NULL DEFAULT '0.00',
	`Fabricante` VARCHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	`Material` VARCHAR(50) NOT NULL DEFAULT '0.00',
	`Tamanho` INT(1) NOT NULL DEFAULT '7' COLLATE 'utf8mb4_general_ci',
	`TipoUso` VARCHAR(20) NOT NULL DEFAULT 'Interior/Exterior' COLLATE 'utf8mb4_general_ci',
	`Cor` VARCHAR(50) NOT NULL DEFAULT 'Laranja' COLLATE 'utf8mb4_general_ci',
	PRIMARY KEY (`ID`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=INNODB;

INSERT INTO `bolas`(`Nome`,`Preco`,`Fabricante`,`Material`,`Tamanho`,`TipoUso`,`Cor`) VALUES
    ('SPALDING NBA GAMEBALL REPLICA' , 60.00,  'SPALDING', 'goma', 7, 'Interior/Exterior', 'Laranja'),
    ('NIKE AIR JORDAN SKILLS'        , 25.00,  'NIKE'    , 'goma', 3, 'Interior/Exterior', 'Azul'),
    ('NIKE AIR JORDAN HYPER ELITE 8P', 100.00, 'NIKE'    , 'goma', 7, 'Interior'         , 'DARK AMBER');            