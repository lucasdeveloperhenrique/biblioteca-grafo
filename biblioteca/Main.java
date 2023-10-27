import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Criar instâncias de bandas e músicas
        Banda metallica = new Banda("Metallica");
        metallica.adicionarDisco(new Disco("Enter Sandman"));
        metallica.adicionarDisco(new Disco("Master of Puppets"));

        Banda nirvana = new Banda("Nirvana");
        nirvana.adicionarDisco(new Disco("Smells Like Teen Spirit"));
        nirvana.adicionarDisco(new Disco("Come As You Are"));

        Banda greenDay = new Banda("Green Day");
        greenDay.adicionarDisco(new Disco("Sgrgrfrgirit"));
        greenDay.adicionarDisco(new Disco("Cfdfdffdgdre"));

        Banda pantera = new Banda("Pantera");
       pantera.adicionarDisco(new Disco("Sgrgrfrgirit"));
        pantera.adicionarDisco(new Disco("Cfdfdffdgdre"));

        
        // Repita o processo para outras bandas e gêneros

        Genero metal = new Genero("Metal");
        metal.adicionarBanda(metallica);

        Genero grunge = new Genero("Grunge");
        grunge.adicionarBanda(nirvana);

        Genero punk = new Genero("Punk");
        punk.adicionarBanda(greenDay);

        Genero heavyMetal= new Genero("Heavy Metal");
        heavyMetal.adicionarBanda(pantera);

        BibliotecaMusical biblioteca = new BibliotecaMusical();
        biblioteca.adicionarGenero(metal);
        biblioteca.adicionarGenero(grunge);
        biblioteca.adicionarGenero(punk);
        biblioteca.adicionarGenero(heavyMetal);

        exibirMenu(biblioteca);
    }

    private static void exibirMenu(BibliotecaMusical biblioteca) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Biblioteca Musical!");
        System.out.println("Escolha uma banda para ver sua discografia:");

        int bandaIndex = 1;
        for (Genero genero : biblioteca.generos) {
            for (Banda banda : genero.bandas) {
                System.out.println(bandaIndex + ". " + banda.nome);
                bandaIndex++;
            }
        }

        int escolha;
        do {
            System.out.print("Escolha uma banda (1-" + (bandaIndex - 1) + "): ");
            escolha = scanner.nextInt();
        } while (escolha < 1 || escolha >= bandaIndex);

        exibirDiscografia(biblioteca, escolha - 1);
    }

    private static void exibirDiscografia(BibliotecaMusical biblioteca, int bandaIndex) {
        Banda bandaEscolhida = null;
        int currentIndex = 0;

        // Encontrar a banda selecionada
        outerLoop:
        for (Genero genero : biblioteca.generos) {
            for (Banda banda : genero.bandas) {
                if (currentIndex == bandaIndex) {
                    bandaEscolhida = banda;
                    break outerLoop;
                }
                currentIndex++;
            }
        }

        // Exibir discografia
        System.out.println("\nDiscografia de " + bandaEscolhida.nome + ":");
        for (Disco disco : bandaEscolhida.discos) {
            System.out.println("- " + disco.nome);
        }
    }
}
