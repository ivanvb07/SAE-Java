public class Nombre { //initialisation de la classe Nombre

    private int valeurNombre; //attribut de classe valeurNombre de type int

    public Nombre(int nb){ //constructeur champ-à-champ
        this.valeurNombre = nb;
    }

    public int valeur(){ //méthode renvoyant la valeur de l'objet Nombre
        return this.valeurNombre;
    }

    public String toString(){ //méthode toString
        String ch="Valeur du nombre : ";
        ch+=this.valeur();
        return ch;
    }
}
