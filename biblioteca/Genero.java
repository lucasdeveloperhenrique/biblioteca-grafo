import java.util.List;
import java.util.ArrayList;

public class Genero {
    String nome;
    List<Banda> bandas;
    List<Genero> generos;

    public Genero(String nome) {
        this.nome = nome;
        this.bandas = new ArrayList<>();
        this.generos = new ArrayList<>();
    }

    public void adicionarBanda(Banda banda) {
        bandas.add(banda);
    }

    public void adicionarGenero(Genero genero) {
        generos.add(genero);
    }
}
