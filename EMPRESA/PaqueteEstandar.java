public class PaqueteEstandar extends Empresa {
    //aqui haremos la herencia con la clase padre
    public PaqueteEstandar(int peso, int dimension){
        super(peso, dimension);
    }
    //usamos el override porque usaremos muchas veces el mismo constructor
    @Override
    public double calcularCosto(){
      return peso *25 +dimension *6;
    }
}
