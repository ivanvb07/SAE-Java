public class Calculatrice { //initialisation de la classe test

    public static void main(String[] args) { //méthode main

        try { //on essaie d'exécuter les instructions du bloc try tant qu'aucune erreur/exception n'est détectée
            
	    Expression deux = new Nombre(2) ; //création d'un objet de type Expression avec le constructeur de la classe Nombre
	    System.out.println(deux); //appel de la méthode toString de la classe Nombre
		
	    Expression trois = new Nombre(3) ; //création d'un objet de type Expression avec le constructeur de la classe Nombre
	    System.out.println(trois); //appel de la méthode toString de la classe Nombre

	    Expression dixSept = new Nombre(17) ; //création d'un objet de type Expression avec le constructeur de la classe Nombre
            System.out.println(dixSept); //appel de la méthode toString de la classe Nombre

	    Expression s = new Soustraction(dixSept, deux) ; //création d'un objet de type Expression avec le constructeur de la classe Soustraction
	    System.out.println(s); //appel de la méthode toString de la classe Soustraction

	    Expression a = new Addition(deux, trois) ; //création d'un objet de type Expression avec le constructeur de la classe Addition
	    System.out.println(a);  //appel de la méthode toString de la classe Addition

	    Expression d = new Division(s, a) ; //création d'un objet de type Expression avec le constructeur de la classe Division
            System.out.println(d) ; //appel de la méthode toString de la classe Division
        }

        catch (ArithmeticException e) { //si une erreur/exception est détectée par le bloc try, alors catch l'attrape et exécute les instructions de son propre bloc
            System.out.println("Erreur " + e + " : division par zéro"); //affichage de l'exception, ici une division par zéro
        }
    }
}
