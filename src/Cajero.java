public class Cajero {
    //Localidades vendidas TOTALES:
    private int localidades;

    public synchronized void sumarLocalidades(){
        this.localidades++;
    }
    public synchronized int  mostrarLocalidades(){
        return this.localidades;
    }

    public Cajero() {

    }
}
