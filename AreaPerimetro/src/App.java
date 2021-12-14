import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        cuadrado cuadrado;
        hexagono hexagono;

    /** Inicio codificación: LAE - 03/12/2021  **/
        pentagono pentagono;
        circulo circulo;
    /** Fin codificación: LAE - 03/12/2021  **/        
        double area,perimetro, altura, alturap, volumen;

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
        System.out.println("7->Salir");
        opcion=s.nextInt();
 /** Inicio codificación: RMA- 14/12/2021  **/
        switch(opcion){
            
            case 1:
            System.out.print("introduce el lado: ");
            double ladoT=s.nextDouble();
            System.out.print("introduce la altura: ");
            altura= s.nextDouble();
            System.out.print("introduce la altura del prisma: ");
            alturap= s.nextDouble();
            prismaTriangulo  prismaT= new prismaTriangulo(ladoT, altura,alturap);
            area= prismaTriangulo.area();
            volumen= prismaTriangulo.perimetro();
            System.out.printf( "El área es %.2f y el perímetro es %.2f\n",area,volumen);
            break;


            case 2:
            System.out.print("introduce el lado: ");
            double ladoR=s.nextDouble();
            System.out.print("introduce la altura: ");
            altura= s.nextDouble();
            System.out.print("introduce la altura del prisma: ");
            alturap= s.nextDouble();
            prismaRectangulo prismaR = new prismaRectangulo(ladoR, altura,alturap);
            area= prismaRectangulo.area();
            volumen= prismaRectangulo.area();
            System.out.printf( "El área es %.2f y el perímetro es %.2f\n",area,volumen);
          break;
            /** Fin codificación: RMA - 14/12/2021  **/ 

            case 3:
            System.out.print("introduce el radio: ");
            double radio=s.nextDouble();
            /** Inicio codificación: LAE - 03/12/2021  **/
            circulo = new circulo(radio);
            area = circulo.area();
            perimetro = circulo.perimetro();
            System.out.printf( "El área es %.2f y el perímetro es %.2f \n", area,perimetro);
            /** Fin codificación: LAE - 03/12/2021  **/ 
            break;
            case 4:
            System.out.print("introduce el lado: ");
            double ladoP=s.nextDouble();
            /** Inicio codificación: LAE - 03/12/2021  **/
            pentagono = new pentagono(ladoP);
            area = pentagono.area();
            perimetro = pentagono.perimetro();
            System.out.printf( "El área es %.2f y el perímetro es %.2f \n", area,perimetro);
            /** Fin codificación: LAE - 03/12/2021  **/ 
            break;
            case 5:
            System.out.print("introduce el lado: ");
            double ladoC=s.nextDouble();
            cuadrado=new cuadrado(ladoC);
            area=cuadrado.area();
            perimetro=cuadrado.perimetro();
            System.out.printf("el area es %.2f y el perimetro es %.2f \n ",area,perimetro); 
            break;
            case 6:
            System.out.print("introduce el lado: ");
            double ladoH=s.nextDouble();
            hexagono=new hexagono(ladoH);
            area=hexagono.area();
            perimetro=hexagono.perimetro();
            System.out.printf("el area es %.2f y el perimetro es %.2f \n ",area,perimetro); 
            break;
        }


    }
}
