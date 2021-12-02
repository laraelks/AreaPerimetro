import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        cuadrado cuadrado;
        double area,perimetro;

        int opcion;
        System.out.println("CALCULADORA DE AREA Y PERIMETRO");
        System.out.println("========================================");
        System.out.println("Elige entre los siguientes poligonos: ");
        System.out.println("1-> Triangulo");
        System.out.println("2-> Rectangulo");
        System.out.println("3-> Circulo");
        System.out.println("4-> Pentagono");
        System.out.println("5-> Cuadrado");
        System.out.println("6-> Hexagono");
        opcion=s.nextInt();

        switch(opcion){
            case 1:
            System.out.print("introduce el lado: ");
            double ladoT=s.nextDouble();
            break;
            case 2:
            System.out.print("introduce el lado: ");
            double ladoR=s.nextDouble();
            break;
            case 3:
            System.out.print("introduce el radio: ");
            double radio=s.nextDouble();
            break;
            case 4:
            System.out.print("introduce el lado: ");
            double ladoP=s.nextDouble();
            break;
            case 5:
            System.out.print("introduce el lado: ");
            double ladoC=s.nextDouble();
            cuadrado=new cuadrado(ladoC);
             area=cuadrado.area();
            

            break;

        }


    }
}
