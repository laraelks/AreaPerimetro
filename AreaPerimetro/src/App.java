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
        System.out.println("CALCULADORA DE AREA Y VOLUMEN");
        System.out.println("========================================");
        System.out.println("Elige entre los siguientes poligonos: ");
        System.out.println("1-> Prisma de triangulo");
        System.out.println("2-> Prisma de rectangulo");
        System.out.println("3-> Cilindro");
        System.out.println("4-> Prisma Pentagonal");
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
            volumen= prismaTriangulo.volumen();
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
            volumen= prismaRectangulo.volumen();
            System.out.printf( "El área es %.2f y el perímetro es %.2f\n",area,volumen);
          break;
            /** Fin codificación: RMA - 14/12/2021  **/ 

            case 3:
            System.out.print("introduce el radio: ");
            double radio=s.nextDouble();
            /** Inicio codificación: LAE - 14/12/2021  **/
            System.out.print("introduce la altura del prisma: ");
            alturap= s.nextDouble();
            cilindro cilindroC = new cilindro(alturap, radio);
            area = cilindro.area();
            volumen = cilindro.volumen();
            System.out.printf( "El área es %.2f y el perímetro es %.2f \n", area,volumen);
            /** Fin codificación: LAE - 14/12/2021  **/ 
            break;

            case 4:
            System.out.print("introduce el lado: ");
            double ladoP=s.nextDouble();
            /** Inicio codificación: LAE - 14/12/2021  **/
            System.out.print("introduce la altura del prisma: ");
            alturap= s.nextDouble();
            prismaPentagono prismaP= new prismaPentagono(alturap, ladoP)
            area = prismaPentagono.area();
            volumen = prismaPentagono.volumen();
            System.out.printf( "El área es %.2f y el perímetro es %.2f \n", area,volumen);
            /** Fin codificación: LAE - 14/12/2021  **/ 
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
