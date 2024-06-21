public class Division extends Operation { // initialisation de la classe Division héritant d'Operation

    public Division() { // constructeur par défaut
        super(); // appel du constructeur par défaut de Operation
    }

    public Division(Expression nb1, Expression nb2) { // constructeur champ-à-champ
        super(nb1, nb2); // appel du constructeur champ-à-champ de la classe Operation
    }

    public Division(Operation d) { // constructeur par copie
        super(d); // appel du constructeur par copie de la classe Operation
    }

    public double valeur() throws ArithmeticException { // implémentation de la méthode abstraite valeur de la classe Expression en précisant qu'elle peut déclencher une exception (division par 0)
        if (this.getOPerande2().valeur() == 0) // vérifie si la deuxième opérande vaut 0 afin de traiter la division par zéro
            throw (new ArithmeticException()); // déclenche une exception de type arithmétique qui sera traitée par le main de la classe test Calculatrice
        return this.getOPerande1().valeur() / this.getOPerande2().valeur(); // renvoie le résultat de la division des valeurs des deux opérandes de l'objet courant (this)
    }

    public String toString() { // méthode toString
        String ch = "Résultat de " + this.getOPerande1().valeur() + " ÷ " +
                this.getOPerande2().valeur() + " : ";
        ch += this.valeur();
        return ch;
    }
}
