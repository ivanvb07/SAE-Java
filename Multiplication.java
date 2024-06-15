public class Multiplication extends Operation { // initialisation de la classe Multiplication héritant d'Operation

    public Multiplication() { // constructeur par défaut
        super(); // appel le constructeur par défaut de Operation
    }

    public Multiplication(Expression nb1, Expression nb2) { // constructeur champ à champ
        super(nb1, nb2); // appel du constructeur champ à champ de Operation
    }

    public Multiplication(Operation m) { // constructeur par copie
        super(m); // appel du constructeur par copie de Operation
    }

    public double valeur() { // implémentation de la méthode abstraite valeur() de la classe Expression
        return this.getOPerande1().valeur() * this.getOPerande2().valeur(); // retourne le produit des valeurs des deux opérandes
    }

    public String toString() { // méthode toString
        String ch = "Résultat de " + this.getOPerande1().valeur() + " x " +
                this.getOPerande2().valeur() + " : ";
        ch += this.valeur();
        return ch;
    }
}
