delimiter @
DROP PROCEDURE IF EXISTS precotion;

CREATE PROCEDURE precotion()
	BEGIN
		CREATE TABLE produit_save AS SELECT* FROM produit;
		CREATE TABLE ligne_commande_save AS SELECT* FROM ligne_commande;

		ALTER TABLE ligne_commande_save ENGINE = InnoDB;	
		ALTER TABLE produit_save ENGINE = InnoDB;

		ALTER TABLE produit_save
		ADD CONSTRAINT pk_ref_save PRIMARY KEY (reference);
			
		ALTER TABLE ligne_commande_save 
		ADD CONSTRAINT pk_lco_save PRIMARY KEY (numero,reference),
		ADD CONSTRAINT fk_num_save FOREIGN KEY (numero) REFERENCES commande (numero),
		ADD CONSTRAINT fk_ref_save FOREIGN KEY (reference) REFERENCES produit_save(reference);		
	END;
@
delimiter ;


CREATE PROCEDURE ModifReference(reference int(5))
	BEGIN
		/*
			-	Supprimer les contraintes : -	clé primaire sur "produit" (en 2ème) 
											-	clé étangère sur lign_com(reference) (en 1er)

			-	Modifier le type et la longueur de référence dans produit
			-	IDEM dans ligne commande 

			FONCTION A UTILISER :
				-	SUBSTR
				-	CONCAT 
		
			-	Recréer les containtes (Dans l'ordre)
		*/

		ALTER TABLE ligne_commande_save DROP FOREIGN KEY fk_ref_save;
		ALTER TABLE produit_save DROP PRIMARY KEY pk_ref_save;


	END;