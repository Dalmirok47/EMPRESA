public class Empresa2 {
    //atributos
    protected String ciudad;
    protected String contenido;
    protected double kilogramo= 1.98;
    protected  double EnvioSeguro=0.30;
    protected String id;
    protected String nombre;
    protected int edad;
    protected int TipoDePaquete;
    protected double CostoEnvio;
    protected double peso;
    protected  double dimensiones;
   

    public Empresa2(String ciudad, String contenido, double kilogramo, double EnvioSeguro, String id,String nombre, int edad, int TipoDePaquete,double CostoEnvio, double peso, double dimensiones){
        this.ciudad=ciudad;
        this.contenido=contenido;
        this.kilogramo=kilogramo;
        this.EnvioSeguro=EnvioSeguro;
        this.id=id;
        this.nombre=nombre;
        this.edad=edad;
        this.TipoDePaquete=TipoDePaquete;
        this.CostoEnvio=CostoEnvio;
        this.peso=peso;
        this.dimensiones=dimensiones;
      
    }
    public String getCiudad(){
        return ciudad;
    }
    public String getContenido(){
        return contenido;
    }
    public double geKilogramo(){
        return kilogramo;
    }
    public double geEnvioSeguro(){
        return EnvioSeguro;
    }
    public String getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public int getTipoDePaquete(){
        return TipoDePaquete;
    }
    public double getCostoEnvio(){
        return CostoEnvio;
    }
    public double getPeso(){
        return peso;
    }
    public double getDimensiones(){
        return dimensiones;
    }
   
}
