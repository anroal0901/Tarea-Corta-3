public class Triangulo extends Figura implements Comparable<Triangulo>{
    
    private double base;
    private double altura;

    public Triangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }

    public double calcularArea(){
        return (base * altura)/2;
    }

    public int numeroLados(){
        return 3;
    }

    //implementacion del metodo compareTo
    public int compareTo(Triangulo triPorComparar){
        double areaPorComparar = triPorComparar.calcularArea(); 
        double miArea = this.calcularArea();
        if(miArea==areaPorComparar){
            if (triPorComparar.numeroLados() == this.numeroLados()){
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