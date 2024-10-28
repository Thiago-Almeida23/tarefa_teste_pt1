package br.com.thiago;

import java.util.List;
import java.util.stream.Collectors;

public class NomeUtils {
    public static List<String> filtrarNomesFemininos(List<String> nomes) {
        return nomes.stream()
                .filter(nome -> nome.contains(" - F"))
                .collect(Collectors.toList());
    }
}

