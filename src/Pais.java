import java.util.ArrayList;
import java.util.Scanner;

public class Pais extends Continente{

    public Pais(String nome) {
        super(nome);
    }

    public Pais() {
    }

    public void addPais(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> paises = new ArrayList<>();

        System.out.println("Digite o nome dos países que pertençam ao continente " + getNome() + ". Para sair, pressione 0.");
        String nomePais = scanner.next();
        paises.add(nomePais);
        setPais(paises);

        while(!nomePais.equals("0")){
            System.out.println("Digite os nomes dos países que pertençam ao continente " + getNome() +". Para sair, pressione 0.");
            nomePais = scanner.next();
            if(!nomePais.equals("0")){
                paises.add(nomePais);
                setPais(paises);
            }
        }
    }

    public void mostrarPaises(){
        System.out.println(getPais());
    }
}
