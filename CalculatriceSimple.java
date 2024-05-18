public class CalculatriceSimple { //initialisation de la classe test

    public static void main(String[] args) { //méthode main

        Nombre n1 = new Nombre(5); //création de l'objet n1 de type Nombre avec comme valeurNombre 5 (appel du constructeur champ-à-champ de Nombre)
        System.out.println(n1); //appel de la méthode toString de la classe Nombre

        Nombre n2 = new Nombre(3); //création de l'objet n2 de type Nombre avec comme valeurNombre 3 (appel du constructeur champ-à-champ de Nombre)
        System.out.println(n2); //appel de la méthode toString de la classe Nombre

        Nombre n3 = new Nombre(0); //création de l'objet n3 de type Nombre avec comme valeurNombre 0 (appel du constructeur champ-à-champ de Nombre)
        System.out.println(n3); //appel de la méthode toString de la classe Nombre

        Operation o1 = new Addition(n1, n2); //création de l'objet o1 de type Operation (appel du constructeur champ-à-champ d'Addition qui appelle celui d'Operation)
        System.out.println(o1); //appel de la méthode toString de la classe Addition

        Operation o2 = new Soustraction(n1, n2); //création de l'objet o2 de type Operation (appel du constructeur champ-à-champ de Soustraction qui appelle celui d'Operation)
        System.out.println(o2); //appel de la méthode toString de la classe Soustraction

        Operation o3 = new Multiplication(n1, n2); //création de l'objet o3 de type Operation (appel du constructeur champ-à-champ de Multiplication qui appelle celui d'Operation)
        System.out.println(o3); //appel de la méthode toString de la classe Multiplication

        Operation o4 = new Division(n1, n2); //création de l'objet o4 de type Operation (appel du constructeur champ-à-champ de Division qui appelle celui d'Operation)
        System.out.println(o4); //appel de la méthode toString de la classe Division

        try { //on essaie d'exécuter les instructions du bloc try tant qu'aucune erreur/exception n'est détectée
            Operation o5 = new Division(n1, n3); //création de l'objet o5 de type Operation (appel du constructeur champ-à-champ de Division qui appelle celui d'Operation)
            System.out.println(o5); //appel de la méthode toString de la classe Division
        }

        catch (ArithmeticException e) { //si une erreur/exception est détectée par le bloc try, alors catch l'attrape et exécute les instructions de son propre bloc
            System.out.println("Erreur " + e + " : division par zéro"); //affichage de l'exception, ici une division par zéro
        }
    }
}
