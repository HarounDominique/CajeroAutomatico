public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cajero c = new Cajero();
        Terminal t1 = new Terminal(c, "t1");
        Terminal t2 = new Terminal(c, "t2");
        Terminal t3 = new Terminal(c, "t3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}