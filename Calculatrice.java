public class Calculatrice { //initialisation de la classe test

    public static void main(String[] args) { //méthode main

        try { //on essaie d'exécuter les instructions du bloc try tant qu'aucune erreur/exception n'est détectée
            
	          Expression deux = new Nombre(2) ;
	          System.out.println(deux);
		
	          Expression trois = new Nombre(3) ;
	          System.out.println(trois);

	          Expression dixSept = new Nombre(17) ;
	          System.out.println(dixSept);

	          Expression s = new Soustraction(dixSept, deux) ;
	          System.out.println(s);

	          Expression a = new Addition(deux, trois) ;
	          System.out.println(a);

	          Expression d = new Division(s, a) ;
            System.out.println(d) ;
        }

        catch (ArithmeticException e) { //si une erreur/exception est détectée par le bloc try, alors catch l'attrape et exécute les instructions de son propre bloc
            System.out.println("Erreur " + e + " : division par zéro"); //affichage de l'exception, ici une division par zéro
        }
    }
}
