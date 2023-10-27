import java.util.List;
import java.util.ArrayList;

public class BibliotecaMusical {
    List<Genero> generos;

    public BibliotecaMusical() {
        this.generos = new ArrayList<>();
    }

    public void adicionarGenero(Genero genero) {
        generos.add(genero);
    }
}
