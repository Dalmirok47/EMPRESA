public class Documento extends Empresa{
// aqui se esta haciendo la herencia
    public Documento(int peso, int dimension){
        super(peso, dimension);
    }
    //se usa porque se esta sobre escribiendo el constructor
    @Override
    public double calcularCosto(){
        return peso * 14 + dimension* 3;
    }
}
