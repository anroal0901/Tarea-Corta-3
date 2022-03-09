public class Rectangulo extends Figura implements Comparable<Rectangulo> {
    
    private double base;
    private double altura;

    public Rectangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }

    public double calcularArea(){
        return base * altura;
    }

    public int numeroLados(){
        return 4;
    }

    //implementacion del metodo compareTo
    public int compareTo(Rectangulo rectPorComparar){
        double areaPorComparar = rectPorComparar.calcularArea(); 
        double miArea = this.calcularArea();
        if(miArea==areaPorComparar){
            if (rectPorComparar.numeroLados() == this.numeroLados()){
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