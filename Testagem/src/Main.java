import br.com.thiago.NomeUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> nomes = List.of(
                "Raul - M",
                "Raolita - F",
                "Ana - F",
                "Carlos - M",
                "Marina - F"
        );

        System.out.println("Lista de nomes: " + nomes);

        List<String> nomesFemininos = NomeUtils.filtrarNomesFemininos(nomes);

        System.out.println("Nomes Femininos: " + nomesFemininos);
    }
}
