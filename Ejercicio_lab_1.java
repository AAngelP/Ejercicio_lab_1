import java.util.*;
public class Ejercicio_lab_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b=1;
        do{
            System.out.println("    Menu   ");
            System.out.println("1.- Division.");
            System.out.println("2.- Multiplicasion.");
            System.out.println("3.- Factorial.");
            System.out.println("4.- Salir.");
            System.out.println("2.- Seleccione una opcion ");
            a = scanner.nextInt();
            switch(a){
                case 1:
                    Division();
                break;
                case 2:
                    Multiplicacion();
                break;
                case 3:
                    Factorial();
                break;
                case 4:
                    b=0;
                break;
                default:
                System.out.println("El valor no es valido");
            }
            
        }while(b==1);
    }
    private static void Division(){
        Scanner scanner = new Scanner(System.in);
        int a,b,c=0,d;
        System.out.println("Introdusca el valor del dividendo");
        a = scanner.nextInt();
        System.out.println("Introdusca el valor del divisor");
        b = scanner.nextInt();
        d=a;
        while(a>=b){
            a-=b;
            c++;
        }
        System.out.println("La division de "+d+"/"+b+" es: "+c);
    }
    private static void Multiplicacion(){
        Scanner scanner = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Introdusca los valores");
        a = scanner.nextInt();
        b = scanner.nextInt();
        d=b;
        for(c=1;c<a;c++){
            d+=b;
        }
        System.out.println("La multiplicacion de "+a+"x"+b+" es: "+d);
    }
    private static void Factorial(){
        Scanner scanner = new Scanner(System.in);
        int a,b,facto;
        System.out.println("Introdusca un numero");
        a = scanner.nextInt();
        b=a-1;
        for(facto=a;b>0;b--){
            facto*=b;
        }
        System.out.println("El factorial de "+a+" es: "+facto);
    }
}

