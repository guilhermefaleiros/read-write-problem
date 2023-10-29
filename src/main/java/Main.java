public class Main {

    public static void main(String[] args) {
        final Resource resource = new Resource();

        for (int i = 0; i < 6; i++) {
            new Thread(new Writer(resource), "Escritor " + i + 1).start();
        }

        for (int i = 0; i < 6; i++) {
            new Thread(new Reader(resource), "Leitor " + i + 1).start();
        }

    }
}
