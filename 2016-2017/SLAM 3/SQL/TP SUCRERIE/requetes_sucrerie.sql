/*1*/
SELECT nom, adresse, telephone 
FROM client 
WHERE nom LIKE '_a_in%';

/*2*/
SELECT numero
FROM commande co, client cl
WHERE co.code_c = cl.code_c AND nom_client='RABIN';

/*3*/
SELECT DISTINCT designation 
FROM produit, commande, ligne_commande, client
WHERE COMMANDE.code_c = CLIENT.code_c
AND COMMANDE.numero = LIGNE_COMMANDE.numero 
AND PRODUIT.reference = LIGNE_COMMANDE.reference 
AND nom ='Rabin';

/*4*/
SELECT SUM(total_ht) AS total_commande
FROM commande, client 
WHERE COMMANDE.code_c = CLIENT.code_c
AND nom ='Rabin';

/*5*/
/*SELECT SUM(prix_unitaire_ht) AS prix_total_HT 
/*FROM produit, commande, client 
/*WHERE COMMANDE.code_c = CLIENT.code_c  
/*AND nom ='Rabin';
/*
/* /*6*/
/*SELECT SUM(total_ht) AS Chiffre_affaire_total 
/*FROM commande 
/*WHERE YEAR(date_livraison)="2008" AND MONTH(date_livraison)="10";
/*
/* /*7*/
/*SELECT nom_v, SUM(total_ht) AS CA
/*FROM commande c, vendeur v
/*WHERE c.code_v = v.code_v
/*AND YEAR(date_livraison)="2008" AND MONTH(date_livraison)="10";
/*
/* /*8*/
/*
/* /*10*/
/*CREATE TABLE commission
/*(
/*	code_com int(3) AUTO_INCREMENT,
/*	libellé_com varchar(150),
/*	pourcentage_com decimal(1,2),
/*	CONSTRAINT pk_com PRIMARY KEY (code_com)
/*);
/* /*11*/
/*ALTER TABLE vendeur
/*ADD code_com int(3);
/*
/*ALTER TABLE vendeur
/*ADD CONSTRAINT fk_codeCom FOREIGN KEY (code_com) REFERENCES commission (code_com),
/* /*12*/
/*SELECT designation, (prix_unitaire_ht*1000)/quantite_produit AS prix_kilogramme FROM PRODUIT WHERE descriptif='G';
/*
/* /*13*/
/*SELECT SUM((quantite_produit/1000)*stock) AS poids_total_stock FROM PRODUIT WHERE descriptif='G';
/*
/* /*14*/
/*SELECT code_c, MAX(total_ht+total_tva) AS [total]
/*FROM commande;
/* /*15*/
/*SELECT nom, MAX(total_ht+total_tva) AS [total]
/*FROM client, commande
/*WHERE client.code_c = commande.code_c;
/* /*16*/
/*SELECT designation FROM produit WHERE prix_unitaire_ht = (SELECT prix_unitaire_ht FROM produit WHERE designation ='FRAISIBUS');
