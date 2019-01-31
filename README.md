# Calcul mental aléatoire java

## Présentation du projet

* Travail réalisé

Création d'une classe Account stocker dans la base de donnée avec un nom d'utilisateur rentré par le joueur, et un score qui sera défini par le dernier score qu'il obtiendra.
Il pourra ensuite afficher les meilleurs score des meilleurs utilisateur. Ces scores sont rangé par ordre décroissant, c'est à dire le plus fort score en haut.
Une fois la connexion effectué, l'utilisateur peut choisir sa difficutlé, c'est à dire soit un calcul d'addition, de soustraction ou de multiplication de deux nombres. Deux autres difficultés sont l'aléatoire dit "facile" entre les additions, soustraction et multiplication avec deux nombres, ou une difficulté aléatoire dit "difficile" également entre les trois opérateurs mais avec trois nombres au lieu de deux.

* Travail supplémentaire possible

Créer grâce à un mot de passe la connexion avec un utilisateur et donc pouvoir rajouter de nouveau score pour un utilisateur.
Ajouter une liste de score à un utilisateur. Ou de façon plus propre (comme on a essayer de le faire) utiliser une classe score dans la base de donnée et faire la liaison entre les scores et les accounts.
Ajouter un timer pour chaque calcul et passer à au calcul suivant si l'utilisateur na pas rentré la réponse à temps.
Grâce à une table score, on pourrais trier les scores en fonction des difficultés.

## Prérequis

* Base de données

Avant de lancer le projet, il faut créer une nouvelle base de données, celle ci est appelé : scorecalcul dans notre programme.
Le port de la base de donnée est également à modifier si votre port ne correspond pas à celui mis actuellement. (A modifier dans le fichier : persistence.xml)

* Importation des Librairies

Penser à rajouter la librairie Hibernate au projet avant le lancement de celui ci :
Il faut aller dans : File => ProjectStructure => librairies
Pensez à supprimer l'ancienne librairie hibernate pour ajouter la votre.
