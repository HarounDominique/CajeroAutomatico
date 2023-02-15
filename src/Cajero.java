public class Cajero {
    //Localidades vendidas TOTALES:
    private int localidades;

    public synchronized void sumarLocalidades(int localidades){
        this.localidades = localidades++;
    }
    public synchronized int  mostrarLocalidades(){
        return this.localidades;
    }

    public Cajero() {

    }
}
