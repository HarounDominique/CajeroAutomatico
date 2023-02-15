public class Cajero {
    private int localidades;

    public synchronized void sumarLocalidades(int localidades){
        this.localidades = localidades++;
    }
    public synchronized int  mostrarLocalidades(){
        return this.localidades;
    }

    
}
