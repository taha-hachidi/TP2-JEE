J'ai installé IntelliJ Ultimate sur mon système
Ensuite, j'ai créé un projet Spring Initializer avec les dépendances JPA, H2, Spring Web et Lombock.
J'ai développé l'entité JPA Product avec les attributs requis : id (Long), name (String), price (double), et quantity (int).
Pour la configuration de l'unité de persistance, j'ai modifié le fichier application.properties.
J'ai mis en place l'interface JPA Repository en utilisant Spring Data.
Ensuite, j'ai testé différentes opérations de gestion des produits :
Ajout de produits
Consultation de tous les produits
Consultation d'un produit spécifique
Recherche de produits
Mise à jour d'un produit
Suppression d'un produit
Pour migrer de H2 Database vers MySQL, j'ai effectué les mêmes opérations tout en ajustant la configuration pour utiliser MySQL comme base de données au lieu de H2.
Puis j'ai repris l'exemple du patient et les classes qui l'accompagne et j'ai utilisé one to many , many to many et one to one
