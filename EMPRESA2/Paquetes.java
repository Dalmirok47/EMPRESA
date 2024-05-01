import java.util.Scanner;
//esta es la clase hija
public class Paquetes extends Empresa2 {
//aqui se hace la herencia
  public Paquetes(String ciudad,String contenido, double kilogramo,double EnvioSeguro, String id, String nombre, int edad, int TipoDePaquete, double peso, double dimensiones,double CostoEnvio) {
    super(ciudad, contenido, kilogramo, EnvioSeguro, id, nombre, edad, TipoDePaquete, CostoEnvio, peso, dimensiones);
  }

  public void envios() {
    //aqui se pediran datos al usuario
    Scanner db = new Scanner(System.in);
    System.out.println("Bienvenido a Envios Flex");

    System.out.println("Digitame tu documento de identidad:  TI o CC");
    id = db.nextLine();

    System.out.println("¿Que objeto quiere transportar?");
    contenido= db.nextLine();

    System.out.println("¿En que ciudad se encuentra?");
    ciudad= db.nextLine();


    System.out.println("Digite su nombre completo");
    nombre = db.nextLine();

    System.out.println("Digite tu edad ");
    edad = db.nextInt();


    System.out.println( "DIgite el tipo de paquete que nesecite:  \n 1:Paquete estandar  \n2:Paquete con documento \n3:Paquete con articulo");
    TipoDePaquete = db.nextInt();

  

    if (TipoDePaquete == 1) {
      System.out.println("Digite el peso y dimensiones para calcular el precio de envio");
      dimensiones = db.nextInt();
      peso = db.nextInt();
      CostoEnvio = peso * kilogramo* dimensiones* EnvioSeguro;//para calcular el envio

    } else {
      if (TipoDePaquete == 2) {
        System.out.println("Digite el peso y dimensiones para calcular el precio de envio");
        dimensiones = db.nextInt();
        peso = db.nextInt();
        CostoEnvio = peso * kilogramo* dimensiones* EnvioSeguro;//para calcular el envio
        
      } else {
        if (TipoDePaquete == 3) {
          System.out.println("Digite el peso y dimensiones para calcular el precio de envio");
          dimensiones = db.nextInt();
          peso = db.nextInt();
          CostoEnvio = peso * kilogramo* dimensiones* EnvioSeguro;//para calcular el envio

        } else {
          System.out.println("Este tipo de paquete no es valido!!!");
          
        }

        }

      }
             //este condicional es para que cuando el usuario digite cualquiera de estos 3 numeros le saldra el mensaje de abajo
    if (TipoDePaquete == 1 || TipoDePaquete == 2 || TipoDePaquete == 3) {
      System.out.println("EL valor del envio es: " + "$"+ CostoEnvio);
    }

  }
}
