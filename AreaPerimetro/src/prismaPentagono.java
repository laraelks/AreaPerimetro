/** Inicio codificación: LAE - 14/12/2021  **/

public class prismaPentagono {
    pentagono basePentagono;
    double altura;

    prismaPentagono(double baseP, double altura){

        basePentagono= new pentagono(baseP);
        this.altura=altura;
    }

    public double area(){
        return basePentagono.perimetro()*this.altura + 2*this.basePentagono.area();
    }

    public double volumen(){
        return basePentagono.area() * this.altura;
    }
}

/** Fin codificación: LAE - 14/12/2021 */  
