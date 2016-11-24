DROP database sucrerie IF EXIST;
create database sucrerie;
use sucrerie;
CREATE TABLE client
(
	code_c    int (3) AUTO_INCREMENT,
	nom	      varchar (50),
	prenom	  varchar (50)
	adresse  varchar (150),
	cp 		  varchar (5),
	ville     varchar (30),
	telephone varchar (15),
	CONSTRAINT pk_cli PRIMARY KEY code_c 
)engine=Innodb;

CREATE TABLE vendeur
(
	code_v    int (3) AUTO_INCREMENT,
	nom 	  varchar (10),
	prenom    varchar (50)
	adresse  varchar (150),
	cp 		  varchar (51100),
	ville     varchar (30),
	telephone varchar (15),
	CONSTRAINT pk_ven PRIMARY KEY code_v
)engine=Innodb;

CREATE TABLE produit
(
	reference   int (5) AUTO_INCREMENT,
	designation varchar (100),
	quantite 	int (5), 
	descriptif  varchar (1),
	prix_unitaire_ht decimal (3,2),
	stock		int (4),
	poids_piece int (3),
	CONSTRAINT pk_pro PRIMARY KEY reference
)engine=Innodb;

CREATE TABLE commande
(
	numero		   int (5) AUTO_INCREMENT,
	code_v		   int (3) AUTO_INCREMENT,
	code_c		   int (3) AUTO_INCREMENT,
	date_livraison date,
	date_commande  date,
	total_ht	   decimal(5,2),
	total_tva      decimal(4,2),
	etat           boolean,
	CONSTRAINT pk_com PRIMARY KEY numero
)engine=Innodb;

CREATE TABLE ligne_commande
(
	numero 			  int (5) AUTO_INCREMENT,
	numero_ligne      int (2),
	reference		  int (5) AUTO_INCREMENT,
	quantite_demandee int (2),
	CONSTRAINT pk_lco PRIMARY KEY (numero,reference)
)engine=Innodb;