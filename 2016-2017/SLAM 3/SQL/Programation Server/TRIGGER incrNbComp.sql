/*
	incrémenter venseur.nbCom a chaques INSERT dans commande 
*/

delimiter @
DROP TRIGGER IF EXISTS incrNbCom;
CREATE TRIGGER incrNbCom AFTER INSERT ON commande
FOR EACH ROW
BEGIN
	UPDATE vendeur_save 
	SET nbCom = nbCom+1 WHERE vendeur_save.code_v = `NEW`.`code_v`;
END;
@
delimiter ;


delimiter @
DROP TRIGGER IF EXISTS incrNbCom;
CREATE TRIGGER incrNbCom AFTER DELETE ON commande
FOR EACH ROW
BEGIN
	UPDATE vendeur_save 
	SET nbCom = nbCom-1 WHERE vendeur_save.code_v = OLD.code_v;
END;
@
delimiter ;