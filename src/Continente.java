import java.util.ArrayList;
import java.util.Scanner;

public class Continente {

    private String nome;
    private ArrayList<String> pais;

    public Continente(String nome) {
        this.nome = nome;
    }

    public Continente() {
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getPais() {
        return pais;
    }

    public void setPais(ArrayList<String> pais) {
        this.pais = pais;
    }

    public String escolherContinente(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um continente:");
        System.out.println("1 - América do Sul");
        System.out.println("2 - América do Norte");
        System.out.println("3 - Antártica");
        System.out.println("4 - Ásia");
        System.out.println("5 - África");
        System.out.println("6 - Europa");
        System.out.println("7 - Oceania");
        int option = scanner.nextInt();
        String continente = null;

        while(option <= 8 && option != 0) {
            switch (option) {
                case 1:
                    continente = "América do Sul";
                    setNome(continente);
                    return continente;
                case 2:
                    continente = "América do Norte";
                    setNome(continente);
                    return continente;
                case 3:
                    continente = "Antártica";
                    setNome(continente);
                    return continente;
                case 4:
                    continente = "Ásia";
                    setNome(continente);
                    return continente;
                case 5:
                    continente = "Áfria";
                    setNome(continente);
                    return continente;
                case 6:
                    continente = "Europa";
                    setNome(continente);
                    return continente;
                case 7:
                    continente = "Oceania";
                    setNome(continente);
                    return continente;
                default:
                    System.out.println("Escolha uma opção válida.");
            }

            System.out.println("Escolha um continente:");
            System.out.println("1 - América do Sul");
            System.out.println("2 - América do Norte");
            System.out.println("3 - Antártica");
            System.out.println("4 - Ásia");
            System.out.println("5 - África");
            System.out.println("6 - Europa");
            System.out.println("7 - Oceania");
            option = scanner.nextInt();
        }
        return continente;
    }

    public void dimensaoContinente(){

        switch (getNome()){
            case "América do Sul":
                System.out.println("Dimensão da América do Sul: 17.840.000 km²");
                break;
            case "América do Norte":
                System.out.println("Dimensão da América do Norte: 24.710.000 km²");
                break;
            case "Antártica":
                System.out.println("Dimensão da Antártica: 14.000.000 km²");
                break;
            case "Ásia":
                System.out.println("Dimensão da Ásia: 44.580.000 km²");
                break;
            case "África":
                System.out.println("Dimensão da África: 30.370.000 km²");
                break;
            case "Europa":
                System.out.println("Dimensão da Europa: 10.180.000 km²");
                break;
            case "Oceania":
                System.out.println("Dimensão da Oceania: 9.008.500 km²");
                break;
            default:
                System.out.println("Dimensão da Continente não reconhecido");
        }
    }

    public void populacaoContinente(){
        switch (getNome()){
            case "América do Sul":
                System.out.println("Aproximadamente 433 milhões de pessoas (2022)");
                break;
            case "América do Norte":
                System.out.println("Aproximadamente 596 milhões de pessoas (2022)");
                break;
            case "Antártica":
                System.out.println("Não tem uma população residente permanente.");
                break;
            case "Ásia":
                System.out.println("Aproximadamente 4.677 bilhões de pessoas (2022)");
                break;
            case "África":
                System.out.println("Aproximadamente 1.373 bilhão de pessoas (2022)");
                break;
            case "Europa":
                System.out.println("Aproximadamente 747 milhões de pessoas (2022)");
                break;
            case "Oceania":
                System.out.println(" Aproximadamente 42,7 milhões de pessoas (2022)");
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }
}
