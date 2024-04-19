# chat-application
Une application de chat avec des salons 



# Dans mon système je dispose de 2 utilisateurs et de 3 salons. 
- Les salons sont : 
  FR, USA, ANG 

  ## Les utilisateurs Quentin et Antonin
  - Quentin appartient au salon FR 
  - Antonin n'appartient à aucun salon 

  Réaliser un TU :
- Etant donné *3 salons*
- En tant que *Quentin*
- Quand *je demande mes salons*
- Alors *Je dispose du salon FR*

Se renseigner sur le principe 
Entité / service 

3 FICHIERS 
- un SalonService : logique, filtrer salon en fonction utilisateur etc. (classe)
- un iSalonRepository (interface) : méthode que me salonService à besoin
- un salonRepositoryJson qui implemente iSalonRepository qui parse un json

plus tard
- un salonRepositoryDao qui implemente iSalonRepository qui connecte a la bdd




## Ensemble des users stories du projet 

- Authentification et profil d'un utilisateur 
  - En tant qu'utilisateur, 
    - je souhaite m'inscrire à l'application en utilisant mon adresse e-mail et un mot de passe sécurisé afin de pouvoir accéder à ses fonctionnalités.
    - je souhaite me connecter à l'application en utilisant mon adresse e-mail et mon mot de passe afin d'accéder à mon compte.
    - je souhaite réinitialiser mon mot de passe avec mon adresse e-mail afin de pouvoir à nouveau accéder à l'application en cas d'oubli. 
    - je souhaite modifier mon profil en mettant à jour mes informations personnelles (nom, prénom, avatar, etc.)   afin de maintenir mes     données personnelles à jour.

- Fonctionnalités de base du Chat
  En tant qu'utilisateur, 
    - je souhaite créer un nouveau salon de discussion afin de communiquer avec d'autres utilisateurs.
    - je souhaite rejoindre un salon en utilisant un code d'invitation afin de participer aux conversations. 
    - je souhaite voir la liste des membres d'un groupe de discussion et leurs statuts de connexion afin de voir la disponibilité de chacun.
    - je souhaite pouvoir envoyer des messages dans un salon afin de discuter avec les membres. 

- Gestion des groupes
  - En tant qu'administrateur,
    - je souhaite générer un code d'invitation temporaire afin d'inviter des utilisateurs à rejoindre un salon.
    - je souhaite pouvoir exclure un utilisateur du salon afin d'assurer la sécurité et son bon fonctionnement.
 