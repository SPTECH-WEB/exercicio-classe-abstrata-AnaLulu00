package school.sptech;
import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public void adicionar(Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double soma = 0.0;
        for (Figura figura : figuras) {
            soma = soma + figura.calcularArea();

        }
        return soma;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        ArrayList<Figura> figuraList = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20) {
                figuraList.add(figura);
            }
        }
        return figuraList;
    }

    public List<Figura> buscarQuadrados(){
        ArrayList<Figura> quadradinhos = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura instanceof Quadrado){
                quadradinhos.add(figura);
            }
        } return quadradinhos;
    }

}
