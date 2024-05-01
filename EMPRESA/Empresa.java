abstract class Empresa {
    //atributos de la clase padre
    protected int peso;
    protected int dimension;
     
    public Empresa(int peso, int dimension){
        this.peso=peso;
        this.dimension=dimension;
    }
    public int getPeso(){
        return peso;
    }
    public int getDimension(){
        return dimension;
    }
    public abstract double calcularCosto();
}
