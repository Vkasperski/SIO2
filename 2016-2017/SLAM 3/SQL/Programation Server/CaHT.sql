/*
	Retourner le CA HT d'un vendeurdont l'id est passé en paramettre
	Tester la foction : afficher le num, le nom et le CA des vendeurs
*/

delimiter @
DROP FUNCTION IF EXISTS CaHT;

CREATE FUNCTION CaHT(id int(2)) RETURNS int
BEGIN
	DECLARE Ca int;
	SET Ca = (SELECT SUM(total_ht) FROM commande WHERE code_v = id);
	RETURN Ca;
END;
@
delimiter ;

