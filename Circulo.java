public class Circulo extends Figura implements Comparable<Circulo>{

    private double radio;

    public Circulo(double pradio) {
        radio = pradio;
    }

    public double calcularArea(){
        return (Math.PI) * (Math.pow(radio, 2));
    }

    public int numeroLados(){
        return 0;
    }

    //implementacion del metodo compareTo
    public int compareTo(Circulo circPorComparar){
        double areaPorComparar = circPorComparar.calcularArea(); 
        double miArea = this.calcularArea();
        if(miArea==areaPorComparar){
            if (circPorComparar.numeroLados() == this.numeroLados()){
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