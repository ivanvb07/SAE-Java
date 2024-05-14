public class Division extends Operation{ //initialisation de la classe Multiplication héritant d'Operation
  
    public Division(){ //constructeur par défaut
      super(); //appel du constructeur par défaut de Operation
    }
  
    public Division(Nombre nb1, Nombre nb2){ //constructeur champ-à-champ
        super(nb1,nb2); //appel du constructeur champ-à-champ de la classe Operation
    }
    
    public Division(Division d){ //constructeur par copie
        super(d); //appel du constructeur par copie de la classe Operation
    }
  
    public int valeur() throws ArithmeticException{ //implémentation de la méthode abstraite valeur de la classe Operation en précisant qu'elle peut déclencher une exception (division par 0)
        if (this.getOPerande1()==0 || this.getOPerande2==0 ) //vérifie si l'une des deux opérandes vaut 0 afin de traiter la division par zéro
            throw (new ArithmeticException()); //déclenche une exception de type arithmétique qui sera traitée par le main de la classe CalculatriceSimple
        return this.getOPerande1()/this.getOPerande2(); //renvoie le résultat de la division des deux opérandes de l'objet courant (this)
    }

    public String toString(){ //méthode toString
        String ch="Résultat de "+ this.getOPerande1() +" ÷ " + 
        this.getOPerande2() + " : ";
        ch+=this.valeur();
        return ch;
    }
}
