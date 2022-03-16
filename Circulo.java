public class Circulo extends Figura implements Comparable<Figura>{

    private double radio;
    private double lados;

    public Circulo(double pradio) {
        radio = pradio;
        lados = 0;
    }

    public double calcularArea(){
        return (Math.PI) * (Math.pow(radio, 2));
    }

    public double numeroLados(){
        return lados;
    }

    //implementacion del metodo compareTo
    public int compareTo(Figura figPorComparar){
        double areaPorComparar = figPorComparar.calcularArea(); 
        double miArea = this.calcularArea();
        if(miArea==areaPorComparar){
            if (figPorComparar.numeroLados() == this.numeroLados()){
                return 2;
                //Retorna 2 si tiene la misma area y el mismo numero de lados
            }
            return 0;
        }
        else if (miArea > areaPorComparar){
            return 1;
        }
        else{
            return -1;
        }
    }
}