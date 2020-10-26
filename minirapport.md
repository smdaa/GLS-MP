# SimplePDL

- contraintes OCL :

 une dépendance ne peut pas être réflexive. 

 deux sous-activités différentes d’un même processus ne peuvent pas avoir le même nom.

 le nom d’une activité doit être composé d’au moins un caractère.

 Le nom d’une resource doit être composé d’au moins un caractère.

 deux ressources ne peuvent pas avoir le même nom.
 
 la quantité d'une ressource doit être >= 0 
 
 la quantité d'une ressource usé doit être > 0
 
 la quantité d'un ressource utilisé par une activité doit être inferieur ou égale à la quantité disponible
 
 
# PetriNet

- contraintes OCL :

 un arc doit suivre le modele suivant place arc transition arc place.

 le poids d'un arc ne peut pas être nul (sinon l'arc ne sert à rien).
 
 le nombre des jetons dans une place est postive.

 le nom d’une node doit être composé d’au moins un caractère.

 deux nodes différentne peuvent pas avoir le même nom.
 
 le nom d’un réseau Petri doit être composé d’au moins un caractère.
 
 test repo
 
