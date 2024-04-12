public class Contador {

    public Contador(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int value;


    public void zerar(){
        setValue(0);
        System.out.println("Valor do contador zerado: " + getValue());
    }

    public void incrementar(){
        setValue(getValue()+1);
        System.out.println("Valor do contador incrementado: " + getValue());
    }

    public void retornarValorContador(){
        System.out.println("Valor do contador: " + getValue());
    }
}
