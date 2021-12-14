/** Inicio codificación: RMA- 13/12/2021  **/
 public class prismaRectangulo{
rectangulo baseRectangulo;
double altura;

prismaRectangulo( double baseT, double alturaH, double altura){

    baseRectangulo= new rectangulo(baseT, alturaH);
    this.altura = altura;

}

public double area(){
return baseRectangulo.perimetro ()* this.altura+2*this.baseRectangulo.area();

}

public double volumen (){

    return baseRectangulo.area()*this.altura;
}
 }
  /** Fin codificación: RMA- 14/12/2021  **/