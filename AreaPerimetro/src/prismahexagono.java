public class prismahexagono {
    private double alturaP;
    final double TANGENTE=0.866;
    hexagono baseHexagono;



    prismahexagono(double lado, double alturaP){
        baseHexagono=new hexagono(lado);
        this.alturaP = alturaP;
    }

    public double area(){
        return baseHexagono.perimetro()*this.alturaP+2*this.baseHexagono.area();
    }
    public double volumen(){

      return baseHexagono.area()*this.alturaP;  
    }
}
