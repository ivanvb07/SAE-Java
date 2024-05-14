public class Division extends Operation{ //initialisation de la classe Multiplication héritant d'Operation
  
    public Division(){ //constructeur par défaut
      super(); //appel du constructeur par défaut de Operation
    }
  
    public Division(Nombre nb1, Nombre nb2){
        super(nb1,nb2); //appel du constructeur de la classe Operation
    }

    public int valeur() {//renvoie le résultat de la division des deux nombres
        return this.getOPerande1()/this.getOPerande2();
    }

    public String toString(){ //méthode toString
        String ch="Résultat de "+ this.getOPerande1() +" ÷ " + 
        this.getOPerande2() + " : ";
        ch+=this.valeur();
        return ch;
    }
}
