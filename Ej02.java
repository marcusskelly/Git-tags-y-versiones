package sesion04;

import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        if (edad >=18){
            System.out.println("Mayor de edad ");
        }else{
            System.out.println("Menor de edad ");
        }
        if(edad >18 && edad<65){
            System.out.println("work in progress");
        }
        if(edad==67){
            System.out.println("jubilable");
        }
        if(edad > 67){
            System.out.println("jubilado");
        }
    }
}
