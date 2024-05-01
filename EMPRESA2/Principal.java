public class Principal {
    
    
    public static void main(String[] args) {
        Paquetes PAQ=new Paquetes(null, null, 1.98, 0.30, null, null, 0, 0, 0, 0, 0);
     PAQ.envios();
     System.out.println("-----FLEX-----");
     
     System.out.print("ID:  "+PAQ.id+" \nCONTENIDO: " +PAQ.contenido+ "  \nCIUDAD DE ENTREGA: " +PAQ.ciudad +  "\nNOMBRE:  "+PAQ.nombre+  "\nEDAD: " + PAQ.edad+   "\nVALOR TOTAL DEL ENVIO: " +"$"+  PAQ.CostoEnvio );
     
        
    }
}
