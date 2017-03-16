#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: EMPLOYER
#------------------------------------------------------------

CREATE TABLE EMPLOYER(
        id_emp       int (11) Auto_increment  NOT NULL ,
        nom_emp      Varchar (30) ,
        prenom_emp   Varchar (25) ,
        ad_ville_emp Varchar (100) ,
        ad_cp_emp    Varchar (5) ,
        ad_rue_emp   Varchar (100) ,
        tel_emp      Varchar (14) ,
        date_emb     Date ,
        diplome_emp  Varchar (25) ,
        PRIMARY KEY (id_emp )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: DEVELLOPEUR
#------------------------------------------------------------

CREATE TABLE DEVELLOPEUR(
        id_emp Int NOT NULL ,
        PRIMARY KEY (id_emp )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: chefProjet
#------------------------------------------------------------

CREATE TABLE chefProjet(
        id_emp Int NOT NULL ,
        PRIMARY KEY (id_emp )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: RESEAUX
#------------------------------------------------------------

CREATE TABLE RESEAUX(
        Environement Varchar (255) ,
        id_emp       Int NOT NULL ,
        PRIMARY KEY (id_emp )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: QUALIFICATION
#------------------------------------------------------------

CREATE TABLE QUALIFICATION(
        id_qualif      int (11) Auto_increment  NOT NULL ,
        libelle_qualif Varchar (100) ,
        PRIMARY KEY (id_qualif )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: METHODES
#------------------------------------------------------------

CREATE TABLE METHODES(
        id_meth      int (11) Auto_increment  NOT NULL ,
        libelle_meth Varchar (100) ,
        id_emp       Int ,
        PRIMARY KEY (id_meth )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: IDE
#------------------------------------------------------------

CREATE TABLE IDE(
        id_ide      int (11) Auto_increment  NOT NULL ,
        libelle_ide Varchar (100) ,
        PRIMARY KEY (id_ide )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: OS
#------------------------------------------------------------

CREATE TABLE OS(
        is_os      int (11) Auto_increment  NOT NULL ,
        libelle_os Varchar (40) ,
        PRIMARY KEY (is_os )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: METHODE_CONCEPT
#------------------------------------------------------------

CREATE TABLE METHODE_CONCEPT(
        id_mc      int (11) Auto_increment  NOT NULL ,
        libelle_mc Varchar (25) ,
        PRIMARY KEY (id_mc )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: PROJET
#------------------------------------------------------------

CREATE TABLE PROJET(
        num_contrat    int (11) Auto_increment  NOT NULL ,
        descriptif_pro Varchar (255) ,
        date_debut_pro Date ,
        id_emp         Int ,
        id_client      Int ,
        PRIMARY KEY (num_contrat )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: CLIENT
#------------------------------------------------------------

CREATE TABLE CLIENT(
        id_client      int (11) Auto_increment  NOT NULL ,
        nom_cli        Varchar (25) ,
        rue_cli        Varchar (100) ,
        ville_cli      Varchar (30) ,
        cp_cli         Varchar (5) ,
        tel_cli        Varchar (14) ,
        telecopie_clie Varchar (15) ,
        nom_contact    Varchar (25) ,
        PRIMARY KEY (id_client )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: MISSION
#------------------------------------------------------------

CREATE TABLE MISSION(
        num_ordre          int (11) Auto_increment  NOT NULL ,
        duree_optimal      Time ,
        descriptif_mission Varchar (255) ,
        num_contrat        Int NOT NULL ,
        PRIMARY KEY (num_ordre ,num_contrat )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: avoir
#------------------------------------------------------------

CREATE TABLE avoir(
        id_emp    Int NOT NULL ,
        id_qualif Int NOT NULL ,
        PRIMARY KEY (id_emp ,id_qualif )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: PROGRAMMER
#------------------------------------------------------------

CREATE TABLE PROGRAMMER(
        version Varchar (25) ,
        id_emp  Int NOT NULL ,
        id_ide  Int NOT NULL ,
        PRIMARY KEY (id_emp ,id_ide )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: CONNAITRE
#------------------------------------------------------------

CREATE TABLE CONNAITRE(
        id_emp Int NOT NULL ,
        is_os  Int NOT NULL ,
        PRIMARY KEY (id_emp ,is_os )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: UTILISER
#------------------------------------------------------------

CREATE TABLE UTILISER(
        id_mc  Int NOT NULL ,
        id_emp Int NOT NULL ,
        PRIMARY KEY (id_mc ,id_emp )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: AFFECTER
#------------------------------------------------------------

CREATE TABLE AFFECTER(
        date_debut  Date ,
        date_fin    Date ,
        id_emp      Int NOT NULL ,
        num_ordre   Int NOT NULL ,
        num_contrat Int NOT NULL ,
        PRIMARY KEY (id_emp ,num_ordre ,num_contrat )
)ENGINE=InnoDB;

ALTER TABLE DEVELLOPEUR ADD CONSTRAINT FK_DEVELLOPEUR_id_emp FOREIGN KEY (id_emp) REFERENCES EMPLOYER(id_emp);
ALTER TABLE chefProjet ADD CONSTRAINT FK_chefProjet_id_emp FOREIGN KEY (id_emp) REFERENCES EMPLOYER(id_emp);
ALTER TABLE RESEAUX ADD CONSTRAINT FK_RESEAUX_id_emp FOREIGN KEY (id_emp) REFERENCES EMPLOYER(id_emp);
ALTER TABLE METHODES ADD CONSTRAINT FK_METHODES_id_emp FOREIGN KEY (id_emp) REFERENCES EMPLOYER(id_emp);
ALTER TABLE PROJET ADD CONSTRAINT FK_PROJET_id_emp FOREIGN KEY (id_emp) REFERENCES EMPLOYER(id_emp);
ALTER TABLE PROJET ADD CONSTRAINT FK_PROJET_id_client FOREIGN KEY (id_client) REFERENCES CLIENT(id_client);
ALTER TABLE MISSION ADD CONSTRAINT FK_MISSION_num_contrat FOREIGN KEY (num_contrat) REFERENCES PROJET(num_contrat);
ALTER TABLE avoir ADD CONSTRAINT FK_avoir_id_emp FOREIGN KEY (id_emp) REFERENCES EMPLOYER(id_emp);
ALTER TABLE avoir ADD CONSTRAINT FK_avoir_id_qualif FOREIGN KEY (id_qualif) REFERENCES QUALIFICATION(id_qualif);
ALTER TABLE PROGRAMMER ADD CONSTRAINT FK_PROGRAMMER_id_emp FOREIGN KEY (id_emp) REFERENCES EMPLOYER(id_emp);
ALTER TABLE PROGRAMMER ADD CONSTRAINT FK_PROGRAMMER_id_ide FOREIGN KEY (id_ide) REFERENCES IDE(id_ide);
ALTER TABLE CONNAITRE ADD CONSTRAINT FK_CONNAITRE_id_emp FOREIGN KEY (id_emp) REFERENCES EMPLOYER(id_emp);
ALTER TABLE CONNAITRE ADD CONSTRAINT FK_CONNAITRE_is_os FOREIGN KEY (is_os) REFERENCES OS(is_os);
ALTER TABLE UTILISER ADD CONSTRAINT FK_UTILISER_id_mc FOREIGN KEY (id_mc) REFERENCES METHODE_CONCEPT(id_mc);
ALTER TABLE UTILISER ADD CONSTRAINT FK_UTILISER_id_emp FOREIGN KEY (id_emp) REFERENCES EMPLOYER(id_emp);
ALTER TABLE AFFECTER ADD CONSTRAINT FK_AFFECTER_id_emp FOREIGN KEY (id_emp) REFERENCES EMPLOYER(id_emp);
ALTER TABLE AFFECTER ADD CONSTRAINT FK_AFFECTER_num_ordre FOREIGN KEY (num_ordre) REFERENCES MISSION(num_ordre);
ALTER TABLE AFFECTER ADD CONSTRAINT FK_AFFECTER_num_contrat FOREIGN KEY (num_contrat) REFERENCES PROJET(num_contrat);
