package org.example;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Tester toString de chaque classe
        Main.Robot robot = new Main.Robot("Bob");
        Main.Fighter fighter = new Main.Fighter("John", 1234);

        System.out.println(robot.toString()); // Attendu : "Robot Bob"
        System.out.println(fighter.toString()); // Attendu : "Fighter John"

        // Tester le tir d'un robot sur un autre robot
        Main.Robot robot1 = new Main.Robot("Robot1");
        Main.Robot robot2 = new Main.Robot("Robot2");

        robot1.fire(robot2);
        System.out.println(robot2.toString()); // Attendu : "Robot Robot2" (healthPoints = 8)

        // Tester le combat d'un robot et un deuxième robot (méthode de la classe Arena)
        Main.Robot robot3 = new Main.Robot("Robot3");
        Main.Robot robot4 = new Main.Robot("Robot4");

        Main.Arena.fight(robot3, robot4);
        System.out.println(robot3.toString()); // Attendu : "Robot Robot3" ou "Robot Robot4" en fonction du vainqueur

        // Tester le fait qu'il est impossible de tirer sur un robot mort
        Main.Robot robot5 = new Main.Robot("Robot5");
        Main.Robot robot6 = new Main.Robot("Robot6");

        robot6.fire(robot5);
        robot5.fire(robot6);
        System.out.println(robot5.toString()); // Attendu : "Robot Robot5" (healthPoints = 8)

        // Tester le tir d'un humain sur un autre combattant
        Main.Fighter fighter1 = new Main.Fighter("Fighter1", 5678);
        Main.Fighter fighter2 = new Main.Fighter("Fighter2", 5678);

        fighter1.fire(fighter2);
        System.out.println(fighter2.toString()); // Attendu : "Fighter Fighter2" (healthPoints = 8)

        // Que pouvez-vous dire sur le test ?
        // Le test vérifie que les combattants humains (Fighter) peuvent rater leur cible lorsqu'ils tirent.
        // Cela est dû à l'utilisation de la classe java.util.Random pour générer des nombres aléatoires.
        //deploiyer sur github:
        /*
         -Il faut avoir un compte github(serveur distant), et avoir git sur sa machine physique(local)
         -sur linux, intaller git avec <sudo apt install git> et sur windows installer gitbash
         -créer un repository sur git (ex: Robot)
         -acceder au repertoire du projet (cd)
         -une fois dans le repertoire du projet, initialiser le depôt git vide(git init)
         -ensuite ajouter les fichier (git add .) pour tous ajouter
         -valider les commit avec (git commit - m "message de description")
         -associer a une branche, par defaut main ou master(git branch -M main)
         -generer un token classic depuis les parametre du developpeur(par defaut tu donne tous les acces)
         -lier ton projet local au depôt distant créer recemment en ajoutant le token( git remote add origin https://token@github.com/votre_username/Robot.git) sachant que Robot était le nom du dépôt
         -envoyer les fichiers (git push -u origin)
        */
    }
}
