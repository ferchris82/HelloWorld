public class Nombre {
    public static void main(String[] args) {
        
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 11;
        System.out.println("numero = " + numero);
        boolean valor = true;
        int numero2 = 5;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero = " + numero2);

        var numero3 = "15";

        String nombre;

        nombre = "Christian";

        if(numero > 10){
            nombre = "Karina";
        }

        System.out.println("nombre = " + nombre);

        int edadPersona = 5;
        

    }
}
