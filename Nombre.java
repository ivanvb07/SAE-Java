public class Nombre { //initialisation de la classe Nombre

    private int valeurNombre; //attribut de classe valeurNombre de type int

    public Nombre(){ //constructeur par défaut
        this.valeurNombre = 0; //valeur par défaut
    }

    public Nombre(int nb){ //constructeur champ-à-champ
        this.valeurNombre = nb; //valeur ajoutée en paramètre
    }

    public Nombre(Nombre n){ //constructeur par copie
        this.valeurNombre=n.valeur(); //récupére la valeur de l'objet Nombre passé en paramètre
    }
    
    public int valeur(){ //méthode renvoyant la valeur de l'objet Nombre courant (this)
        return this.valeurNombre;
    }

    public String toString(){ //méthode toString
        String ch="Valeur du nombre : ";
        ch+=this.valeur(); //appel de la méthode valeur() pour récupérer la valeur du nombre courant (this)
        return ch;
    }
}
