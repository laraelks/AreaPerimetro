public class prismahexagono {
    private double lado,alturaP;
    final double TANGENTE=0.866;


    prismahexagono(double lado,alturaP){
        basehexagono=new hexagono(lado);
        this.altura=alturaP;
    }

    public double area(){
        return basehexagono.perimetro()*this.altura+2*this.basehexagono.area();
    }
    public double volumen(){

      return basehexagono.area()*this.alturaP;  
    }
}
