CREATE DATABASE  IF NOT EXISTS `ssiinomore`;
USE `ssiinomore`;


DROP TABLE IF EXISTS `role`;

CREATE TABLE role (
   `id` int(2) NOT NULL,
   `intitule` varchar (50) NOT NULL,
   
   PRIMARY KEY (`id`)
) ENGINE=InnoDB;


DROP TABLE IF EXISTS `utilisateur`;

CREATE TABLE utilisateur (
   `id`  int (11) Auto_increment  NOT NULL,
   `adresseIP` varchar (15) NOT NULL,
   `nom` varchar (50) NOT NULL,
   `prenom` varchar (50) NOT NULL,
   `dateInscription` date NOT NULL,
   `login` varchar (50) NOT NULL,
   `password` varchar (255) NOT NULL,
   `actif` tinyint(1) NOT NULL,
   `id_role` int(11) NOT NULL,
    PRIMARY KEY (`id`),
  CONSTRAINT `FK_UTILISATEUR_ROLE` FOREIGN KEY (`id_role`) REFERENCES `role` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `entreprise`;

CREATE TABLE `entreprise` (
  `siren` varchar(9) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `sigle` varchar(20),
  `codePostal` int(5) NOT NULL,
  `ville` varchar(50) NOT NULL,
  `radie` tinyint(1) NOT NULL,
  `nbRecherches` int(5) NOT NULL,
  
  PRIMARY KEY (`siren`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `evaluation`;

CREATE TABLE `evaluation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dateEval` date NOT NULL,
  `duree` int(10) NOT NULL,
  `statutContractuel` varchar(30) NOT NULL,
  `posteOccupe` varchar(30) NOT NULL,
  `avis` int(2) NOT NULL,
  `nbSignalements` int(30) NOT NULL,
  
  `siren_entreprise` varchar(9) NOT NULL,
  `id_utilisateur` int(11),
  
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_EVALUATION_ENTREPRISE` FOREIGN KEY (`siren_entreprise`) REFERENCES `entreprise` (`siren`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_EVALUATION_UTILISATEUR` FOREIGN KEY (`id_utilisateur`) REFERENCES `utilisateur` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;