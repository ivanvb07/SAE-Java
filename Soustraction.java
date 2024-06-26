public class Soustraction extends Operation { // initialisation de la classe Soustraction héritant d'Operation

    public Soustraction() { // constructeur par défaut
        super(); // appel du constructeur par défaut de Operation
    }

    public Soustraction(Expression nb1, Expression nb2) { // constructeur champ à champ
        super(nb1, nb2); // appel du constructeur champ à champ de Operation
    }

    public Soustraction(Operation s) { // constructeur par copie
        super(s); // appel du constructeur par copie de Operation
    }

    public double valeur() { // implémentation de la méthode abstraite valeur() de Expression
        return this.getOPerande1().valeur() - this.getOPerande2().valeur(); // renvoie la différence des valeurs des deux opérandes de l'objet courant (this)
    }

    public String toString() { // méthode toString
        String ch = "Résultat de " + this.getOPerande1().valeur() + " - " +
                this.getOPerande2().valeur() + " : ";
        ch += this.valeur();
        return ch;
    }
}
