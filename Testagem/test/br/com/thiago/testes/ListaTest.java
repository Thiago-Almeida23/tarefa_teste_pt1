package br.com.thiago.testes;

import br.com.thiago.NomeUtils;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ListaTest {

    @Test
    public void testFiltrarNomesFemininos() {
        List<String> nomes = List.of(
                "Raul - M",
                "Raolita - F",
                "Ana - F",
                "Carlos - M",
                "Marina - F"
        );

        List<String> resultado = NomeUtils.filtrarNomesFemininos(nomes);

        assertEquals(3, resultado.size(), "A lista deve conter 3 nomes femininos.");

        assertTrue(resultado.contains("Raolita - F"), "A lista deve conter 'Raolita - F'.");
        assertTrue(resultado.contains("Ana - F"), "A lista deve conter 'Ana - F'.");
        assertTrue(resultado.contains("Marina - F"), "A lista deve conter 'Marina - F'.");
    }
}
