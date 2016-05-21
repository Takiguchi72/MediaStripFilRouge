#/bin/sh

#==============================================================================
#
# Permission vous est donnée de copier,
# distribuer et/ou modifier ce document selon les termes de la Licence
# GNU Free Documentation License, Version 1.3 ou ultérieure publiée
# par la Free Software Foundation ; sans section inaltérable, sans texte
# de première page de couverture et sans texte de dernière page de
# couverture. Une copie de cette Licence est incluse dans la section
# appelée « GNU Free Documentation License » de ce document.
#
#==============================================================================
#
# Ce script permet de compiler l'ensembles des sous-projets du projet
# MediaStrip, via Maven.
#
#==============================================================================

#==================
# Variables
#==================
projetModel='MediaStrip-model'
projetPersistence='MediaStrip-persistence'

#==================
# Fonctions
#==================

#//////////////////////////////////////////////////////////
# \brief Affiche un message d'erreur lorsque la compilation
#	maven a échouée, et termine le script avec le code
#	retour 1.
#
# \param $1 Le nom du projet à compiler.
#//////////////////////////////////////////////////////////
showCompilationError() {
	echo "Une erreur est survenue lors de la compilation du projet \"$1\""
	cd ..
	exit 1
}

#//////////////////////////////////////////////////////////
# \brief Affiche le message indiquant le début de la
#	compilation du projet passé en paramètre.
#
# \param $1 Le nom du projet à compiler.
#//////////////////////////////////////////////////////////
showCompilationMessage() {
	echo ""
	echo "********************************************************************************"
	echo " Compilation du projet \"$1\"..."
	echo "********************************************************************************"
	echo ""
}

#//////////////////////////////////////////////////////////
# \brief Exécute la compilation maven en se plaçant dans le
#	répertoire du projet puis en lançant la compilation
#	tout en vérifiant le code retour maven.
#
# \param $1 Le projet à compiler
#//////////////////////////////////////////////////////////
compile() {
	showCompilationMessage $1

	cd $1 && mvn clean install

	if [ $? -ne 0 ]
	then
		showCompilationError $1
	fi

	cd ..
}

#=======================
# Programme principal
#=======================

tableauProjets="$projetModel $projetPersistence"

for projet in $tableauProjets
do
	compile $projet
done

echo ""
echo "********************************************************************************"
echo " Compilation réussie !"
echo "********************************************************************************"
echo ""

exit 0

