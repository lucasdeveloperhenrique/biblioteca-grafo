import java.util.List;
import java.util.ArrayList;

public class Banda {
    String nome;
    List<Disco> discografia;

    public Banda(String nome) {
        this.nome = nome;
        this.discografia = new ArrayList<>();
    }

    public void adicionarDisco(Disco disco) {
        discografia.add(disco);
    }
}
