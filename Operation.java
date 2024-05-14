public abstract class Operation{
    
    private Nombre nombre1;
    private Nombre nombre2;

    public Operation(Nombre nb1, Nombre nb2){
        this.nombre1=nb1;
        this.nombre2=nb2;
    }

    public abstract int valeur();

    public Nombre getOPerande1(){
        return this.nombre1;
    }

    public Nombre getOPerande2(){
        return this.nombre2;
    }

}
