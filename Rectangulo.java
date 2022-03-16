public class Rectangulo extends Figura implements Comparable<Figura> {
    
    private double base;
    private double altura;
    private double lados;

    public Rectangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
        lados = 4;
    }

    public double calcularArea(){
        return base * altura;
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