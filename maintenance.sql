CREATE TABLE Technicien(
   Id_Technicien INT AUTO_INCREMENT,
   nom VARCHAR(50),
   prenom VARCHAR(50),
   PRIMARY KEY(Id_Technicien)
);

CREATE TABLE Batiment(
   Id_Batiment INT AUTO_INCREMENT,
   localisation VARCHAR(50),
   nom VARCHAR(50),
   PRIMARY KEY(Id_Batiment)
);

CREATE TABLE Intervention(
   Id_Intervention INT AUTO_INCREMENT,
   type_intervention VARCHAR(50),
   PRIMARY KEY(Id_Intervention)
);

CREATE TABLE Agenda(
   Id_Agenda INT AUTO_INCREMENT,
   date_disponibilite DATE,
   PRIMARY KEY(Id_Agenda)
);

CREATE TABLE Avancement(
   Id_statut INT AUTO_INCREMENT,
   statut VARCHAR(50),
   PRIMARY KEY(Id_statut)
);

CREATE TABLE Qualification(
   Id_Qualification INT AUTO_INCREMENT,
   qualification VARCHAR(50),
   PRIMARY KEY(Id_Qualification)
);

CREATE TABLE Intervenir(
   Id_Technicien INT,
   Id_Batiment INT,
   Id_Intervention INT,
   Id_statut INT,
   date_intervention DATE,
   description VARCHAR(255),
   PRIMARY KEY(Id_Technicien, Id_Batiment, Id_Intervention, Id_statut),
   FOREIGN KEY(Id_Technicien) REFERENCES Technicien(Id_Technicien),
   FOREIGN KEY(Id_Batiment) REFERENCES Batiment(Id_Batiment),
   FOREIGN KEY(Id_Intervention) REFERENCES Intervention(Id_Intervention),
   FOREIGN KEY(Id_statut) REFERENCES Avancement(Id_statut)
);

CREATE TABLE disponible(
   Id_Technicien INT,
   Id_Agenda INT,
   PRIMARY KEY(Id_Technicien, Id_Agenda),
   FOREIGN KEY(Id_Technicien) REFERENCES Technicien(Id_Technicien),
   FOREIGN KEY(Id_Agenda) REFERENCES Agenda(Id_Agenda)
);

CREATE TABLE qualifie(
   Id_Technicien INT,
   Id_Qualification INT,
   PRIMARY KEY(Id_Technicien, Id_Qualification),
   FOREIGN KEY(Id_Technicien) REFERENCES Technicien(Id_Technicien),
   FOREIGN KEY(Id_Qualification) REFERENCES Qualification(Id_Qualification)
);

INSERT INTO Technicien (nom, prenom) VALUES
('Martin', 'Lucas'),
('Bernard', 'Claire'),
('Dubois', 'Julien'),
('Petit', 'Sophie'),
('Robert', 'Maxime'),
('Richard', 'Camille'),
('Durand', 'Emma'),
('Moreau', 'Alexandre'),
('Simon', 'Julie'),
('Laurent', 'Clément'),
('Lefebvre', 'Marine'),
('Michel', 'Baptiste'),
('Garcia', 'Laura'),
('David', 'Paul'),
('Bertrand', 'Alice'),
('Roux', 'Sébastien'),
('Vincent', 'Sarah'),
('Fournier', 'Benjamin'),
('Morel', 'Élise'),
('Girard', 'Louis'),
('Andre', 'Chloé'),
('Leroy', 'Guillaume'),
('Marchand', 'Manon'),
('Perez', 'Inès'),
('Leclerc', 'Samuel'),
('Gauthier', 'Nina'),
('Chevalier', 'Loïc'),
('Francois', 'Anaïs'),
('Legrand', 'Corentin'),
('Perrin', 'Mathilde');


INSERT INTO Avancement (statut) VALUES ('Planifiée'),('En cours'),('Terminée');


INSERT INTO Qualification (qualification) VALUES
('CAP Électricien'),
('CAP Installateur Thermique'),
('CAP Installateur Sanitaire'),
('CAP Maintenance des Bâtiments de Collectivité'),
('Bac Pro Technicien en Installation des Systèmes Énergétiques et Climatiques'),
('Bac Pro Technicien du Froid et du Conditionnement d''Air'),
('Bac Pro Maintenance des Équipements Industriels'),
('BTS Électrotechnique'),
('BTS Fluides Énergies Domotique'),
('BTS Maintenance des Systèmes'),
('DUT / BUT Génie Électrique et Informatique Industrielle'),
('Titre professionnel Technicien de Maintenance des Bâtiments'),
('Titre professionnel Technicien Frigoriste'),
('Titre professionnel Plombier Chauffagiste'),
('Titre professionnel Électricien d''équipement'),
('Habilitation électrique H0B0'),
('Habilitation électrique B1V'),
('Habilitation électrique B2V'),
('Habilitation électrique BR'),
('Habilitation électrique BC'),
('Habilitation BE Manœuvre'),
('Certificat SST (Sauveteur Secouriste du Travail)'),
('SSIAP 1 Agent de sécurité incendie'),
('Formation désamiantage opérateur'),
('Formation travaux en hauteur'),
('Permis de travail en espace confiné'),
('Attestation de compétence gaz (installation et maintenance gaz)'),
('Formation sécurité gaz et détection de fuites'),
('CACES Chariot élévateur'),
('CACES Nacelle / PEMP'),
('CACES Engins de chantier (pelle, chargeuse)'),
('Formation conduite sécurisée véhicules utilitaires'),
('Formation maintenance chaudières gaz'),
('Formation maintenance chaudières fioul'),
('Certification Pompe à Chaleur - installation et maintenance'),
('Formation Froid commercial'),
('Formation Froid industriel'),
('Formation récupération et gestion des fluides frigorigènes'),
('Attestation manipulation fluides frigorigènes (F-Gas)'),
('Formation HVAC / Climatisation - maintenance'),
('Formation GTB / GTC (Gestion Technique du Bâtiment)'),
('Formation Automatisme et Régulation'),
('Certification KNX Domotique'),
('Formation Ascenseurs - maintenance et sécurité'),
('Formation Traitement de l''eau en chaufferie et tours de refroidissement'),
('Formation Thermographie infrarouge - opérateur'),
('Formation Maintenance prédictive par vibrations'),
('Formation Maintenance prédictive par thermographie'),
('Formation Diagnostic énergétique bâtiment'),
('Qualification RGE (Reconnu Garant de l''Environnement)'),
('Qualification Qualifelec'),
('Qualification Qualibat'),
('Formation Gestion de la Maintenance Assistée par Ordinateur (GMAO)'),
('Formation Lecture de plans et schémas électriques'),
('Formation Hygiène et sécurité - risques chimiques'),
('Formation Gestion des déchets dangereux'),
('Formation Cybersécurité des systèmes industriels'),
('Formation Réglementation ERP et IGH'),
('Formation Relation client et gestion d''intervention'),
('Certification Étalonnage et contrôle d''instruments'),
('Formation Contrôle qualité des installations'),
('Certification Installation et maintenance photovoltaïque'),
('Certification Installation panneaux solaires thermiques');

