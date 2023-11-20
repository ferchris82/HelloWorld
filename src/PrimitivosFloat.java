public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 2.12E3F; //2120F;
        float realFloat2 = 0.00000000015F; //1.5E-10f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("realFloat2 = " + realFloat2);

        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("minimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("minimo valor para double = " + Double.MIN_VALUE);
        
        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
