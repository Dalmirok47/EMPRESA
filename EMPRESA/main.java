public class main {
    public static void main(String[] args) {
        //haremos un polimorfismo
        Empresa Elpaquete= new PaqueteEstandar(22, 8);
        System.out.println("El costo de un paquete estandar es de: $" +Elpaquete.calcularCosto());

        Empresa ElDocumento= new Documento(60, 10);
        System.out.println("El costo de un paquete con documento es de: $" +ElDocumento.calcularCosto());


        Empresa Articulo= new Articulo(16, 5, true);
        System.out.println("El costo de un paquete de articulo es de: $"+Articulo.calcularCosto());
    }
}
