public class cuadrado {
    private double lado;

     cuadrado(double lado){
        this.lado=lado;
    }

    public double area(){
    return(this.lado*this.lado);
    }
    public double perimetro(){
        return(4*this.lado);
    }
}
