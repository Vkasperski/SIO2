/* DATABASE : locaflot */

CREATE VIEW VueAout2000(dateloc,nbloc)
AS SELECT dateloc,COUNT(*)
FROM LOCATION
WHERE dateloc LIKE '2000-08%'
GROUP BY dateloc;


/* OU ALORS */

CREATE VIEW VueAout2000(dateloc,nbloc)
AS SELECT dateloc,COUNT(*)
FROM LOCATION
WHERE dateloc LIKE '2000-08%'
GROUP BY dateloc;


/* POUR AUTORISER */

GRANT SELECT 
ON VueAout2000
TO 'pvague'@'localhost';


/* nombre d'embarcation dispo possedant 2 places maximum par type */

CREATE VIEW NbEmbDispoParType(nomtype,prixdemih,nb_dispo)
AS SELECT nomtype,prixdemih,COUNT(numembarcation) AS nb_dispo
FROM EMBARCATION E, TYPEMBARCATION T
WHERE E.codetype = T.codetype
AND nbplace<=2
AND disponible = true
GROUP BY nomtype,prixdemih;

/* Affiche pour chaque locations son numéro,*
 date et heure de début */

 CREATE VIEW VueLoc(Numlocation,dateloc,heuredebut)
 AS SELECT Numlocation,dateloc,heuredebut
 FROM LOCATION;

 /* affiche les embarcations sans moteur */

 CREATE VIEW VueEmbPropres
 AS SELECT*
 FROM EMBARCATION
 WHERE codetype IN('B1','B2','P1','P2','P3')
 WITH CHECK OPTION;			/* Sinon il peut insert un autre codetype */

 /* WITH CHECK OPTION : Lors d'une mise à jour à TRAVERS de cette vue, Le SGBD verifie les conditions dans clause where 
						concerné par les enregistrements */