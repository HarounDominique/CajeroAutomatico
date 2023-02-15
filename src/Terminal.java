public class Terminal extends Thread{
    private String nombre;
    private Cajero cajero;
    private int localidadesVendidas = 0;
    public Terminal(Cajero cajero, String nombre) {
        this.cajero = cajero;
        this.nombre = nombre;
    }
    public void run(){
        try{
            while(localidadesVendidas < 20000){
                cajero.sumarLocalidades();
                localidadesVendidas++;
                System.out.println("Se han vendido: "+cajero.mostrarLocalidades()+" localidades.");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(nombre+" ha vendido todas las localidades.");
    }
}
