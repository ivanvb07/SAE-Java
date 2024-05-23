public abstract class Operation { // création de la classe abstraite Operation

    private Expression exp1; // attribut exp1 de type Expression
    private Expression exp2; // attribut exp2 de type Expression

    public Operation() { // constructeur par défaut
        this.exp1 = new Nombre(); // appel du constructeur par défaut de la classe Expression qui donnera la valeur 0
        this.exp2 = new Nombre(); // appel du constructeur par défaut de la classe Expression qui donnera la valeur 0
    }

    public Operation(Expression ex1, Expression ex2) { // constructeur champ à champ
        this.exp1 = ex1; // récupère la valeur ex1 passée en paramètre
        this.exp2 = ex2; // récupère la valeur ex2 passée en paramètre
    }

    public Operation(Operation o) { // constructeur par copie
        this.exp1 = o.getOPerande1(); // récupère la première Operande de type Expression de l'Objet o
        this.exp2 = o.getOPerande2(); // récupère la deuxième Operande de type Expression de l'Objet o
    }

    public abstract int valeur(); // définition de la méthode abstraite valeur() qui sera implémentée dans les sous-classes

    public Expression getOPerande1() { // définition de la méthode getOPerande1() qui renvoie un Objet de type Expression
        return this.nombre1; // renvoie la première Operande de type Expression de l'Objet courant
    }

    public Expression getOPerande2() { // définition de la méthode getOPerande2() qui renvoie un Objet de type Expression
        return this.nombre2; // renvoie la deuxième Operande de type Expression l'Objet courant
    }

}

