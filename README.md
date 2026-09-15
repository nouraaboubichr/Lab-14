# Exercice 1 - CRUD Complet avec DAO Générique

* Structurer l’application en plusieurs couches : **Bean (Modèle), DAO, Service et Présentation**.
* La couche **Bean** contient les entités métier `Profile` et `Utilisateur`, qui implémentent **`Identifiable`** et possèdent un ID auto-incrémenté.
* L’interface **`Identifiable`** permet à toutes les entités de fournir leur identifiant avec **`getId()`**.
* L’interface générique **`Dao<T extends Identifiable>`** définit les opérations CRUD : **`create`**, **`update`**, **`delete`**, **`findById`** et **`findAll`**.
* **`ListDao<T>`** implémente le DAO en mémoire avec une **`ArrayList<T>`**.
* La couche **Service** encapsule le DAO et applique la logique métier pour gérer les profils et les utilisateurs.
* `UserService` ajoute une recherche métier avec **`findByProfile()`** pour trouver les utilisateurs d’un profil donné.
* La classe **`TestApp`** représente la couche présentation et teste les opérations **CREATE, READ, UPDATE et DELETE**.
* L’architecture permet une **séparation des responsabilités**, une meilleure **maintenance**, une bonne **testabilité** et la **réutilisation** du DAO générique.
* Le flux de données est : **App → Service → DAO → Modèle**.
* Le DAO générique permet de passer plus facilement d’un stockage en mémoire à un stockage **JDBC ou NoSQL** sans modifier les services ni l’application.

## Récapitulatif des méthodes DAO

* **`create(T obj)`** : ajoute un objet.
* **`update(T obj)`** : remplace l’objet existant ayant le même ID.
* **`delete(int id)`** : supprime l’objet identifié.
* **`findById(int id)`** : recherche un objet par son ID.
* **`findAll()`** : retourne la liste de tous les objets.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />
