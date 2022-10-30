package Section3_TiposPrimitivosEnJava;


import java.util.Scanner;

/*
    @author Alex Treviño
 */
public class TiposPrimitivos {
    
    public static void main(String args[]) {
        /*
            Tipos primitivos enteros: byte, short, int, long
         */
        byte numeroByte = (byte) 129;
        System.out.println("----------BYTE----------");
        System.out.println("numeroByte: " + numeroByte);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);        
        System.out.println("\n");

        short numeroShort = (short)32768;
        System.out.println("----------SHORT----------");
        System.out.println("numeroShort: " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);        
        System.out.println("\n");

        int numeroInt = (int)2147483648L;
        System.out.println("----------INT----------");
        System.out.println("numeroInt: " + numeroInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);   
        System.out.println("\n");
                
        long numeroLong = 9223372036854775807L;
        System.out.println("----------LONG----------");
        System.out.println("numeroLong: " + numeroLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
        System.out.println("\n");

         /*
            Tipos primitivos de tipo flotantes: float y double
         */
        float numeroFloat = 3.4028235E38F;
        System.out.println("----------FLOAT----------");
        System.out.println("numeroFloat: " + numeroFloat);
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);
        System.out.println("\n");
        
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("----------DOUBLE----------");
        System.out.println("numeroDouble: " + numeroDouble);
        System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);
        System.out.println("\n");
    }
    
}
