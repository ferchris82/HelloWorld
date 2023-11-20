public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));
        
        char simbolo = '@';
        System.out.println("simbolo = " + decimal);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte:" + System.getProperty("line.separator") + Character.BYTES);
        System.out.println("char corresponde en byte:" + espacio + Character.BYTES);
        System.out.println("char corresponde en byte:" + retroceso + Character.BYTES);
        System.out.println("char corresponde en byte:" + tabulador + Character.BYTES);
        System.out.println("char corresponde en byte:" + nuevaLinea + Character.BYTES);
        System.out.println("char corresponde en byte:" + retornoCarro + Character.BYTES);

        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("Character.Min_Value = " + Character.MIN_VALUE);
        System.out.println("Character.Max_Value = " + Character.MAX_VALUE);
    }
}
