ALTER TABLE commande
ADD CONSTRAINT fk_codec FOREIGN KEY (code_c) REFERENCES client (code_c),
ADD CONSTRAINT fk_codev FOREIGN KEY (code_v) REFERENCES vendeur (code_v);

ALTER TABLE ligne_commande
ADD CONSTRAINT fk_num FOREIGN KEY (numero) REFERENCES commande (numero),
ADD CONSTRAINT fk_ref FOREIGN KEY (reference) REFERENCES produit(reference);