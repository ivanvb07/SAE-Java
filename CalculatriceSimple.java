import java.util.*;

public class CalculatriceSimple {

    public static void main(String[] args) {

        Nombre n1 = new Nombre(4);
        System.out.println(n1);

        Nombre n2 = new Nombre(0);
        System.out.println(n2);

        Operation o1 = new Addition(n1,n2);
        Addition a=(Operation)o1;
        System.out.println(o1);

        Operation o2 = new Soustraction(n1,n2);
        Soustraction s=(Operation)o2;
        System.out.println(o2);

        Operation o3 = new Multiplication(n1,n2);
        System.out.println(o3);

        try {
            Operation o4 = new Division(n1,n2);
            System.out.println(o4);
        }

        catch(ArithmeticException e){
            System.out.println("Erreur : divison par zéro" + e);
        }
    }
}
