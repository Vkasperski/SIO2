DROP PROCEDURE IF EXISTS ipDate;
CREATE PROCEDURE ipDate(d DATE)
	BEGIN
		DECLARE jour int;
		DECLARE Dat varchar(30);
		DECLARE PAIMP varchar(10);

		SET jour = DAY(d);
		SET Dat = affDate(d);
		
		IF MOD(jour,2) = 0 THEN
			SET PAIMP="paire";
		ELSE
			SET PAIMP="impaire";
		END IF;

		SELECT CONCAT("Date du jour : ",Dat," c'est un jour ",PAIMP ) AS "DATE";
	END;
@