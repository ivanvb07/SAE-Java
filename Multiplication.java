public class Multiplication extends Operation { //initialisation de la classe Multiplication héritant d'Operation

    public Multiplication() { //constructeur par défaut
        super(); //appel le constructeur par défaut de Operation
    }

    public Multiplication(Nombre nb1, Nombre nb2){ //constructeur champ à champ
        super(nb1,nb2); //appel du constructeur champ à champ de Operation
    }

    public Multiplication(Multiplicationm) { //constructeur par copie
        super(m); //appel du constructeur par copie de Operation
    }
  
    public int valeur(){ //implémentation de la méthode abstraite valeur() de Operation
        return this.getOPerande1() * this.getOPerande2(); //retourne le produit des deux opérandes
    }

    public String toString(){ //méthode toString
        String ch="Résultat de "+ this.getOPerande1() +" x " + 
        this.getOPerande2() + " : ";
        ch+=this.valeur();
        return ch;
    }
}
