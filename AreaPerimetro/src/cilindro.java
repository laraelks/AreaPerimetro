/** Inicio codificación: LAE - 14/12/2021  **/

public class cilindro{
    circulo baseCirculo;
    double altura;

    cilindro(double radio, double alturaP){

        baseCirculo = new circulo(radio);
        this.altura = alturaP;
    }

    public double area(){
        return baseCirculo.perimetro() * this.altura + 2 * this.baseCirculo.area();

    }

    public double volumen(){
        return baseCirculo.area()*this.altura;
    }
}

/** Fin codificación: LAE - 14/12/2021 */  