/** Inicio codificación: LAE - 02/12/2021  **/

public class pentagono {
    
    private double lado;
    private double apotema;

    void pentagono(double lado, double apotema){
        this.lado = lado;
        this.apotema = apotema;
    }

    public double area() {
        return (((5 * this.lado) * apotema)/2);
    } 

    public double perimetro(){
        return (5 * this.lado);
    }

}

/** Fin codificación: LAE - 02/12/2021 */ 
