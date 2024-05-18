public class Addition extends Operation { // initialisation de la classe Addition héritant d'Operation

  public Addition() { // constructeur par défaut
    super(); // appel du constructeur par défaut de la classe Operation
  }

  public Addition(Nombre nb1, Nombre nb2) { // constructeur champ-à-champ
    super(nb1, nb2); // appel du constructeur champ-à-champ de la classe Operation
  }

  public Addition(Addition a) {// constructeur par copie
    super(a); // appel du constructeur par copie de la classe Operation
  }

  public int valeur() { // implémentation de la méthode abstraite valeur de la classe Operation
    return this.getOPerande1().valeur() + this.getOPerande2().valeur(); // renvoie la somme des valeurs des deux opérandes
  }

  public String toString() { // méthode toString
    String ch = "Résultat de " + this.getOPerande1().valeur() + " + " +
        this.getOPerande2().valeur() + " : ";
    ch += this.valeur();
    return ch;
  }
}
