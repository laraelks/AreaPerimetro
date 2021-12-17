import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        cuadrado cuadrado;
        hexagono hexagono;

    /** Inicio codificación: LAE - 03/12/2021  **/
        pentagono pentagono;
        circulo circulo;
    /** Fin codificación: LAE - 03/12/2021  **/        
        double area,perimetro, altura, alturap, volumen, ladoR;

        int opcion=0;

        while(opcion != 7){
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
            prismaTriangulo  prismaT= new prismaTriangulo(ladoT, altura, alturap);
            area= prismaT.area();
            volumen= prismaT.volumen();
            System.out.printf( "El área es %.2f y el volumen es %.2f\n",area,volumen);
            break;


            case 2:
            System.out.print("introduce el lado: ");
            ladoR=s.nextDouble();
            System.out.print("introduce la altura: ");
            altura= s.nextDouble();
            System.out.print("introduce la altura del prisma: ");
            alturap= s.nextDouble();
            prismaRectangulo prismaR = new prismaRectangulo(ladoR, altura,alturap);
            area= prismaR.area();
            volumen= prismaR.volumen();
            System.out.printf( "El área es %.2f y el volumen es %.2f\n",area,volumen);
          break;
            /** Fin codificación: RMA - 14/12/2021  **/ 

            /** Inicio codificación: LAE - 14/12/2021  **/
            case 3:
            System.out.print("introduce el radio: ");
            double radio=s.nextDouble();
            System.out.print("introduce la altura del prisma: ");
            alturap= s.nextDouble();
            cilindro cilindroC = new cilindro(alturap, radio);
            area = cilindroC.area();
            volumen = cilindroC.volumen();
            System.out.printf( "El área es %.2f y el volumen es %.2f \n", area,volumen);
            /** Fin codificación: LAE - 14/12/2021  **/ 
            break;

            case 4:
            System.out.print("introduce el lado: ");
            double ladoP=s.nextDouble();
            /** Inicio codificación: LAE - 14/12/2021  **/
            System.out.print("introduce la altura del prisma: ");
            alturap= s.nextDouble();
            prismaPentagono prismaP= new prismaPentagono(alturap, ladoP);
            area = prismaP.area();
            volumen = prismaP.volumen();
            System.out.printf( "El área es %.2f y el volumen es %.2f \n", area,volumen);
            /** Fin codificación: LAE - 14/12/2021  **/ 
            break;

            case 5:
            System.out.print("introduce el lado: ");
            double ladoC=s.nextDouble();
            System.out.print("introduce la altura del prisma: ");
            alturap= s.nextDouble();
            prismacuadrado prismaC = new prismacuadrado(ladoC,alturap);
            cuadrado=new cuadrado(ladoC);
            area=prismaC.area();
            volumen=prismaC.volumen();
            System.out.printf("el area es %.2f y el volumen es %.2f \n ",area,volumen); 
            break;

            case 6:
            System.out.print("introduce el lado: ");
            double ladoH=s.nextDouble();
            System.out.print("introduce altura del prisma: ");
            alturap=s.nextDouble();
            prismahexagono prismaH = new prismahexagono(ladoH,alturap);
            area=prismaH.area();
            volumen=prismaH.volumen();
            System.out.printf("el area es %.2f y el volumen es %.2f \n ",area,volumen); 
            break;
            }
          
          
        }

    
    }
}
