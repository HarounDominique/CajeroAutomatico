public class Main {
    public static void main(String[] args) {
        Cajero c = new Cajero();
        Terminal t1 = new Terminal(c, "t1");
        Terminal t2 = new Terminal(c, "t2");
        Terminal t3 = new Terminal(c, "t3");


    }
}