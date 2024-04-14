import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Continente {

    private String nome;
    private ArrayList<String> pais;
    private Map<String, Long> populacao = new HashMap<String,Long>();
    private Map<String, Integer> dimensao = new HashMap<String,Integer>();


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

    public void setPopulacao(){
        populacao.put( "América do Sul", 433000000L);
        populacao.put( "América do Norte", 596000000L);
        populacao.put( "Antártica", 0L);
        populacao.put( "Ásia", 4677000000L);
        populacao.put( "África", 1373000000L);
        populacao.put( "Europa", 747000000L);
        populacao.put( "Oceania", 42700000L);
    }

    public void setDimensao(){
        dimensao.put( "América do Sul", 17840000);
        dimensao.put( "América do Norte", 24710000);
        dimensao.put( "Antártica", 14000000);
        dimensao.put( "Ásia", 44580000);
        dimensao.put( "África", 30370000);
        dimensao.put( "Europa", 10180000);
        dimensao.put( "Oceania", 9008500);
    }

    public void dimensaoContinente(){
        setDimensao();
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
        setPopulacao();
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

    public void densidadePopulacional(){
        switch (getNome()){
            case "América do Sul":
                System.out.println("Aproximadamente 24 pessoas por quilômetro quadrado (2022)");
                break;
            case "América do Norte":
                System.out.println("Aproximadamente 24 pessoas por quilômetro quadrado (2022)");
                break;
            case "Antártica":
                System.out.println("Não tem uma população residente permanente, então a densidade populacional é praticamente zero.");
                break;
            case "Ásia":
                System.out.println("Aproximadamente 105 pessoas por quilômetro quadrado (2022)");
                break;
            case "África":
                System.out.println("Aproximadamente 45 pessoas por quilômetro quadrado (2022)");
                break;
            case "Europa":
                System.out.println("Aproximadamente 73 pessoas por quilômetro quadrado (2022)");
                break;
            case "Oceania":
                System.out.println("Aproximadamente 5 pessoas por quilômetro quadrado (2022)");
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }

    public void maiorPopulacao(){
        Long maiorValor = null;
        String continente = null;

        for (Map.Entry<String, Long> entry : populacao.entrySet()) {
            Long valor = entry.getValue();
            if (maiorValor == null || valor > maiorValor) {
                maiorValor = valor;
                continente = entry.getKey();
            }
        }
        System.out.println("O continente da"+ continente + " possui maior população estimada em " + maiorValor +" número de pessoas");
    }

    public void menorPopulacao(){
        Long menorValor = null;
        String continente = null;

        for (Map.Entry<String, Long> entry : populacao.entrySet()) {
            Long valor = entry.getValue();
            if (menorValor == null || (valor < menorValor && valor !=0)) {
                menorValor = valor;
                continente = entry.getKey();
            }
        }
        System.out.println("O continente da"+ continente + " possui menor população estimada em " + menorValor +" número de pessoas");
    }

    public void maiorDimensao(){
        Integer maiorValor = null;
        String continente = null;

        for (Map.Entry<String, Integer> entry : dimensao.entrySet()) {
            Integer valor = entry.getValue();
            if (maiorValor == null || valor > maiorValor) {
                maiorValor = valor;
                continente = entry.getKey();
            }
        }
        System.out.println("O continente da "+ continente + " possui maior dimensão estimada em aproximadamente" +
                " em " + maiorValor +" km²");
    }

    public void menorDimensao(){
        Integer menorValor = null;
        String continente = null;

        for (Map.Entry<String, Integer> entry : dimensao.entrySet()) {
            Integer valor = entry.getValue();
            if (menorValor == null || valor < menorValor) {
                menorValor = valor;
                continente = entry.getKey();
            }
        }
        System.out.println("O continente da "+ continente + " possui menor dimensão estimada em aproximadamente" +
                " em " + menorValor +" km²");
    }

    public void razaoTerritorial(){
        Integer menorValor = null;
        Integer maiorValor = null;
        String continenteMenor = null;
        String continenteMaior = null;

        for (Map.Entry<String, Integer> entry : dimensao.entrySet()) {
            Integer valor = entry.getValue();
            if (menorValor == null || valor < menorValor) {
                menorValor = valor;
                continenteMenor = entry.getKey();
            }
            if (maiorValor == null || valor > maiorValor) {
                maiorValor = valor;
                continenteMaior = entry.getKey();
            }
        }

        Integer razaoTerritorial = (maiorValor / menorValor);

        System.out.println("A razão territorial entre o continente "+continenteMaior+" (maior) e o continente " +
                continenteMenor + " (menor) equivale à ≈ " +razaoTerritorial);
    }
}
