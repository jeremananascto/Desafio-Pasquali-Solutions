package Support;

import lombok.Getter;

import java.util.Random;

public class Utils {


    private static final Random random = new Random();

    // ... outros métodos da classe


    public static String gerarTextoAleatorio() {
        int length = 10; // Defina o comprimento desejado do texto
        StringBuilder textoAleatorio = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char caractere = (char) (random.nextInt(26) + 'a');
            textoAleatorio.append(caractere);
        }
        return textoAleatorio.toString();
    }

    public static int gerarUserIdAleatorio() {
        return random.nextInt(10000) + 1; // Gera um userId aleatório entre 1 e 10000
    }

    public static int gerarUserIdNegativoAleatorio() {
        return -random.nextInt(10000) - 1; // Gera um userId negativo aleatório entre -1 e -10000
    }

    // ... outros métodos da classe
}

