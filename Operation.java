public abstract class Operation { // création de la classe abstraite Operation

    private Nombre nombre1; // attribut nombre 1 de type nombre
    private Nombre nombre2; // attribut nombre 2 de type nombre

    public Operation() { // constructeur par défaut
        this.nombre1 = new Nombre(); // appel du constructeur par défaut de la classe Nombre qui donnera la valeur 0
        this.nombre2 = new Nombre(); // appel du constructeur par défaut de la classe Nombre qui donnera la valeur 0
    }

    public Operation(Nombre nb1, Nombre nb2) { // constructeur champ à champ
        this.nombre1 = nb1; // récupère la valeur nb1 passée en paramètre
        this.nombre2 = nb2; // récupère la valeur nb2 passée en paramètre
    }

    public Operation(Operation o) { // constructeur par copie
        this.nombre1 = o.getOPerande1(); // récupère la première Operande de type Nombre de l'Objet o
        this.nombre2 = o.getOPerande2(); // récupère la deuxième Operande de type Nombre de l'Objet o
    }

    public abstract int valeur(); // définition de la méthode abstraite valeur() qui sera implémentée dans les sous-classes

    public Nombre getOPerande1() { // définition de la méthode getOPerande1() qui renvoie un Objet de type Nombre
        return this.nombre1; // renvoie la première Operande de type Nombre de l'Objet courant
    }

    public Nombre getOPerande2() { // définition de la méthode getOPerande2() qui renvoie un Objet de type Nombre
        return this.nombre2; // renvoie la deuxième Operande de type Nombre l'Objet courant
    }

}

