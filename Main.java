public class Main {
    public static void main(String[] args) {
        Esfera bola = new Esfera();
        bola.setRaio(5);
        System.out.println("Volume = " + bola.calcularVolume());
        System.out.println("Área = " + bola.calcularArea());
    }
}