/*4.1*/

SELECT numeroVol,raison,duree,nbPassagers,distance
FROM Retard r, Mouvement Mouvement
WHERE r.idmvt = m.id
AND getdate(dateHeureDepart) = YESTERDAY()
ORDER BY 1;

/*4.2*/
/*
La valeur 2 signifie qu'il y a eu deux vols retardé en mars 2014 dont la durée du retard
est compris entre 15 et 120 minutes dont la distance ne dépasse pas 1500km.
*/

/*4.3*/
SELECT COUNT(id_Mvt)
FROM volRetardes
WHERE distance<1500
AND retardTotal >=15
AND retardTotal <120
AND GETDATE(dateHeureDepart)>= '01/03/2014'
AND GETDATE(dateHeureDepart)<= '31/03/2014'
/*OU ALORS*/
SELECT COUNT(id_Mvt)
FROM volRetardes
WHERE distance<1500
AND retardTotal >=15
AND retardTotal <120
AND YEAR(dateHeureDepart)=2014
AND MONTH(dateHeureDepart)=3;

/*4.4*/
SELECT distance,nbPassagers,estIntracom,retardTotal INTO var_distance, var_passagers, 
var_intra_com, var_retard
FROM volRetardes
WHERE idmvt = id_Mouvement;
var_indemnite :=0 ;
IF(p_seuilretard<var_retard)THEN
	var_indemnite := p_montant1;
	IF(var_distance>p_distance1)THEN
		var_indemnite := p_montant2;
		IF(var_intra_com = 0 AND var_distance>p_distance2)THEN
			var_indemnite := p_montant3;
		ENDIF
	ENDIF
ENDIF
var_indemnite := var_indemnite*var_nb_passager 

/*4.5*/
/*
Connaître le nombre retard par type de retard, par aeroport
*/