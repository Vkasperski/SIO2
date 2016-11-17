DROP FUNCTION IF EXISTS affDate;
CREATE FUNCTION  affDate(MaDate date) RETURNS varchar(30)
BEGIN
	DECLARE Njour int(1);
	DECLARE jours varchar(10);
	DECLARE Nmois int(1);
	DECLARE mois varchar(10);
	DECLARE Annee varchar(4);

	SET Njour=WEEKDAY(MaDate);
	SET Nmois=MONTH(MaDate);
	SET Annee=YEAR(MaDate);

	CASE Njour
	WHEN 0 THEN SET jours="Lundi "; 
	WHEN 1 THEN SET jours="Mardi "; 
	WHEN 2 THEN SET jours="Mercredi "; 
	WHEN 3 THEN SET jours="Jeudi "; 
	WHEN 4 THEN SET jours="Vendredi "; 
	WHEN 5 THEN SET jours="Samedi "; 
	WHEN 6 THEN SET jours="Dimanche ";
	ELSE SET jours=" DAY ERROR ";
	END CASE;

	CASE Nmois
	WHEN 1 THEN SET mois=" Janvier";
	WHEN 2 THEN SET mois=" Fervrier";
	WHEN 3 THEN SET mois=" Mars";
	WHEN 4 THEN SET mois=" Avril";
	WHEN 5 THEN SET mois=" Mai";
	WHEN 6 THEN SET mois=" juin";
	WHEN 7 THEN SET mois=" Juillet";
	WHEN 8 THEN SET mois=" Août";
	WHEN 9 THEN SET mois=" Septembre";
	WHEN 10 THEN SET mois=" Octobre";
	WHEN 11 THEN SET mois=" Novembre";
	WHEN 12 THEN SET mois=" Decembre";
	ELSE SET mois=" MONTH ERROR ";
	END CASE;
	
	RETURN CONCAT(jours,DAY(MaDate),mois,' ',Annee);
END;
@

SELECT numero,affDate(date_commande) AS 'DATE DE LA COMMANDE'
FROM commande;
@