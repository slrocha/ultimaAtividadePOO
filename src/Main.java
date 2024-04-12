import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Contador contador = new Contador(10);
        contador.retornarValorContador();
        contador.incrementar();
        contador.zerar();*/


        Continente continente = new Continente();
        String c = continente.escolherContinente();

        Pais pais = new Pais(c);
        pais.addPais();
        pais.mostrarPaises();

        continente.dimensaoContinente();
        continente.populacaoContinente();

    }
}
