 /** Inicio codificación: RMA- 13/12/2021  **/
 public class prismaTriangulo{
triangulo baseTriangulo;
double altura;

prismaTriangulo( double baseT, double alturaH, double altura){

    baseTriangulo= new triangulo (baseT, alturaH);
    this.altura = altura;

}

public double area(){
return baseTriangulo.perimetro ()* this.altura+2*this.baseTriangulo.area();

}

public double volumen (){

    return baseTriangulo.area*this.altura;
}
 }
  /** Fin codificación: RMA- 14/12/2021  **/