public class rectangulo {
    
    private double base;
    private double altura;
    
    void rectanguloCalculo( double base, double altura){
        this.base= base;
        this.altura=altura;
    }
    public double area(){

        return (this.base*this.altura);
    }
    public double perimetro(){


        return( (this.base*2)+ (this.altura*2));
    }
}