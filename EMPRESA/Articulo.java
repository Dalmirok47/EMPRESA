public class Articulo extends Empresa{
    protected boolean requiereUncostoMas;
    //hacemos la herencia

    public Articulo(int peso, int dimension, boolean requiereEmbalajeEspecial ){
        super(peso, dimension);
        this.requiereUncostoMas=requiereEmbalajeEspecial;
    }
    //usamos el override porque usaremos muchas veces el mismo constructor
    @Override
    public double calcularCosto(){
        //haremos aqui un costo adicional por el envio de este paquete
        double costoMas=peso * 25 + dimension * 10;
        if(requiereUncostoMas){
            //este seria el costo adicional
           costoMas+=20;
         
        }
        return costoMas;
    
    }
}
