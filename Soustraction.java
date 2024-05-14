public class Soustraction extends Operation { //initialisation de la classe Soustraction héritant d'Operation

    public Soustraction() { //constructeur par défaut
        super(); //appel du constructeur par défaut de Operation
    }

    public Soustraction(Nombre nb1, Nombre nb2){ //constructeur champ à champ
        super(nb1,nb2); //appel du constructeur champ à champ de Operation
    }

    public Soustraction(Soustraction s) { //constructeur par copie
        super(s); //appel du constructeur par copie de Operation
    }

    public int valeur(){ //implémentation de la méthode abstraite valeur() de Operation 
        return this.getOPerande1()-this.getOPerande2(); //renvoie la différence des 2 Opération
    }

    public String toString(){ //méthode toString
        String ch="Résultat de "+ this.getOPerande1() +" - " + 
        this.getOPerande2() + " : ";
        ch+=this.valeur();
        return ch;
    }
}
