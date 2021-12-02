public class triangulo {

    private double base;
    private double altura;
    
    void triangulo (double base, double altura){

     this.base=base;
     this.altura=altura;
    }

    public double area(){

    return ((this.base*this.altura)/2);

    }

    public double perimetro(){
   
    return (this.base+(this.altura*2));

    }
}
