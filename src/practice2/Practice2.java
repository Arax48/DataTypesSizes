package practice2;

import java.util.Scanner;

public class Practice2{
    
    
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        char c;
        boolean bo;
        
        // Lecturas
        
        System.out.print("Escribe un byte[-128,127]: ");
        b = read.nextByte();
        
        System.out.print("Escribe un short(-32k,32k): ");
        s = read.nextShort();
        
        System.out.print("Escribe un int(+- 10^9): ");
        i = read.nextInt();
        
        System.out.print("Escribe un long: ");
        l = read.nextLong();
        
        System.out.print("Escribe un float: ");
        f = read.nextFloat();
        
        System.out.print("Escribe un double: ");
        d = read.nextDouble();
        
        System.out.print("Escribe un char: ");
        c = read.next().charAt(0);
        
        System.out.print("Escribe un booleano: ");
        bo = read.nextBoolean();
        
        // Impresiones
        
        System.out.println("\nEste es tu Byte: " + b + " y pesa: " + Byte.BYTES + " Bytes");
        System.out.println("Este es tu Short: " + s + " y pesa: " + Short.BYTES + " Bytes");
        System.out.println("Este es tu Int: " + i + " y pesa: " + Integer.BYTES + " Bytes");
        System.out.println("Este es tu Long: " + l + " y pesa: " + Long.BYTES + " Bytes");
        System.out.println("Este es tu Float: " + f + " y pesa: " + Float.BYTES + " Bytes");
        System.out.println("Este es tu Double: " + d + " y pesa: " + Double.BYTES + " Bytes");
        System.out.println("Este es tu Char: " + c + " y pesa: " + Character.BYTES + " Bytes");
        System.out.println("Este es tu Bool: " + bo + " y pesa: " + Byte.BYTES + " Bytes"); // Como el tamaño de bool no esta definido se almacena como byte 125
    }
    