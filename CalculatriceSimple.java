public class CalculatriceSimple {

    public static void main(String[] args) {

        Nombre n1 = new Nombre(5);
        System.out.println(n1);

        Nombre n2 = new Nombre(3);
        System.out.println(n2);

        Nombre n3 = new Nombre(0);
        System.out.println(n3);

        Operation o1 = new Addition(n1, n2);
        System.out.println(o1);

        Operation o2 = new Soustraction(n1, n2);
        System.out.println(o2);

        Operation o3 = new Multiplication(n1, n2);
        System.out.println(o3);

        Operation o4 = new Division(n1, n2);
        System.out.println(o4);

        try {
            Operation o5 = new Division(n1, n3);
            System.out.println(o5);
        }

        catch (ArithmeticException e) {
            System.out.println("Erreur " + e + " : division par zéro");
        }
    }
}
