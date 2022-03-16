import java.util.Arrays;

public class Geometria {
    public static void main(String[] args) throws Exception {
        Figura[] figs = new Figura[12];

        figs[0] = new Rectangulo(2.5, 3.0);
        figs[1] = new Rectangulo(1.7, 2.2);
        figs[2] = new Rectangulo(2.8, 1.2);
        figs[3] = new Rectangulo(3.5, 1.2);

        figs[4] = new Circulo(2);
        figs[5] = new Circulo(3);
        figs[6] = new Circulo(4);
        figs[7] = new Circulo(5);

        figs[8] = new Triangulo(2, 4);
        figs[9] = new Triangulo(4, 6);
        figs[10] = new Triangulo(3, 6);
        figs[11] = new Triangulo(3, 5);

        Arrays.sort(figs);
        
        System.out.println(figs[0].calcularArea()); 
        
    }
}
