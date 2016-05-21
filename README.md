MediaStrip
==========

# Composition
Le projet est composé en plusieurs sous-projets que voici :
* MediaStrip-model
> Contient les classes du modèle composant le diagramme de classes du projet.

* MediaStrip-persistence
> Contient les services de persistance de l'application, ainsi que des services fournisseurs de mocks.

# Compilation
Chaque sous-projet est un projet maven, et les sous-projets ont des dépendances entre eux pour pouvoir fonctionner.
Afin de compiler tous les projets d'un coup, il suffit d'exécuter le script **mavenInstall.sh** :

> sh mavenInstall.sh
