/** Inicio codificación: LAE - 02/12/2021  **/

public class circulo{ 

    private double radio;

    circulo(double radio){
        this.radio = radio;
    }

    public double area() {
        return (Math.PI * Math.pow(this.radio, 2));
    } 
    
    public double perimetro(){
        return (2 * Math.PI * this.radio);
    }
    
}

/** Fin codificación: LAE - 02/12/2021 */  
