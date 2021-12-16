public class prismacuadrado {
    private double lado;
    private double altura;
    cuadrado baseCuadrado;

    prismacuadrado(double lado,double altura){
        baseCuadrado=new cuadrado(lado);
        this.altura=altura;
    }

    public double area(){
        return baseCuadrado.perimetro()*this.altura+2*this.baseCuadrado.area();
    }
    public double volumen(){

      return baseCuadrado.area()*this.altura;  
    }

}